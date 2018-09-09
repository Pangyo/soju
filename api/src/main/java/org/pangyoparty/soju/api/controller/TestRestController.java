package org.pangyoparty.soju.api.controller;

import org.pangyoparty.soju.shared.model.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestRestController {

    @Value("${message}")
    private String TEST_MESSAGE;

    @GetMapping("/test")
    public Test test() {
        Test test = new Test();
        test.setMessage(TEST_MESSAGE);
        return test;
    }
}