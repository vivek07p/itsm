package com.service.itsm.role;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RoleMemberRepository extends JpaRepository<RoleMember, UUID> {
}
