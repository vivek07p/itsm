package com.service.itsm.pojo;

import com.service.itsm.enums.ActionType;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name="ACTION_DB")
public class Action {
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

    @Column(name="COL_INDEX")
    private Integer index;

    @Column(name="WHEN_COL")
    private String when;

    @Column(name="INPUT")
    private String input;

    @Column(name="OUTPUT")
    private String output;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TABLE_REGISTRY")
    private TableRegistry tableRegistry;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TRIGGER_ID")
    private Trigger trigger;

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

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public String getWhen() {
        return when;
    }

    public void setWhen(String when) {
        this.when = when;
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
}
