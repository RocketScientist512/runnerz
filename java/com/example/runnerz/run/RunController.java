package com.example.runnerz.run;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RunController {

    //private List<Run> runs = new ArrayList<>();

    @GetMapping("/hello")
    String home(){
        return "Hello, Runnerz!";
    }
//Build a CRUD API to interact with the system.
}
