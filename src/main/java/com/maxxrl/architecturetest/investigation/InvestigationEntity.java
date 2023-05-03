package com.maxxrl.architecturetest.investigation;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
@Entity
@Data
public class InvestigationEntity {
    @Id
    private Long id;
}
