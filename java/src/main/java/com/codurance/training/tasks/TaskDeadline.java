package com.codurance.training.tasks;

import java.util.List;
import java.util.Map;

public interface TaskDeadline {
    public void addDeadline(String command , Map<String, List<Task>> tasks);
}
