package com.serenitydojo;

import org.junit.Test;

import java.util.Locale;

public class WhenWorkingWithStrings {
    @Test
    public void convertStringsToLowerCase() {
        String Name = "Elon-Musk";
        String lowerCaseName = Name.toLowerCase();
        System.out.println(lowerCaseName);
    }

    @Test
    public void convertStringsToUpperCase() {
        String Name = "Bill-Gates";
        String upperCaseName = Name.toUpperCase();
        System.out.println(upperCaseName);
    }

    @Test
    public void trimExtraSpace() {
        String Name = "     Serenity-Dojo   abc   def";
        System.out.println(Name);
        String trimSpace = Name.trim();
        System.out.println(trimSpace);
        int lengthName = trimSpace.length();
        System.out.println(lengthName);
    }

    @Test
    public void replaceText() {
        String fullName = "Joe Biden";
        String replaceFirstName = fullName.replace("Joe", "John");
        String replaceAllName = fullName.replaceAll("Joe Biden", "Donald Trump");
        System.out.println(replaceFirstName +" is replaced with " +replaceAllName);
    }
}
