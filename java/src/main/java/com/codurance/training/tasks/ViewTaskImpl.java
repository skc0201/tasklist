package com.codurance.training.tasks;

import java.text.SimpleDateFormat;
import java.util.*;

public class ViewTaskImpl implements ViewTask{
    @Override
    public void viewByToday(Map<String, List<Task>> tasks) {
        Date today = new Date();

        for (Map.Entry<String, List<Task>> project : tasks.entrySet()) {
            System.out.println(project.getKey());
            for (Task task : project.getValue()) {
                if(task.getDeadline() != null && parseDate(task.getDeadline()).equals(parseDate(today)))
                    System.out.printf("    [%c] %s: %s %s%n", (task.isDone() ? 'x' : ' '), task.getId(), task.getDescription(), parseDate(task.getDeadline()));
            }
            System.out.println();
        }
    }

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

    @Override
    public void viewByDeadline(Map<String, List<Task>> tasks) {
        Comparator<Task> compareByDate = Comparator.comparing(p -> parseDate(p.getDeadline()));

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
