package com.codemaster.automation.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class MessageEntity {

    @Id
    private Integer id;

    private String name;

    private Integer age;
}
