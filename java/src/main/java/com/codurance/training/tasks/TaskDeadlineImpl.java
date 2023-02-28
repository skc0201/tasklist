package com.codurance.training.tasks;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class TaskDeadlineImpl implements TaskDeadline{
    @Override
    public void addDeadline(String command, Map<String, List<Task>> tasks) {
        String[] subcommandRest = command.split(" ", 2);
        int id = Integer.parseInt(subcommandRest[0]);
        Date date = null;
        try {
            date = (Date) new SimpleDateFormat("dd-MM-yyyy").parse(subcommandRest[1]);
        }
        catch (ParseException e) {
            e.printStackTrace();
        }
        for (Map.Entry<String, List<Task>> project : tasks.entrySet()) {
            for (Task task : project.getValue()) {
                if (task.getId() == id) {
                    task.setDeadline(date);
                    return;
                }
            }
        }

    }
}
