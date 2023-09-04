package netology.conditional.task2.repository;

import netology.conditional.task2.domain.Authorities;
import netology.conditional.task2.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

import static netology.conditional.task2.domain.Authorities.*;

@Repository
public class UserRepository {
    private final Map<User, List<Authorities>> AUTHORITIES_MAP = Map.of(
            new User("1", "user1"), List.of(READ),
            new User("2", "user2"), List.of(READ, WRITE, DELETE)
    );

    public List<Authorities> getUserAuthorities(String user, String password) {
        return AUTHORITIES_MAP.getOrDefault(new User(password, user), List.of());
    }

}
