package com.moonsteache.ngclone.dao;

import com.moonsteache.ngclone.model.HumanEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HumanRepository extends JpaRepository<HumanEntity, Integer> {
}
