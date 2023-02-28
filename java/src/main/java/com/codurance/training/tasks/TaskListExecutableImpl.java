package com.codurance.training.tasks;

import java.util.List;
import java.util.Map;

public class TaskListExecutableImpl implements  TaskListExecutable{
    @Override
    public void execute(String commandLine, Map<String, List<Task>> tasks) {
        String[] commandRest = commandLine.split(" ", 2);
        String command = commandRest[0];
        showDetails sd = new showDetails();
        AddProject addProj = new AddProjectDetails();
        AddTask addTask = new AddTaskDetails();
        TaskListHelper taskListHelper = new TaskListHelperImpl();
        TaskListError taskListError = new TaskListErrorImpl();
        TaskListChecker taskListChecker = new TaskListCheckerImpl();
        TaskDelete taskDelete = new TaskDeleteImpl();
        TaskDeadline taskDeadline = new TaskDeadlineImpl();
        ViewByDate viewByDate = new ViewByDateImpl();
        ViewByDeadline viewByDeadline = new ViewByDeadlineImpl();
        ViewByProject viewByProject = new ViewByProjectImpl();
        ViewByToday viewByToday = new ViewByTodayImpl();
        switch (command) {
            case "show":
                sd.show(tasks);
                break;
            case "add":
                String[] subcommandRest = commandRest[1].split(" ", 2);
                String subcommand = subcommandRest[0];
                if(subcommand.equals("project"))
                {
                    addProj.addProject(subcommandRest[1], tasks);
                }
                else {
                    String[] projectTask = subcommandRest[1].split(" ", 2);
                    addTask.addTask(projectTask[0], projectTask[1],tasks);
                }
                break;
            case "check":
                taskListChecker.check(commandRest[1] , tasks);
                break;
            case "uncheck":
                taskListChecker.unCheck(commandRest[1] , tasks);
                break;
            case "help":
                taskListHelper.help();
                break;
            case "delete":
                taskDelete.deleteTask(commandRest[1] , tasks);
                break;
            case "deadline":
                taskDeadline.addDeadline(commandRest[1] , tasks);
                break;
            case "today":
                viewByToday.viewByToday(tasks);
            case "view":
                if(commandRest[1].equalsIgnoreCase("by date")){
                    viewByDate.viewByDate(tasks);
                }
                else if(commandRest[1].equalsIgnoreCase("by deadline")){
                    viewByDeadline.viewByDeadline(tasks);
                } else if (commandRest[1].equalsIgnoreCase("by project")) {
        viewByProject.viewByProject(tasks);
                }
            default:
                taskListError.error(command);
                break;
        }
    }
}
