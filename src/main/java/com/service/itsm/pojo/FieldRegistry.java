package com.service.itsm.pojo;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name="FIELD_REGISTRY")
public class FieldRegistry {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Type(type="uuid-char")
    @Column(name="CORE_ID", columnDefinition = "VARCHAR(255)", insertable = false, updatable = false, nullable = false)
    private UUID coreId;

    @Column(name="MACHINE_NAME",nullable = false, unique = true)
    private String machineName;

    @Column(name="DEFAULT_VALUE")
    private String defaultValue;

    @Column(name="INPUT")
    private String input;

    @Column(name="OUTPUT")
    private String output;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "APPLICATION_FIELD_ID")
    private ApplicationField applicationField;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "VALIDATION_ID")
    private Validation validation;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "LOOKUP_ID")
    private Lookup lookup;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "TABLE_REGISTRY")
    private TableRegistry tableRegistry;


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

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    public ApplicationField getApplicationField() {
        return applicationField;
    }

    public void setApplicationField(ApplicationField applicationField) {
        this.applicationField = applicationField;
    }

    public Validation getValidation() {
        return validation;
    }

    public void setValidation(Validation validation) {
        this.validation = validation;
    }

    public Lookup getLookup() {
        return lookup;
    }

    public void setLookup(Lookup lookup) {
        this.lookup = lookup;
    }

    public TableRegistry getTableRegistry() {
        return tableRegistry;
    }

    public void setTableRegistry(TableRegistry tableRegistry) {
        this.tableRegistry = tableRegistry;
    }
}
