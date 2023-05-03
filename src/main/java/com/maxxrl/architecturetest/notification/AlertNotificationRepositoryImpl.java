package com.maxxrl.architecturetest.notification;

import com.maxxrl.architecturetest.alert.notification.AlertNotificationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AlertNotificationRepositoryImpl implements AlertNotificationRepository {

    // private final NotificationJPARepository notificationJPARepository;
    private final NotificationMockRepository notificationMockRepository;

    @Override
    public Notification findByAlertId(Long id) {
        Optional<NotificationEntity> notificationEntityOptional = notificationMockRepository.findById(id);
        return notificationEntityOptional.map(this::toNotification).orElse(null);
    }

    Notification toNotification(NotificationEntity notificationEntity) {
        return Notification.builder().id(notificationEntity.getId()).message(notificationEntity.getMessage()).build();
    }
}
