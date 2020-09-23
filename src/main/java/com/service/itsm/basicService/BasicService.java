package com.service.itsm.basicService;

import com.service.itsm.pojo.*;
import com.service.itsm.role.Role;
import com.service.itsm.role.RoleMember;
import com.service.itsm.role.RoleMemberRepository;
import com.service.itsm.role.RoleRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class BasicService {

    private AccessControlRepository accessControlRepository;
    private ActionRepository actionRepository;
    private ApplicationFieldRepository applicationFieldRepository;
    private ClientScriptRepository clientScriptRepository;
    private CoreFieldRepository coreFieldRepository;
    private DBFieldRepository dbFieldRepository;
    private DisplayActionRepository displayActionRepository;
    private DisplayRuleRepository displayRuleRepository;
    private FieldRegistryRepository fieldRegistryRepository;
    private FieldWidgetRepository fieldWidgetRepository;
    private FormDesignRepository formDesignRepository;
    private LookupRepository lookupRepository;
    private TableRegistryRepository tableRegistryRepository;
    private TriggerRepository triggerRepository;
    private ValidationRepository validationRepository;
    private RoleRepository roleRepository;
    private RoleMemberRepository roleMemberRepository;

    public BasicService(AccessControlRepository accessControlRepository, ActionRepository actionRepository, ApplicationFieldRepository applicationFieldRepository, ClientScriptRepository clientScriptRepository, CoreFieldRepository coreFieldRepository, DBFieldRepository dbFieldRepository, DisplayActionRepository displayActionRepository, DisplayRuleRepository displayRuleRepository, FieldRegistryRepository fieldRegistryRepository, FieldWidgetRepository fieldWidgetRepository, FormDesignRepository formDesignRepository, LookupRepository lookupRepository, TableRegistryRepository tableRegistryRepository, TriggerRepository triggerRepository, ValidationRepository validationRepository, RoleRepository roleRepository, RoleMemberRepository roleMemberRepository) {
        this.accessControlRepository = accessControlRepository;
        this.actionRepository = actionRepository;
        this.applicationFieldRepository = applicationFieldRepository;
        this.clientScriptRepository = clientScriptRepository;
        this.coreFieldRepository = coreFieldRepository;
        this.dbFieldRepository = dbFieldRepository;
        this.displayActionRepository = displayActionRepository;
        this.displayRuleRepository = displayRuleRepository;
        this.fieldRegistryRepository = fieldRegistryRepository;
        this.fieldWidgetRepository = fieldWidgetRepository;
        this.formDesignRepository = formDesignRepository;
        this.lookupRepository = lookupRepository;
        this.tableRegistryRepository = tableRegistryRepository;
        this.triggerRepository = triggerRepository;
        this.validationRepository = validationRepository;
        this.roleRepository = roleRepository;
        this.roleMemberRepository = roleMemberRepository;
    }

    @Transactional
    public void saveRole(Role role){
         roleRepository.save(role);
    }

    @Transactional
    public void saveRoleMember(RoleMember roleMember){
        roleMemberRepository.save(roleMember);
    }

    @Transactional
    public void saveAccessControl(AccessControl accessControl){
         accessControlRepository.save(accessControl);
    }

    @Transactional
    public void saveAction(Action action){
         actionRepository.save(action);
    }

    @Transactional
    public void saveApplicationField(ApplicationField applicationField){
         applicationFieldRepository.save(applicationField);
    }

    @Transactional
    public void saveClientScript(ClientScript clientScript){
        clientScriptRepository.save(clientScript);
    }

    @Transactional
    public void saveCoreField(CoreField coreField){
        coreFieldRepository.save(coreField);
    }

    @Transactional
    public void saveDBField(DBField dbField){
        dbFieldRepository.save(dbField);
    }

    @Transactional
    public void saveDisplayAction(DisplayAction displayAction){
        displayActionRepository.save(displayAction);
    }

    @Transactional
    public void saveDisplayRule(DisplayRule displayRule){
        displayRuleRepository.save(displayRule);
    }

    @Transactional
    public void saveFieldRegistries(FieldRegistry fieldRegistry){
        fieldRegistryRepository.save(fieldRegistry);
    }


    @Transactional
    public void saveFieldWidget(FieldWidget fieldWidget){
        fieldWidgetRepository.save(fieldWidget);
    }

    @Transactional
    public void saveFormDesign(FormDesign formDesign){
         formDesignRepository.save(formDesign);
    }

    @Transactional
    public void saveLookup(Lookup lookup){
        lookupRepository.save(lookup);
    }

    @Transactional
    public void saveTableRegistrie(TableRegistry tableRegistry){
        tableRegistryRepository.save(tableRegistry);
    }

    @Transactional
    public void saveTrigger(Trigger trigger){
        triggerRepository.save(trigger);
    }

    @Transactional
    public void saveValidation(Validation validation){
        validationRepository.save(validation);
    }

    @Transactional
    public List<Role> getAllRoles(){
        return roleRepository.findAll();
    }

    @Transactional
    public List<RoleMember> getAllRoleMember(){
        return roleMemberRepository.findAll();
    }

    @Transactional
    public List<AccessControl> getAllAccessControls(){
        return accessControlRepository.findAll();
    }

    @Transactional
    public List<Action> getAllAction(){
        return actionRepository.findAll();
    }

    @Transactional
    public List<ApplicationField> getAllApplicationFields(){
        return applicationFieldRepository.findAll();
    }

    @Transactional
    public List<ClientScript> getClientScripts(){
        return  clientScriptRepository.findAll();
    }

    @Transactional
    public List<CoreField> getCoreFields(){
        return coreFieldRepository.findAll();
    }

    @Transactional
    public List<DBField> getDBField(){
        return dbFieldRepository.findAll();
    }

    @Transactional
    public List<DisplayAction> getAllDisplayAction(){
        return displayActionRepository.findAll();
    }

    @Transactional
    public List<DisplayRule> getAllDisplayRules(){
        return displayRuleRepository.findAll();
    }

    @Transactional
    public List<FieldRegistry> getAllFieldRegistries(){
        return fieldRegistryRepository.findAll();
    }


    @Transactional
    public List<FieldWidget> getAllFieldWidgets(){
        return fieldWidgetRepository.findAll();
    }

    @Transactional
    public List<FormDesign> getFormDesigns(){
        return formDesignRepository.findAll();
    }

    @Transactional
    public List<Lookup> getLookup(){
        return lookupRepository.findAll();
    }

    @Transactional
    public List<TableRegistry> getTableAllRegistries(){
        return tableRegistryRepository.findAll();
    }

    @Transactional
    public List<Trigger> getAllTrigger(){
        return triggerRepository.findAll();
    }

    @Transactional
    public List<Validation> getAllValidation(){
        return validationRepository.findAll();
    }
}
