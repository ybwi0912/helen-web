package helen.helenweb.entity;

import helen.helenweb.util.BaseTimeEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "board")
public class Board extends BaseTimeEntity {
    @Id
    private String id; // 게시물 고유 아이디. 인덱스?

    private String title; // 게시물 제목

    private String content; // 게시물 내용

    private int hit; // 게시물의 조회수

    @ManyToOne(fetch = FetchType.LAZY) // 다(게시물) 대 일(유저) 관계, 지연 로딩
    @JoinColumn(name="user_id") // 연관관계 설정
    private Users users; // 게시물 작성자
}
