package com.codurance.training.tasks;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class ViewByTodayImpl implements ViewByToday{
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

    private String parseDate(Date date) {
        SimpleDateFormat dateFormatter = new SimpleDateFormat("dd-MM-yyyy");
        return dateFormatter.format(date);
    }
}
