package com.maxxrl.architecturetest.investigation;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InvestigationPersistentRepository implements InvestigationRepository {

    private final InvestigationMockRepository investigationMockRepository;

    @Override
    public List<Investigation> findAll() {
        return investigationMockRepository.findAll().stream().map(this::toInvestigation).toList();
    }

    Investigation toInvestigation(InvestigationEntity entity) {
        return Investigation.builder().id(entity.getId()).build();
    }
}
