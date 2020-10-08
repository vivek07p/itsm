package com.service.itsm.role;

import com.service.itsm.user.User;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name="ROLE")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Type(type="uuid-char")
    @Column(name="CORE_ID", columnDefinition = "VARCHAR(255)", insertable = false, updatable = false, nullable = false)
    private UUID coreId;

    @Column(name="MACHINE_NAME",nullable = false, unique = true)
    private String machineName;

    @Column(name="NAME")
    private String name;

    @Column(name="DESCRIPTION")
    private String description;

    @ManyToOne(cascade={CascadeType.ALL})
    @JoinColumn(name="role_parent")
    private Role roleParent;

    @OneToMany(mappedBy="roleParent")
    private Set<Role> roleChildren = new HashSet<>();

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "roles")
    private Set<User> users = new HashSet<>();

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

    public Role getRoleParent() {
        return roleParent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setRoleParent(Role roleParent) {
        this.roleParent = roleParent;
    }

    public Set<Role> getRoleChildren() {
        return roleChildren;
    }

    public void setRoleChildren(Set<Role> roleChildren) {
        this.roleChildren = roleChildren;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }
}
