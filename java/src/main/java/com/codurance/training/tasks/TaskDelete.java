package com.codurance.training.tasks;

import java.util.List;
import java.util.Map;

public interface TaskDelete {
    public void deleteTask(String command , Map<String, List<Task>> tasks);
}
