package com.cyberia.sigev.repository;

import com.cyberia.sigev.model.CondominiumEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CondominiumRepository extends JpaRepository<CondominiumEntity, Long> {
}
