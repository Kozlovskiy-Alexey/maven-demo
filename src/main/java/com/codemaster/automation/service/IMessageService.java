package com.codemaster.automation.service;

import com.codemaster.automation.dto.Message;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface IMessageService {

    Optional<Message> add(Message message);

    Optional<Message> get(Integer id);
}
