package com.service.itsm.pojo;

import com.service.itsm.enums.ActionType;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name="DB_TRIGGER")
public class Trigger {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Type(type="uuid-char")
    @Column(name="CORE_ID", columnDefinition = "VARCHAR(255)", insertable = false, updatable = false, nullable = false)
    private UUID coreId;

    @Column(name="MACHINE_NAME",nullable = false, unique = true)
    private String machineName;

    @Column(name="NAME")
    private String name;

    @Column(name="ACTION_TYPE")
    private ActionType actionType;

    @Column(name="INPUT")
    private String input;

    @Column(name="OUTPUT")
    private String output;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ActionType getActionType() {
        return actionType;
    }

    public void setActionType(ActionType actionType) {
        this.actionType = actionType;
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

    public TableRegistry getTableRegistry() {
        return tableRegistry;
    }

    public void setTableRegistry(TableRegistry tableRegistry) {
        this.tableRegistry = tableRegistry;
    }
}
