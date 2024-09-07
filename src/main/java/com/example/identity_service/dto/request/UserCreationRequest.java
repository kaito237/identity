package com.example.identity_service.dto.request;

import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserCreationRequest {
    @Size(min = 3, message = "username must be at least 3 characters ")
    private String username;

    @Size(min = 8, message = "password must be at least 8 characters")
     String password;
     String firstName;
     String lastName;
     LocalDate dob;


}
