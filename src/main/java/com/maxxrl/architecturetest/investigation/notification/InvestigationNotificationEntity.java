package com.maxxrl.architecturetest.investigation.notification;

import com.maxxrl.architecturetest.notification.NotificationEntity;
import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class InvestigationNotificationEntity extends NotificationEntity {
    private String investigationMessage;
}
