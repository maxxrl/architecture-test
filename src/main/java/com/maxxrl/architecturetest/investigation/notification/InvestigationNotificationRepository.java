package com.maxxrl.architecturetest.investigation.notification;

import com.maxxrl.architecturetest.notification.Notification;

public interface InvestigationNotificationRepository {
    Notification findByInvestigationId(Long id);
}
