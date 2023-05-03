package com.maxxrl.architecturetest.alert.notification;

import com.maxxrl.architecturetest.notification.Notification;

public interface AlertNotificationRepository {
    Notification findByAlertId(Long id);
}
