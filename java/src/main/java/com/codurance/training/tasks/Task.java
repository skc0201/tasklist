package com.codurance.training.tasks;

import java.util.Date;

public final class Task {
    private final long id;
    private final String description;
    private boolean done;

    private Date deadline;
    private final Date dateCreated;



    public Task(long id, String description, boolean done ) {
        this.id = id;
        this.description = description;
        this.done = done;
        this.deadline = null;
        this.dateCreated = new Date();
    }

    public long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }
    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", done=" + (done ? 'X' : ' ' )+
                ", deadline=" + deadline +
                '}';
    }
    public Date getCreationDate() {
        return dateCreated;
    }
}
