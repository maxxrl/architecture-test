package com.maxxrl.architecturetest.investigation;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvestigationsJPARepository extends JpaRepository<InvestigationEntity, Long> {
}
