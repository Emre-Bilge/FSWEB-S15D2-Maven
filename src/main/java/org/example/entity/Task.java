package org.example.entity;

import java.util.Objects;

public class Task {

    private String project;
    private String description;
    private String assignee;
    private Status status;
    private Priority priority;


    public Task(String project, String description, String assignee,Status status, Priority priority ) {
        this.project = project;
        this.description = description;
        this.assignee = assignee;
        this.status = status;
        this.priority = priority;

    }

    public String getProject() {
        return project;
    }

    public String getDescription() {
        return description;
    }

    public String getAssignee() {
        return assignee;
    }

    public Status getStatus() {
        return status;
    }

    public Priority getPriority() {
        return priority;
    }

    // project ve description a göre bakılacağı için ikisine göre yazıldı.
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(project, task.project) && Objects.equals(description, task.description);
    }
//equals olunca bunuda yazıyorum .
    @Override
    public int hashCode() {
        return Objects.hash(project, description);
    }
//hepsinde yazıyorum .
    @Override
    public String toString() {
        return "Task{" +
                "project='" + project + '\'' +
                ", description='" + description + '\'' +
                ", assignee='" + assignee + '\'' +
                ", status=" + status +
                ", priority=" + priority +
                '}';
    }
}
