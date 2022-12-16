package com.example.firststeps;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/customers")
public class Java17Controller {

    @GetMapping
    public List<Customer> getList() {

        String firstname = """
                Diego
                Lirio
                """;

        return List.of(
                new Customer(firstname, 35)
        );
    }
}
