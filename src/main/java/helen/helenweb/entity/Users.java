package helen.helenweb.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name="users")
public class Users {
    @Id
    private String id;

    private String password;

    private String email;

    private String nickname;

    private Date birthdate;
}
