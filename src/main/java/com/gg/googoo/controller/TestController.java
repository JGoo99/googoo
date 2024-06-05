package com.gg.googoo.controller;

import com.gg.googoo.data.TestEntity;
import com.gg.googoo.service.TestServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TestController {
  private final TestServiceImpl testService;

  @PostMapping("/test/{number}")
  public TestEntity test(@PathVariable Integer number) {
    return testService.add(number);
  }
}
