package com.maxxrl.architecturetest.alert;

import com.maxxrl.architecturetest.investigation.Investigation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlertJPARepository extends JpaRepository<AlertEntity, Long> {
}
