package com.gg.googoo.service;

import com.gg.googoo.data.TestEntity;
import com.gg.googoo.data.repository.TestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TestServiceImpl {
  private final TestRepository testRepository;

  public TestEntity add(Integer number) {
    return testRepository.save(TestEntity.builder().number(number).build());
  }
}
