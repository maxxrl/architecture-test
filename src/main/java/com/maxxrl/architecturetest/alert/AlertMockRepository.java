package com.maxxrl.architecturetest.alert;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Stream;

@RequiredArgsConstructor
@Service
public class AlertMockRepository {

    public List<AlertEntity> findAll() {
        AlertEntity alertEntity = new AlertEntity();
        alertEntity.setId(1L);
        return Stream.of(alertEntity).toList();
    }
}
