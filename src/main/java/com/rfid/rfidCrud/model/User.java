package com.rfid.rfidCrud.model;

import lombok.*;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "users")
public class User {
    @Id
    private String userId;
    private String firstName;
    private String lastName;
    private String  gender;
    private String userType;
    @CreatedBy
    private LocalDateTime createdBy;
    @LastModifiedDate
    private LocalDateTime updatedBy;
    @CreatedDate
    private LocalDateTime createdAt;
    @LastModifiedDate
    private LocalDateTime updatedAt;
}
