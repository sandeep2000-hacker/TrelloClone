package com.trello.trelloclone.model.task;

import lombok.Data;

@Data
public class AddUserRequest {

    private long taskID;
    private long userID;
}
