package com.gg.googoo.controller;

import com.gg.googoo.data.TestEntity;
import com.gg.googoo.service.TestServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TestController {
  private final TestServiceImpl testService;

  @GetMapping("/test")
  public List<TestEntity> test() {
    return testService.findAll();
  }
}
