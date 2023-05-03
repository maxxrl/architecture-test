package com.maxxrl.architecturetest.notification;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class NotificationMockRepository {

    public Optional<NotificationEntity> findById(Long id) {
        NotificationEntity notificationEntity = new NotificationEntity();
        notificationEntity.setId(id);
        notificationEntity.setMessage("The message");
        return Optional.of(notificationEntity);
    }
}
