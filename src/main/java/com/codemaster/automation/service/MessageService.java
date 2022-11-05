package com.codemaster.automation.service;

import com.codemaster.automation.dto.Message;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MessageService implements IMessageService {

    @Override
    public Optional<Message> add(Message message) {
        return Optional.empty();
    }

    @Override
    public Optional<Message> get(Integer id) {
        return Optional.empty();
    }
}
