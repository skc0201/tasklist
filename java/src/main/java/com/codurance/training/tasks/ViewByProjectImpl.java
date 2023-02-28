package com.codurance.training.tasks;

import java.util.List;
import java.util.Map;

public class ViewByProjectImpl implements ViewByProject{
    @Override
    public void viewByProject(Map<String, List<Task>> tasks) {
        for (Map.Entry<String, List<Task>> project : tasks.entrySet()) {
            System.out.println(project.getKey());
            for (Task task : project.getValue()) {
                System.out.printf("    [%c] %s: %s %s%n", (task.isDone() ? 'x' : ' '), task.getId(), task.getDescription(), task.getDeadline());
            }
            System.out.println();
        }
    }
}
