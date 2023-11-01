package com.trello.trelloclone.model.entity;



import com.trello.trelloclone.model.task.Status;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Exclude
    private long taskID;
    @NonNull
    private String taskName;
    private String timeCreated;
    private String ETC;
    private Status status;
    private String description;
    private String timeUpdated;
}
