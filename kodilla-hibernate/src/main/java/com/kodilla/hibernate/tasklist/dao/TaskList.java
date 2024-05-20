package com.kodilla.hibernate.tasklist.dao;

import jakarta.persistence.*;

@Entity
@Table(name = "TASKLISTS")
public class TaskList {
    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Long id;

    @Column(name = "LISTNAME")
    private String listName;

    @Column(name = "DESCRIPTION")
    private String description;

    public TaskList() {
    }

    public TaskList(String listName, String description) {
        this.listName = listName;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public String getListName() {
        return listName;
    }

    public String getDescription() {
        return description;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

