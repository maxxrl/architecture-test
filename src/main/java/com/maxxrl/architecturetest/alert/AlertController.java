package com.maxxrl.architecturetest.alert;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/alerts")
public class AlertController {

    private final AlertNotificationFacade facade;

    @GetMapping
    public ResponseEntity<List<Alert>> findAll() {
        return ResponseEntity.ok(facade.findAlertsWithMessages());
    }
}
