package org.example.todo;

public class Todo {
    Integer id;
    String name;
    String summary;
    String discription;

    public Todo() {

    }

    public Todo(Integer id, String name, String summary, String discription) {
        this.id = id;
        this.name = name;
        this.summary = summary;
        this.discription = discription;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSummary() {
        return summary;
    }

    public String getDiscription() {
        return discription;
    }
}
