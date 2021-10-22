package com.hendisantika.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-users-login-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 22/10/21
 * Time: 09.07
 */
@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

}
