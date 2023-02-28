package com.codurance.training.tasks;

import java.util.List;
import java.util.Map;

public interface ViewTask {
    public void viewByToday(Map<String, List<Task>> tasks);
    public void viewByProject(Map<String, List<Task>> tasks);
    public void viewByDeadline(Map<String, List<Task>> tasks);

    public void viewByDate(Map<String, List<Task>> tasks);

}
