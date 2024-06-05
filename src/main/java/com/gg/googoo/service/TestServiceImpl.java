package com.gg.googoo.service;

import com.gg.googoo.data.TestEntity;
import com.gg.googoo.data.repository.TestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TestServiceImpl {
  private final TestRepository testRepository;

  public List<TestEntity> findAll() {
    return testRepository.findAll();
  }
}
