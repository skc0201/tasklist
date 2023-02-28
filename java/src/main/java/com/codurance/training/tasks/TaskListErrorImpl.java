package com.codurance.training.tasks;

public class TaskListErrorImpl implements  TaskListError{
    @Override
    public void error(String command) {
        System.out.printf("I don't know what the command \"%s\" is.", command);
        System.out.println();
    }
}
