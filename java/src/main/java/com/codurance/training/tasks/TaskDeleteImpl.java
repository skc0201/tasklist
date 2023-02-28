package com.codurance.training.tasks;

import java.util.List;
import java.util.Map;

public class TaskDeleteImpl implements TaskDelete{

    @Override
    public void deleteTask(String command, Map<String, List<Task>> tasks) {
        int id = Integer.parseInt(command);
        for (Map.Entry<String, List<Task>> project : tasks.entrySet()) {

            for (Task task : project.getValue()) {
                if (task.getId() == id) {
                project.getValue().remove(task);
                    return;
                }
            }
        }
        System.out.printf("Could not find a task with an ID of %d.", id);
        System.out.println();
    }
}
