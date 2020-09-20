package com.service.itsm.pojo;

import com.service.itsm.role.Role;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name="ACCESS_CONTROL")
public class AccessControl {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Type(type="uuid-char")
    @Column(name="CORE_ID", columnDefinition = "VARCHAR(255)", insertable = false, updatable = false, nullable = false)
    private UUID coreId;

    @Column(name="MACHINE_NAME",nullable = false, unique = true)
    private String machineName;


    @Column(name="ALLOW_SCRIPT")
    private String allowScript;

    @Column(name="DENY_SCRIPT")
    private String denyScript;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="ALLOW_ACCESS")
    private Role allowAccess;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="DENY_ACCESS")
    private Role denyAccess;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "FIELD_REGISTRY_ID")
    private FieldRegistry fieldRegistry;

    public UUID getCoreId() {
        return coreId;
    }

    public void setCoreId(UUID coreId) {
        this.coreId = coreId;
    }

    public String getMachineName() {
        return machineName;
    }

    public void setMachineName(String machineName) {
        this.machineName = machineName;
    }

    public String getAllowScript() {
        return allowScript;
    }

    public void setAllowScript(String allowScript) {
        this.allowScript = allowScript;
    }

    public String getDenyScript() {
        return denyScript;
    }

    public void setDenyScript(String denyScript) {
        this.denyScript = denyScript;
    }


    public Role getAllowAccess() {
        return allowAccess;
    }

    public void setAllowAccess(Role allowAccess) {
        this.allowAccess = allowAccess;
    }

    public Role getDenyAccess() {
        return denyAccess;
    }

    public void setDenyAccess(Role denyAccess) {
        this.denyAccess = denyAccess;
    }

    public FieldRegistry getFieldRegistry() {
        return fieldRegistry;
    }

    public void setFieldRegistry(FieldRegistry fieldRegistry) {
        this.fieldRegistry = fieldRegistry;
    }
}
