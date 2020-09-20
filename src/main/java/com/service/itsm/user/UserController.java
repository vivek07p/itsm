package com.service.itsm.user;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/user")
public class UserController {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    private BCryptPasswordEncoder passwordEncoder;
    private UserService userService;
    private final AuthenticationManagerBuilder authManagerBuilder;

    public UserController(BCryptPasswordEncoder passwordEncoder, UserService userService, AuthenticationManagerBuilder authManagerBuilder) {
        this.passwordEncoder = passwordEncoder;
        this.userService = userService;
        this.authManagerBuilder = authManagerBuilder;
    }

    @PostMapping("sign-up")
    public void signUp(@RequestBody User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userService.save(user);
    }

    @PostMapping("update")
    public void update(@RequestBody User user) {
        userService.save(user);
    }

    @PostMapping("login")
    public ResponseEntity<String> authorize(@RequestBody User user) {
        logger.debug("User signing in");
        UsernamePasswordAuthenticationToken authenticationToken =
                new UsernamePasswordAuthenticationToken(user.getEmailId(), user.getPassword());

        Authentication authentication = authManagerBuilder.getObject().authenticate(authenticationToken);
        SecurityContextHolder.getContext().setAuthentication(authentication);
        String jwt = createToken(authentication, false);
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Authorization", "Bearer " + jwt);
        return new ResponseEntity<>(jwt, httpHeaders, HttpStatus.OK);
    }
    private String createToken(Authentication authentication, boolean rememberMe) {
        String authorities = authentication.getAuthorities().stream()
                .map(GrantedAuthority::getAuthority)
                .collect(Collectors.joining(","));

        long now = (new Date()).getTime();
        Date validity  = new Date(now + 1800L);

        return Jwts.builder()
                .setSubject(authentication.getName())
                .claim("Authorization", authorities)
                .signWith(SignatureAlgorithm.HS512, "SECRET")
                .setExpiration(validity)
                .compact();
    }

    @GetMapping("user-list")
    public List<User> getAllUser(){
        return userService.getAllUsers();
    }


    @GetMapping("get/{emailId}")
    public User getUser(@PathVariable("emailId") String emailId){
        return userService.getByEmailId(emailId);
    }

    @GetMapping("get/uuid/{uuid}")
    public User getUserByUUID(@PathVariable("uuid") String uuid){
        return userService.getByUUID(uuid);
    }


}
