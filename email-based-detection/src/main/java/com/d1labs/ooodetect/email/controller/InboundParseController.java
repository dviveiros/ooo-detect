package com.d1labs.ooodetect.email.controller;

import com.d1labs.ooodetect.email.service.InboundService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api/ooo-detect/v1/emails")
public class InboundParseController {

    static Logger logger = LoggerFactory.getLogger(InboundParseController.class.getName());

    private final InboundService inboundService;

    @Autowired
    public InboundParseController(InboundService inboundService) {
        this.inboundService = inboundService;
    }

    @RequestMapping(value="", method= RequestMethod.POST)
    public ResponseEntity onNewEmail(@RequestBody String postPayload) {

        logger.info( "A new email was received. Payload = " + postPayload);

        return ResponseEntity.ok().build();
    }
}
