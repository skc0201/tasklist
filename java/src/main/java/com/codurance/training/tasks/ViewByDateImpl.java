package com.codurance.training.tasks;

import java.text.SimpleDateFormat;
import java.util.*;

public class ViewByDateImpl implements ViewByDate{
    @Override
    public void viewByDate(Map<String, List<Task>> tasks) {
        Comparator<Task> compareByDate = Comparator.comparing(p -> parseDate(p.getCreationDate()));

        for (Map.Entry<String, List<Task>> project : tasks.entrySet()) {
            System.out.println(project.getKey());
            List<Task> newTasks = project.getValue();
            Collections.sort(newTasks, compareByDate);
            for (Task task : newTasks) {
                System.out.printf("    [%c] %s: %s %s%n", (task.isDone() ? 'x' : ' '), task.getId(), task.getDescription(), parseDate(task.getDeadline()));
            }
            System.out.println();
        }
    }

    private String parseDate(Date date) {
        SimpleDateFormat dateFormatter = new SimpleDateFormat("dd-MM-yyyy");
        return dateFormatter.format(date);
    }
}
