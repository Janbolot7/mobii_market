package kg.startproject.mobii_market.controller;

import kg.startproject.mobii_market.dto.UserDto;
import kg.startproject.mobii_market.service.seviceImpl.UserServiceImpl;
import io.swagger.annotations.Api;
import kg.startproject.mobii_market.configuration.SwaggerConfig;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@AllArgsConstructor
@Api(tags = SwaggerConfig.USER)
@RestController
@RequestMapping("/user")
public class UserController {

    private final UserServiceImpl userServiceImpl;

//    @PostMapping("/save")
//    public UserDto saveUser(@RequestBody UserDto userDto) {
//
//        return userServiceImpl.saveUser(userDto);
//    }

    @PutMapping("/updateUser")
    public UserDto updateUser(@RequestBody UserDto userDto, @PathVariable long id) {
        return userServiceImpl.updateUser(userDto, id);
    }

    @GetMapping("/findAll")
    public List<UserDto> findAll() {
        return userServiceImpl.findAllUser();
    }

    @DeleteMapping("/deleteUser")
    public void deleteUser(@RequestParam Long id) {
        userServiceImpl.deleteUser(id);

    }
}
