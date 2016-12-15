package com.d1labs.ooodetect.email.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Service to handle inbound messaging processing. Inbound messaging will allow us to enrich the model to further
 * identify if the employee is OOO or not
 */
@Service
public class InboundService {

    static Logger logger = LoggerFactory.getLogger(InboundService.class.getName());

    @Autowired
    public InboundService() {
    }

}
