package com.maxxrl.architecturetest.investigation;

import com.maxxrl.architecturetest.alert.AlertEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Stream;

@RequiredArgsConstructor
@Service
public class InvestigationMockRepository {

    public List<InvestigationEntity> findAll() {
        InvestigationEntity investigationEntity = new InvestigationEntity();
        investigationEntity.setId(1L);
        return Stream.of(investigationEntity).toList();
    }
}
