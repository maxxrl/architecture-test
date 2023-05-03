package com.maxxrl.architecturetest.notification;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;

@Data
@MappedSuperclass
public class NotificationEntity {
    @Id
    private Long id;
    private String message;
}
