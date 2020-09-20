package com.service.itsm.pojo;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name="TABLE_REGISTRY")
public class TableRegistry {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Type(type="uuid-char")
    @Column(name="CORE_ID", columnDefinition = "VARCHAR(255)", insertable = false, updatable = false, nullable = false)
    private UUID coreId;

    @Column(name="MACHINE_NAME",nullable = false, unique = true)
    private String machineName;

    @Column(name="name")
    private String name;

    @Column(name="ENABLE_API")
    private boolean enableAPI;

    @ManyToOne(cascade={CascadeType.ALL})
    @JoinColumn(name="TABLE_REGISTRY_PARENT")
    private TableRegistry tableRegistryParent;

    @OneToMany(mappedBy="tableRegistryParent")
    private Set<TableRegistry> tableRegistryChildren = new HashSet<>();

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

    public boolean isEnableAPI() {
        return enableAPI;
    }

    public void setEnableAPI(boolean enableAPI) {
        this.enableAPI = enableAPI;
    }

    public TableRegistry getTableRegistryParent() {
        return tableRegistryParent;
    }

    public void setTableRegistryParent(TableRegistry tableRegistryParent) {
        this.tableRegistryParent = tableRegistryParent;
    }

    public Set<TableRegistry> getTableRegistryChildren() {
        return tableRegistryChildren;
    }

    public void setTableRegistryChildren(Set<TableRegistry> tableRegistryChildren) {
        this.tableRegistryChildren = tableRegistryChildren;
    }
}
