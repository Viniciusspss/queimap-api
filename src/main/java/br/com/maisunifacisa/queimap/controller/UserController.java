package br.com.maisunifacisa.queimap.controller;

import br.com.maisunifacisa.queimap.controller.response.UserResponse;
import br.com.maisunifacisa.queimap.service.user.SearchUserService;
import br.com.maisunifacisa.queimap.service.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    private final SearchUserService searchUserService;

    public UserResponse getAuthenticatedCustomer() { return searchUserService.searchAuthenticatedUser(); }

    public UserResponse getCustomerById( final Long id) {
        return searchUserService.searchById(id);
    }

    public void deleteById(final Long id) {
        userService.deleteById(id);
    }

}
