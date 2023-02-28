package com.codurance.training.tasks;

import java.util.List;
import java.util.Map;

public class TaskListCheckerImpl  implements TaskListChecker{
    @Override
    public void check(String idString, Map<String, List<Task>> tasks) {
        setDone(idString, true , tasks);
    }

    @Override
    public void unCheck(String idString, Map<String, List<Task>> tasks) {
        setDone(idString, false , tasks);

    }

    @Override
    public void setDone(String idString, boolean done, Map<String, List<Task>> tasks) {
        int id = Integer.parseInt(idString);
        for (Map.Entry<String, List<Task>> project : tasks.entrySet()) {
            for (Task task : project.getValue()) {
                if (task.getId() == id) {
                    task.setDone(done);
                    return;
                }
            }
        }
        System.out.printf("Could not find a task with an ID of %d.", id);
        System.out.println();
    }
}
