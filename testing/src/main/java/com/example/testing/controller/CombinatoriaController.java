
package com.example.testing.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CombinatoriaController {
    @RequestMapping(value="/")
    public int Combinatoria(int c) {
        int c;
        c=factorial(n)/(factorial(r)*factorial(n-r));
        return c;
    }
}


