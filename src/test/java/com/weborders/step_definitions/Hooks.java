package com.weborders.step_definitions;

import com.weborders.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {


    @Before
    public void setup (){
        Driver.get().manage().window().maximize();

    }
    //after hook
    //will close browser after every test
    @After
    public void teardown(){
        Driver.close();
    }
}
