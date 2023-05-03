package com.maxxrl.architecturetest.investigation;

import com.maxxrl.architecturetest.investigation.notification.InvestigationNotificationRepository;
import com.maxxrl.architecturetest.notification.Notification;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class InvestigationNotificationFacade {
    private final InvestigationRepository investigationRepository;
    private final InvestigationNotificationRepository notificationRepository;

    public List<Investigation> enrichedInvestigations() {
        return investigationRepository.findAll().stream().peek(investigation -> {
            long id = investigation.getId();
            Notification notification = notificationRepository.findByInvestigationId(id);
            investigation.enrichMessage(notification.getMessage());
        }).toList();
    }


}
