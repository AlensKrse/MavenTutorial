package main.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class User {

    private String firstName;
    private String lastName;
    private String email;

}
