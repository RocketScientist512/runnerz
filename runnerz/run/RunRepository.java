package com.example.runnerz.run;

import java.util.ArrayList;
import java.util.List;

public class RunRepository {

    private List<Run> runs = new ArrayList<>();

    List<Run> findAll(){
        return runs;
    }


}
