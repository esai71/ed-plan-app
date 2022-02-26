package com.sai.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sai.entity.InsuranceEntity;
@Repository
public interface InsuranceRepository extends JpaRepository<InsuranceEntity, Integer> {

}
