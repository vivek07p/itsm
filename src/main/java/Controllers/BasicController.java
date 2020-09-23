package Controllers;

import com.service.itsm.basicService.BasicService;
import com.service.itsm.pojo.*;
import com.service.itsm.role.Role;
import com.service.itsm.role.RoleMember;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
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

    @PostMapping("role")
    public void saveRole(@RequestBody Role role){
        basicService.saveRole(role);
    }


    @GetMapping("role-member-list")
    public List<RoleMember> getAllRoleMember(){
        return basicService.getAllRoleMember();
    }

    @PostMapping("role-member")
    public void saveRole(@RequestBody  RoleMember roleMember){
        basicService.saveRoleMember(roleMember);
    }

    @GetMapping("access-control-list")
    public List<AccessControl> getAllAccessControl(){
        return basicService.getAllAccessControls();
    }

    @PostMapping("access-control")
    public void saveRole(@RequestBody  AccessControl accessControl){
        basicService.saveAccessControl(accessControl);
    }

    @GetMapping("action-list")
    public List<Action> getAllAction(){
        return basicService.getAllAction();
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

    @GetMapping("client-script-list")
    public List<ClientScript> getAllClientScripts(){
        return basicService.getClientScripts();
    }

    @PostMapping("client-script")
    public void saveRole(@RequestBody ClientScript clientScript){
        basicService.saveClientScript(clientScript);
    }

    @GetMapping("core-field-list")
    public List<CoreField> getCoreFields(){
        return basicService.getCoreFields();
    }

    @PostMapping("core-field")
    public void saveRole(@RequestBody CoreField coreField){
        basicService.saveCoreField(coreField);
    }

    @GetMapping("db-field-list")
    public List<DBField> getDbFields(){
        return basicService.getDBField();
    }

    @PostMapping("db-field")
    public void saveRole(@RequestBody DBField dbField){
        basicService.saveDBField(dbField);
    }

    @GetMapping("display-action-list")
    public List<DisplayAction> getDisplayActions(){
        return basicService.getAllDisplayAction();
    }

    @PostMapping("display-action")
    public void saveRole(@RequestBody DisplayAction displayAction){
        basicService.saveDisplayAction(displayAction);
    }

    @GetMapping("display-rule-list")
    public List<DisplayRule> getDisplayRule(){
        return basicService.getAllDisplayRules();
    }

    @PostMapping("display-rule")
    public void saveRole(@RequestBody DisplayRule displayRule){
        basicService.saveDisplayRule(displayRule);
    }

    @GetMapping("field-registry-list")
    public List<FieldRegistry> getAllFieldRegistry(){
        return basicService.getAllFieldRegistries();
    }

    @PostMapping("field-registry")
    public void saveRole(@RequestBody FieldRegistry fieldRegistry){
        basicService.saveFieldRegistries(fieldRegistry);
    }

    @GetMapping("field-widget-list")
    public List<FieldWidget> fieldWidgets(){
        return basicService.getAllFieldWidgets();
    }

    @PostMapping("field-widget")
    public void saveFieldWidget(@RequestBody FieldWidget fieldWidget){
        basicService.saveFieldWidget(fieldWidget);
    }

    @GetMapping("form-design-list")
    public List<FormDesign> formDesigns(){
        return basicService.getFormDesigns();
    }

    @PostMapping("Form-design")
    public void saveRole(@RequestBody FormDesign FormDesign){
        basicService.saveFormDesign(FormDesign);
    }

    @GetMapping("lookup-list")
    public List<Lookup> lookupList(){
        return basicService.getLookup();
    }

    @PostMapping("lookup")
    public void saveRole(@RequestBody Lookup lookup){
        basicService.saveLookup(lookup);
    }

    @GetMapping("table-registry-list")
    public List<TableRegistry> getTableRegistries(){
        return basicService.getTableAllRegistries();
    }

    @PostMapping("table-registry")
    public void saveRole(@RequestBody TableRegistry TableRegistry){
        basicService.saveTableRegistrie(TableRegistry);
    }

    @GetMapping("trigger-list")
    public List<Trigger> gettriggerList(){
        return basicService.getAllTrigger();
    }

    @PostMapping("Trigger")
    public void saveRole(@RequestBody Trigger trigger){
        basicService.saveTrigger(trigger);
    }


    @GetMapping("validation-list")
    public List<Validation> getValidations(){
        return basicService.getAllValidation();
    }

    @PostMapping("validation")
    public void saveRole(@RequestBody Validation validation){
        basicService.saveValidation(validation);
    }
}
