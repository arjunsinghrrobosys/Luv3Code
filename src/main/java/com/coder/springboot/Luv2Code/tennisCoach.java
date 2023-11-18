package com.coder.springboot.Luv2Code;

import org.springframework.stereotype.Component;

@Component
public class tennisCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Practice for Tennis  for 25 min !!!!!!!!!!!!!!!";
    }
}
