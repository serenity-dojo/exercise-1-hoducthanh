package com.serenitydojo;

import org.junit.Assert;
import org.junit.Test;

import java.sql.SQLOutput;

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
    public void convertingFahrenheitToCelsius() {
        int tempF = 75;
        int tempC = (int) ((tempF - 32) * ((double)5/9));
        System.out.println(tempF + " Fahrenheit = " + tempC + " Celsius");
        assertThat(tempC, equalTo(23));
    }
    @Test
    public void convertingKilogramsToPounds() {
        int weight_Kg = 10;
        int weight_Lbs = (int) (weight_Kg * 2.2);
        System.out.println(weight_Kg +" Kilograms = " +weight_Lbs +" Lbs");
        assertThat(weight_Lbs, equalTo(22));
    }

    @Test
    public void convertingPoundsToKilograms() {
        int weight_Lbs = 22;
        int weight_Kg = (int) Math.ceil(weight_Lbs * 0.45359237);
        System.out.println(weight_Lbs + " Lbs = " + weight_Kg + " Kilograms" );
        assertThat((int)weight_Kg, equalTo(10));

    }
}
