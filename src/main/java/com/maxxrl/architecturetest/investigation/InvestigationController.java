package com.maxxrl.architecturetest.investigation;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/investigations")
public class InvestigationController {

    private final InvestigationNotificationFacade facade;

    @GetMapping
    public ResponseEntity<List<Investigation>> findAll() {
        return ResponseEntity.ok(facade.enrichedInvestigations());
    }
}
