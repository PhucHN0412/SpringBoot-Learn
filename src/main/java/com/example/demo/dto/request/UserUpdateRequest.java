package com.example.demo.dto.request;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
public class UserUpdateRequest {
    String password;
    String firstName;
    String lastName;
    LocalDate dob;


}
