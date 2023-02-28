package com.codurance.training.tasks;

import java.util.List;
import java.util.Map;

public interface TaskListExecutable {
    public void execute(String command  ,  Map<String, List<Task>> tasks);

}
