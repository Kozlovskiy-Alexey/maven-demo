package com.codemaster.automation.repository;

import com.codemaster.automation.entity.MessageEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMessageRepository extends JpaRepository<MessageEntity, Integer>{
}
