package com.maxxrl.architecturetest.alert;

import com.maxxrl.architecturetest.alert.notification.AlertNotificationRepository;
import com.maxxrl.architecturetest.notification.Notification;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class AlertNotificationFacade {
    private final AlertRepository alertRepository;
    private final AlertNotificationRepository notificationRepository;

    public List<Alert> findAlertsWithMessages() {
        return alertRepository.findAll().stream().peek(alert -> {
            long id = alert.getId();
            Notification notification = notificationRepository.findByAlertId(id);
            alert.enrichMessage(notification.getMessage());
        }).toList();
    }


}
