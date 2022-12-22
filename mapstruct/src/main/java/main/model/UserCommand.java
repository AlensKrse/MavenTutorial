package main.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserCommand {
    private String firstName;
    private String lastName;
    private String email;

}

