package com.codurance.training.tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AddProjectDetails implements  AddProject{
    @Override
    public Map<String, List<Task>> addProject(String cmd, Map<String, List<Task>> tasks) {
        tasks.put(cmd, new ArrayList<Task>());
        return tasks;
    }
}
