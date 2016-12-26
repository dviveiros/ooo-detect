package com.d1labs.ooodetect.email.controller;

import com.d1labs.ooodetect.email.service.InboundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api/inbound/v1")
public class InboundParseController {

    private final InboundService inboundService;

    @Autowired
    public InboundParseController(InboundService inboundService) {
        this.inboundService = inboundService;
    }

    @RequestMapping(value="/email", method= RequestMethod.POST)
    public ResponseEntity home() {
        return ResponseEntity.ok().build();
    }
}
