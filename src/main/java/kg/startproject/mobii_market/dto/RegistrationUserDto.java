package kg.startproject.mobii_market.dto;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RegistrationUserDto {
     String username;
     String password;
     String email;
}
