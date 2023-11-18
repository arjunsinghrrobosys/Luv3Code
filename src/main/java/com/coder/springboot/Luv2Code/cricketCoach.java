package com.coder.springboot.Luv2Code;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class cricketCoach implements Coach{

    //Create Constructor for the Lazy constructor
    public cricketCoach(){
        System.out.println("In Constructor "+getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice for bowling for 21 min !!!!!!!!!!!!!!!";
    }
}
