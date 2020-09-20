package com.service.itsm.pojo;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "DISPLAY_RULE")
public class DisplayRule {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Type(type="uuid-char")
    @Column(name="CORE_ID", columnDefinition = "VARCHAR(255)", insertable = false, updatable = false, nullable = false)
    private UUID coreId;

    @Column(name="name")
    private String name;

    @Column(name="TABLE_REGISTRY")
    private String tableRegistry;

    public UUID getCoreId() {
        return coreId;
    }

    public void setCoreId(UUID coreId) {
        this.coreId = coreId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTableRegistry() {
        return tableRegistry;
    }

    public void setTableRegistry(String tableRegistry) {
        this.tableRegistry = tableRegistry;
    }
}
