package netology.conditional.task2.domain;

import lombok.EqualsAndHashCode;
import lombok.Value;

@Value
@EqualsAndHashCode
public class User {
    String password;
    String name;
}
