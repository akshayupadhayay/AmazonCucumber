package com.bigpay.StepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import com.bigpay.BasePackage.BaseClass;
import io.cucumber.java.Scenario;

public class Hooks {

    @Before
    public void start() {
        BaseClass.setUp();
    }

    @After
    public void end(Scenario scenario) {
        BaseClass.tearDown();
    }
}
