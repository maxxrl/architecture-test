package com.maxxrl.architecturetest.alert;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Entity
@NoArgsConstructor
@Data
public class AlertEntity {

    @Id
    private Long id;

}
