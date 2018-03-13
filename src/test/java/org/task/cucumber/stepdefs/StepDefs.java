package org.task.cucumber.stepdefs;

import org.task.TaskManagerApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = TaskManagerApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
