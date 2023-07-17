package helen.helenweb.util;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

/*
* 생성 시간, 수정 시간 컬럼 자동화를 위한 클래스
* https://it-mesung.tistory.com/195 참고
* 사용: 생성 시간, 수정 시간이 필요한 Entity class에서 BaseTimeEntity 클래스를 상속(extends)받는다
* (HelenWebApplication.java에 @EnableJpaAuditing 어노테이션 붙여야 사용할 수 있음)
* */

@Getter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class BaseTimeEntity {
    @CreatedDate
    @Column(updatable = false)
    private LocalDateTime createdAt; // 생성 시간 (created_at)

    @LastModifiedDate
    private LocalDateTime updatedAt; // 수정 시간 (updated_at)
}
