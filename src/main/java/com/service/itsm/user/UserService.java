package com.service.itsm.user;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Controller;

import javax.transaction.Transactional;
import java.util.List;

@Controller

public class UserService implements UserDetailsService {
    private  UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String emailId) throws UsernameNotFoundException {
        User user = userRepository.findByEmailId(emailId);
        if (user == null) {
            throw new UsernameNotFoundException(emailId);
        }
        return new UserPrinciple(user);
    }

    @Transactional
    void save(User user){
        userRepository.save(user);
     }

     List<User> getAllUsers() {
        return  userRepository.findAll();
    }

    User getByEmailId(String emailId){
        return userRepository.getOne(emailId);
    }
}
