package helen.helenweb.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name="users")
public class Users {
    @Id
    private String id;

    private String password;

    private String email;

    private String nickname;

    private Date birthdate;

    @Builder.Default // default 값 지정하기 위한 어노테이션
    private int role = 0; // 역할 (0: 유저, 1: 관리자)
}
