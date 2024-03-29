package com.service.itsm.controllers;

import com.service.itsm.basicService.BasicService;
import com.service.itsm.pojo.*;
import com.service.itsm.role.Role;
import com.service.itsm.role.RoleMember;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/basic")
public class BasicController {
    private BasicService basicService;

    public BasicController(BasicService basicService) {
        this.basicService = basicService;
    }

    @GetMapping("role-list")
    public List<Role> getAllRoles(){
        return basicService.getAllRoles();
    }

    @GetMapping("role/{uuid}")
    public Role getAllRoles(@PathVariable("uuid") UUID uuid){
       return basicService.getRole(uuid);
    }

    @PostMapping("role")
    public void saveRole(@RequestBody Role role){
        basicService.saveRole(role);
    }

    @GetMapping("role-member-list")
    public List<RoleMember> getAllRoleMember(){
        return basicService.getAllRoleMember();
    }

    @GetMapping("roleMember/{uuid}")
    public RoleMember getAllRoleMember(@PathVariable("uuid") UUID uuid){
        return basicService.getRoleMember(uuid);
    }


    @PostMapping("role-member")
    public void saveRole(@RequestBody  RoleMember roleMember){
        basicService.saveRoleMember(roleMember);
    }

    @GetMapping("access-control-list")
    public List<AccessControl> getAllAccessControl(){
        return basicService.getAllAccessControls();
    }

    @GetMapping("access-control/{uuid}")
    public AccessControl getAccessControl(@PathVariable("uuid") UUID uuid){
        return basicService.getAccessControl(uuid);
    }

    @PostMapping("access-control")
    public void saveRole(@RequestBody  AccessControl accessControl){
        basicService.saveAccessControl(accessControl);
    }

    @GetMapping("action-list")
    public List<Action> getAllAction(){
        return basicService.getAllAction();
    }

    @GetMapping("action/{uuid}")
    public Action getAction(@PathVariable("uuid") UUID uuid){
        return basicService.getAction(uuid);
    }

    @PostMapping("action")
    public void saveRole(@RequestBody Action action){
        basicService.saveAction(action);
    }

    @GetMapping("application-field-list")
    public List<ApplicationField> getAllApplicationField(){
        return basicService.getAllApplicationFields();
    }

    @PostMapping("application-field")
    public void saveRole(@RequestBody ApplicationField applicationField){
        basicService.saveApplicationField(applicationField);
    }

    @GetMapping("application-field/{uuid}")
    public ApplicationField getApplicationField(@PathVariable("uuid") UUID uuid){
        return basicService.getApplicationField(uuid);
    }

    @GetMapping("client-script-list")
    public List<ClientScript> getAllClientScripts(){
        return basicService.getClientScripts();
    }

    @PostMapping("client-script")
    public void saveRole(@RequestBody ClientScript clientScript){
        basicService.saveClientScript(clientScript);
    }

    @GetMapping("client-script/{uuid}")
    public ClientScript getClientScript(@PathVariable("uuid") UUID uuid){
        return basicService.getClientScript(uuid);
    }

    @GetMapping("core-field-list")
    public List<CoreField> getCoreFields(){
        return basicService.getCoreFields();
    }

    @PostMapping("core-field")
    public void saveRole(@RequestBody CoreField coreField){
        basicService.saveCoreField(coreField);
    }

    @GetMapping("core-field/{uuid}")
    public CoreField getCoreField(@PathVariable("uuid") UUID uuid){
        return basicService.getCoreField(uuid);
    }

    @GetMapping("db-field-list")
    public List<DBField> getDbFields(){
        return basicService.getDBField();
    }

    @PostMapping("db-field")
    public void saveRole(@RequestBody DBField dbField){
        basicService.saveDBField(dbField);
    }

    @GetMapping("db-field/{uuid}")
    public DBField getDBField(@PathVariable("uuid") UUID uuid){
        return basicService.getDBField(uuid);
    }


    @GetMapping("display-action-list")
    public List<DisplayAction> getDisplayActions(){
        return basicService.getAllDisplayAction();
    }

