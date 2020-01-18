package com.weborders.step_definitions;

import com.weborders.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.util.concurrent.TimeUnit;

public class Hooks {


    @Before
    public void setup (){
        Driver.get().manage().window().maximize();
        Driver.get();
        Driver.close();
        Driver.get().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

    }
    //after hook
    //will close browser after every test
    @After
    public void teardown(){
        Driver.close();
    }
}
