package com.maxxrl.architecturetest.notification;

import com.maxxrl.architecturetest.alert.notification.AlertNotificationRepository;
import com.maxxrl.architecturetest.investigation.InvestigationRepository;
import com.maxxrl.architecturetest.investigation.notification.InvestigationNotificationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class InvestigationNotificationRepositoryImpl implements InvestigationNotificationRepository {

    private final NotificationMockRepository notificationMockRepository;
    @Override
    public Notification findByInvestigationId(Long id) {
        Optional<NotificationEntity> notificationEntityOptional = notificationMockRepository.findById(id);
        return notificationEntityOptional.map(this::toNotification).orElse(null);
    }


    Notification toNotification(NotificationEntity notificationEntity) {
        return Notification.builder().id(notificationEntity.getId()).message(notificationEntity.getMessage()).build();
    }
}
