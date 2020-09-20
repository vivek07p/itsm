package com.service.itsm.pojo;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name="DISPLAY_ACTION")
public class DisplayAction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Type(type="uuid-char")
    @Column(name="CORE_ID", columnDefinition = "VARCHAR(255)", insertable = false, updatable = false, nullable = false)
    private UUID coreId;

    @Column(name="MANDATORY")
    private boolean mandatory;

    @Column(name="VISIBLE")
    private boolean visible;

    @Column(name="READ_ONLY")
    private boolean readOnly;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "FIELD_REGISTRY")
    private FieldRegistry fieldRegistry;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "DISPLAY_RULE")
    private DisplayRule displayRule;

    public UUID getCoreId() {
        return coreId;
    }

    public void setCoreId(UUID coreId) {
        this.coreId = coreId;
    }

    public boolean isMandatory() {
        return mandatory;
    }

    public void setMandatory(boolean mandatory) {
        this.mandatory = mandatory;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public boolean isReadOnly() {
        return readOnly;
    }

    public void setReadOnly(boolean readOnly) {
        this.readOnly = readOnly;
    }

    public FieldRegistry getFieldRegistry() {
        return fieldRegistry;
    }

    public void setFieldRegistry(FieldRegistry fieldRegistry) {
        this.fieldRegistry = fieldRegistry;
    }

    public DisplayRule getDisplayRule() {
        return displayRule;
    }

    public void setDisplayRule(DisplayRule displayRule) {
        this.displayRule = displayRule;
    }
}
