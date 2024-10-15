package com.coder.springboot.Luv2Code.controllers;

import com.coder.springboot.Luv2Code.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    ApplicationContext myApplicationContext;


    public DemoController(ApplicationContext applicationContext)
    {
        myApplicationContext=applicationContext;
    }

    private Coach myCoach;
    private Coach tCoach;
    // Constructor
    @Autowired
    public DemoController(@Qualifier ("tennisCoach") Coach theCoach ) {
        myCoach=theCoach;
    }
    //Setters
   /* @Autowired
    public void setMyCoach(@Qualifier ("cricketCoach") Coach mCoach ) {
        tCoach=mCoach;
    }
    *///URIs
    @GetMapping("/get/{id}")
    public String getDailyWorkout(@PathVariable String id) {
        String result =  new String();
        switch (id) {
            case "tennis":
                 result = myCoach.getDailyWorkout();
            break;
            case "cricket":
                result= tCoach.getDailyWorkout();
            break;
            default:
                result="NO DATA";

        }
        return result;

    }

    // create a new controller instance.




}
