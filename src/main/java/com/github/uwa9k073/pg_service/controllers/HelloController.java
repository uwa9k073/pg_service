package com.github.uwa9k073.pg_service.controllers;

import com.github.uwa9k073.pg_service.services.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  private final HelloService service;

  public HelloController(HelloService service) {
    this.service = service;
  }

  @GetMapping("/v1/hello")
  public String controlHello(){
    return service.hello();
  }
}
