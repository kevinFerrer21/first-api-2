package co.develhope.firstapi2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class FactorialController {

    
    @GetMapping("/factorial/{n}")
    public int factorialInfo(@PathVariable int n) {
        int factor = 1;
        for (int i = 1; i <= n; i++) {
            factor = factor * i;

        }
        return factor;
    }
}