package com.codurance.training.tasks;

import java.util.List;
import java.util.Map;

public class AddTaskDetails  implements AddTask{

    private long lastId = 0;

    @Override
    public void addTask(String project, String description, Map<String, List<Task>> tasks) {
        List<Task> projectTasks = tasks.get(project);
        if (projectTasks == null) {
            System.out.printf("Could not find a project with the name \"%s\".", project);
            System.out.println();
            return;
        }
        projectTasks.add(new Task(nextId(), description, false ));    }

    @Override
    public long nextId() {
        return ++lastId;
    }
}
