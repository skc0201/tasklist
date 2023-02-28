package com.codurance.training.tasks;

import java.util.List;
import java.util.Map;

public interface AddProject {
    public Map<String, List<Task>> addProject(String cmd , Map<String, List<Task>> tasks);
}
