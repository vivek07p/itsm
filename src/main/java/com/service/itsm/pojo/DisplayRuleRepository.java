package com.service.itsm.pojo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DisplayRuleRepository extends JpaRepository<DisplayRule, UUID> {
}
