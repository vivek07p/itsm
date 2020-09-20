package com.service.itsm.pojo;

import com.service.itsm.enums.ValidationType;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name="VALIDATION")
public class Validation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Type(type="uuid-char")
    @Column(name="CORE_ID", columnDefinition = "VARCHAR(255)", insertable = false, updatable = false, nullable = false)
    private UUID coreId;

    @Column(name="MACHINE_NAME",nullable = false, unique = true)
    private String machineName;

    @Column(name="VALIDATION_TYPE")
    private ValidationType type;

    @Column(name="ALERT_TYPE")
    private ValidationType alertType;

    @Column(name="INPUT")
    private String input;

    @Column(name="OUTPUT")
    private String output;

    @Column(name="SCRIPT")
    private String script;

    @Column(name="EXPRESSION")
    private String expression;

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

    public ValidationType getType() {
        return type;
    }

    public void setType(ValidationType type) {
        this.type = type;
    }

    public ValidationType getAlertType() {
        return alertType;
    }

    public void setAlertType(ValidationType alertType) {
        this.alertType = alertType;
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

    public String getScript() {
        return script;
    }

    public void setScript(String script) {
        this.script = script;
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }
}
