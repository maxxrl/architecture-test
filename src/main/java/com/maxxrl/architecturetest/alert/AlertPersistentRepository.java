package com.maxxrl.architecturetest.alert;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class AlertPersistentRepository implements AlertRepository {

    // private final AlertJPARepository alertJPARepository;
    private final AlertMockRepository alertMockRepository;

    @Override
    public List<Alert> findAll() {
        return alertMockRepository.findAll().stream().map(this::toAlert).collect(Collectors.toList());
    }

    Alert toAlert(AlertEntity alertEntity) {
        return Alert.builder().id(alertEntity.getId()).build();
    }
}
