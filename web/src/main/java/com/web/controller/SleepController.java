package main.java.com.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: HayLi pwx520500
 * @Date: 2021/7/20 23:16
 */
@RestController
public class SleepController {

    @GetMapping("/sleep")
    public void sleep(){
        System.out.println("Go to Bed, At Once");
    }
}