    @PostMapping("display-action")
    public void saveRole(@RequestBody DisplayAction displayAction){
        basicService.saveDisplayAction(displayAction);
    }

    @GetMapping("display-action/{uuid}")
    public DisplayAction getDisplayAction(@PathVariable("uuid") UUID uuid){
        return basicService.getDisplayAction(uuid);
    }

    @GetMapping("display-rule-list")
    public List<DisplayRule> getDisplayRule(){
        return basicService.getAllDisplayRules();
    }

    @PostMapping("display-rule")
    public void saveRole(@RequestBody DisplayRule displayRule){
        basicService.saveDisplayRule(displayRule);
    }

    @GetMapping("display-rule/{uuid}")
    public DisplayRule getDisplayRule(@PathVariable("uuid") UUID uuid){
        return basicService.getDisplayRule(uuid);
    }


    @GetMapping("field-registry-list")
    public List<FieldRegistry> getAllFieldRegistry(){
        return basicService.getAllFieldRegistries();
    }

    @PostMapping("field-registry")
    public void saveRole(@RequestBody FieldRegistry fieldRegistry){
        basicService.saveFieldRegistries(fieldRegistry);
    }

    @GetMapping("field-registry/{uuid}")
    public FieldRegistry getFieldRegistry(@PathVariable("uuid") UUID uuid){
        return basicService.getFieldRegistry(uuid);
    }

    @GetMapping("field-widget-list")
    public List<FieldWidget> fieldWidgets(){
        return basicService.getAllFieldWidgets();
    }

    @PostMapping("field-widget")
    public void saveFieldWidget(@RequestBody FieldWidget fieldWidget){
        basicService.saveFieldWidget(fieldWidget);
    }

    @GetMapping("field-widget/{uuid}")
    public FieldWidget getFieldWidget(@PathVariable("uuid") UUID uuid){
        return basicService.getFieldWidget(uuid);
    }


    @GetMapping("form-design-list")
    public List<FormDesign> formDesigns(){
        return basicService.getFormDesigns();
    }

    @PostMapping("Form-design")
    public void saveRole(@RequestBody FormDesign FormDesign){
        basicService.saveFormDesign(FormDesign);
    }

    @GetMapping("Form-design/{uuid}")
    public FormDesign getFormDesign(@PathVariable("uuid") UUID uuid){
        return basicService.getFormDesign(uuid);
    }


    @GetMapping("lookup-list")
    public List<Lookup> lookupList(){
        return basicService.getLookup();
    }

    @PostMapping("lookup")
    public void saveRole(@RequestBody Lookup lookup){
        basicService.saveLookup(lookup);
    }

    @GetMapping("lookup/{uuid}")
    public Lookup getLookup(@PathVariable("uuid") UUID uuid){
        return basicService.getLookup(uuid);
    }


    @GetMapping("table-registry-list")
    public List<TableRegistry> getTableRegistries(){
        return basicService.getTableAllRegistries();
    }

    @PostMapping("table-registry")
    public void saveRole(@RequestBody TableRegistry TableRegistry){
        basicService.saveTableRegistrie(TableRegistry);
    }

    @GetMapping("table-registry/{uuid}")
    public TableRegistry getTableRegistry(@PathVariable("uuid") UUID uuid){
        return basicService.getTableRegistry(uuid);
    }

    @GetMapping("trigger-list")
    public List<Trigger> gettriggerList(){
        return basicService.getAllTrigger();
    }

    @PostMapping("trigger")
    public void saveRole(@RequestBody Trigger trigger){
        basicService.saveTrigger(trigger);
    }

    @GetMapping("trigger/{uuid}")
    public Trigger getTrigger(@PathVariable("uuid") UUID uuid){
        return basicService.getTrigger(uuid);
    }

    @GetMapping("validation-list")
    public List<Validation> getValidations(){
        return basicService.getAllValidation();
    }

    @PostMapping("validation")
    public void saveRole(@RequestBody Validation validation){
        basicService.saveValidation(validation);
    }

    @GetMapping("validation/{uuid}")
    public Validation getValidation(@PathVariable("uuid") UUID uuid){
        return basicService.getValidation(uuid);
    }
}
