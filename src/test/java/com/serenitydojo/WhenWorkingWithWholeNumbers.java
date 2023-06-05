package com.serenitydojo;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class WhenWorkingWithWholeNumbers {
    @Test
    public void addingNumbersTogether(){
        int initialYear = 1985;
        int timeJump = 30;
        int targetYear = initialYear + timeJump;
        System.out.println(targetYear);
        assertThat(targetYear, equalTo(2015));
    }
}
