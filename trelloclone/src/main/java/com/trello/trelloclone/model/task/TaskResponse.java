package com.trello.trelloclone.model.task;

import com.trello.trelloclone.model.entity.Task;
import com.trello.trelloclone.model.entity.UserDetails;
import lombok.Data;

import java.util.List;

@Data
public class TaskResponse {
    private Task task;
    private List<String> comments;
    private List<UserDetails> userDetails;
}
