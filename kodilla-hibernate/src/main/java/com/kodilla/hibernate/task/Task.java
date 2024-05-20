package com.kodilla.hibernate.task;

import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

@Entity
@Table(name = "TASKS")
public class Task {
    private Integer id;
    private String description;
    private LocalDate created;
    private Integer duration;

    public Task() {
    }

    public Task(String description, Integer duration) {
        this.description = description;
        this.created = LocalDate.now();
        this.duration = duration;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public Integer getId() {
        return id;
    }

    @Column(name = "DESCRIPTION")
    public String getDescription() {
        return description;
    }

    @NotNull
    @Column(name="CREATED")
    public Date getCreated() {
        return Date.from(created.atStartOfDay(ZoneId.systemDefault()).toInstant());
    }

    @Column(name="DURATION")
    public Integer getDuration() {
        return duration;
    }

    private void setId(Integer id) {
        this.id = id;
    }

    private void setDescription(String description) {
        this.description = description;
    }

    private void setCreated(Date created) {
        this.created = created.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }

    private void setDuration(Integer duration) {
        this.duration = duration;
    }
}