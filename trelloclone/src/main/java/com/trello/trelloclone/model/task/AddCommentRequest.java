package com.trello.trelloclone.model.task;

import lombok.Data;
import lombok.NonNull;
@Data
public class AddCommentRequest {
    @NonNull
    private long taskID;
    @NonNull
    private String comment;

    private long userID;
}
