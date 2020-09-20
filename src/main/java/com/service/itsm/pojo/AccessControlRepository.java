package com.service.itsm.pojo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AccessControlRepository extends JpaRepository<AccessControl, UUID> {
}
