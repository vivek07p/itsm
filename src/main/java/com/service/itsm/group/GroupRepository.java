package com.service.itsm.group;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface GroupRepository extends JpaRepository<Group, UUID> {
}
