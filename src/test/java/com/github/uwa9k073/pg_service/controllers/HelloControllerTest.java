package com.github.uwa9k073.pg_service.controllers;

import com.github.uwa9k073.pg_service.services.HelloService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static
    org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static
    org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static
    org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.mockito.Mockito.when;


@WebMvcTest(HelloController.class)
public class HelloControllerTest {

  @Autowired
  private MockMvc mockMvc;


  @MockBean
  private HelloService service;

  @Test
  void controlHello() throws Exception {
    when(service.hello()).thenReturn("Hello, Mock");
    mockMvc.perform(get("/v1/hello")).andExpect(status().isOk())
        .andExpect(content().string("Hello, Mock"));
  }
}