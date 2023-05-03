package com.maxxrl.architecturetest.alert.notification;

import com.maxxrl.architecturetest.notification.NotificationEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class AlertNotificationEntity extends NotificationEntity {
    private String alertMessage;
}
