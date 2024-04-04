package com.serenitydojo;

import org.junit.Test;

public class HelloWorldWriteTest {
    @Test
    public void shouldWriteHelloWorldToTheConsole() {

        HelloWorldWriter writer = new HelloWorldWriter();
        writer.writeHelloWorld();
    }

}
