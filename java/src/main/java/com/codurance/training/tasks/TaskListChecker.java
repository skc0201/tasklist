package com.codurance.training.tasks;

import java.util.List;
import java.util.Map;

public interface TaskListChecker {
    public void check(String command , Map<String, List<Task>> tasks);
    public void unCheck(String command , Map<String, List<Task>> tasks);

    public void setDone(String id , boolean value , Map<String, List<Task>> tasks);
}
