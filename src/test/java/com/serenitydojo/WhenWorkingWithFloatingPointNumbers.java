package com.serenitydojo;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class WhenWorkingWithFloatingPointNumbers {
    @Test
    public void convertingCelsiusToFahrenheit() {
        double tempC = 23.8889;
        int tempF = (int) ((tempC * 1.8) + 32);
        System.out.println(tempC +" Celsius = " + tempF +" Fahrenheit");
        assertThat(tempF, equalTo(75));
    }

    @Test
    public void convertingKilogramsToPounds() {
        int weight_Kg = 10;
        double weight_Lbs = (int) (weight_Kg * 2.20462);
        System.out.println(weight_Kg +" kilograms = " +weight_Lbs +" lbs");
        assertThat(weight_Lbs, equalTo(22.0));
    }
}
