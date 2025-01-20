package com.example.demo.dto.request;

import com.example.demo.entity.User;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserCreationRequest extends User {
    @Size(min = 8, message = "PASSWORD_INVALID")
    String password;
    @Size(min = 3, message = "USERNAME_INVALID")
    String username;
}
