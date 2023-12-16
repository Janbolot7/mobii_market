package kg.startproject.mobii_market.dto.request;

import lombok.Data;

@Data
public class JwtRequest {
    private String username;
    private String password;
}
