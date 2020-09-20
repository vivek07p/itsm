package com.service.itsm.pojo;

import com.service.itsm.enums.LookupType;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name="LOOKUP")
public class Lookup {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Type(type="uuid-char")
    @Column(name="CORE_ID", columnDefinition = "VARCHAR(255)", insertable = false, updatable = false, nullable = false)
    private UUID coreId;

    @Column(name="MACHINE_NAME",nullable = false, unique = true)
    private String machineName;

    @Column(name="name")
    private String name;

    @Column(name="SCRIPT")
    private String script;

    @Column(name="LOOKUP_TYPE")
    private LookupType type;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "TABLE_REGISTRY_ID")
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

    public String getScript() {
        return script;
    }

    public void setScript(String script) {
        this.script = script;
    }

    public LookupType getType() {
        return type;
    }

    public void setType(LookupType type) {
        this.type = type;
    }

    public TableRegistry getTableRegistry() {
        return tableRegistry;
    }

    public void setTableRegistry(TableRegistry tableRegistry) {
        this.tableRegistry = tableRegistry;
    }
}
