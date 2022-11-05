package com.codemaster.automation.controler;

import com.codemaster.automation.dto.Message;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/message")
public class MessageController {

    @PostMapping
    public ResponseEntity<Message> getMessage(@RequestBody Message message) {
        return new ResponseEntity<>(message, HttpStatus.CREATED);
    }
}
