package com.hendisantika.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-users-login-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 22/10/21
 * Time: 09.07
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
