package com.codurance.training.tasks;

import java.util.List;
import java.util.Map;

public class showDetails implements Show{
    public void show(Map<String, List<Task>> tasks){
        for (Map.Entry<String, List<Task>> project : tasks.entrySet()) {
            System.out.println(project.getKey());
            for (Task task : project.getValue()) {
                System.out.printf("    [%c] %d: %s%n", (task.isDone() ? 'x' : ' '), task.getId(), task.getDescription());
            }
            System.out.println();
        }
    }
}
