package com.bitrix24.step_definitions;

import com.bitrix24.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setUp(){
        System.out.println("\tthis is coming from BEFORE");
    }

    @After
    public void tearDown(){

        Driver.closeDriver();
    }

//    @Before("@db")
//    public void setupDb(){
//        System.out.println("\tconnecting to Database...");
//
//    }
//
//    @After("@db")
//    public void closeDb(){
//        System.out.println("\tdisconnecting from Database...");
//
//    }
}