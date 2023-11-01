package com.trello.trelloclone.model.entity;

import com.trello.trelloclone.model.task.Status;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TaskHistoryTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long taskHistoryID;

    private long taskID;
    @NonNull
    private String taskName;
    private String timeCreated;
    private String ETC;
    private Status status;
    private String description;
    private String timeUpdated;
    @NonNull
    private String modification;
    private String tag;
    private boolean isUndone;
}
