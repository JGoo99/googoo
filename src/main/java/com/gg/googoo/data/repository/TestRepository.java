package com.gg.googoo.data.repository;

import com.gg.googoo.data.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends JpaRepository<TestEntity, Long> {
}
