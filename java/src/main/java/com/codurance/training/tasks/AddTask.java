package com.codurance.training.tasks;

import java.util.List;
import java.util.Map;

public interface AddTask {
    public void addTask(String proj , String Desc , Map<String, List<Task>> tasks);
    public long nextId();
}
