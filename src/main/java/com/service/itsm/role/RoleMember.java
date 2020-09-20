package com.service.itsm.role;

import com.service.itsm.pojo.AccessControl;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name="ROLE_MEMBER_temp")
public class RoleMember {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Type(type="uuid-char")
    @Column(name="CORE_ID", columnDefinition = "VARCHAR(255)", insertable = false, updatable = false, nullable = false)
    private UUID coreId;

    @Column(name="SOURCE")
    private String source;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="ALLOWED_ACCESS_CONTROL")
    private AccessControl allowed_accessControl;

    public UUID getCoreId() {
        return coreId;
    }

    public void setCoreId(UUID coreId) {
        this.coreId = coreId;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
}
