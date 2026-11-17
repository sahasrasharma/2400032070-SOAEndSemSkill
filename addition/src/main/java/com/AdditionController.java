
package com.example.additionservice;

import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
public class AdditionController {

    @GetMapping("/addition")
    public Map<String, Integer> add(
            @RequestParam int a,
            @RequestParam int b) {

        return Map.of("result", a + b);
    }
}
