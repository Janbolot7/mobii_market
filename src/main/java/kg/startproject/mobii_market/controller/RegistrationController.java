package kg.startproject.mobii_market.controller;

import kg.startproject.mobii_market.dto.request.JwtRequest;
import kg.startproject.mobii_market.dto.RegistrationUserDto;
import kg.startproject.mobii_market.service.seviceImpl.RegistrationService;
import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import static kg.startproject.mobii_market.configuration.SwaggerConfig.REGISTR;


@Api(tags = REGISTR)
@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class RegistrationController {
    private final RegistrationService authService;

    @PostMapping("/authentication")
    public ResponseEntity<?> createAuthToken(@RequestBody JwtRequest authRequest) {
        return authService.createAuthToken(authRequest);
    }

    @PostMapping("/registration")
    public ResponseEntity<?> createNewUser(@RequestBody RegistrationUserDto registrationUserDto) {
        return authService.createNewUser(registrationUserDto);
    }
}
