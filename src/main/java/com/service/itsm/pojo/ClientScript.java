package com.service.itsm.pojo;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name="CLIENT_SCRIPT")
public class ClientScript {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Type(type="uuid-char")
    @Column(name="CORE_ID", columnDefinition = "VARCHAR(255)", insertable = false, updatable = false, nullable = false)
    private UUID coreId;

    @Column(name="MACHINE_NAME",nullable = false, unique = true)
    private String machineName;

    @Column(name="SCRIPT")
    private String script;

    @Column(name="WHEN_COL")
    private String when;

    @Column(name="WHERE_COL")
    private String where;

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

    public String getScript() {
        return script;
    }

    public void setScript(String script) {
        this.script = script;
    }

    public String getWhen() {
        return when;
    }

    public void setWhen(String when) {
        this.when = when;
    }

    public String getWhere() {
        return where;
    }

    public void setWhere(String where) {
        this.where = where;
    }

    public TableRegistry getTableRegistry() {
        return tableRegistry;
    }

    public void setTableRegistry(TableRegistry tableRegistry) {
        this.tableRegistry = tableRegistry;
    }
}
