package com.myjpa.bookmanger.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;


//@Getter
//@Setter
//@ToString
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor //꼭 필요한 인자들만 넣어서 만든 생성자(@NonNull 어노테이션이 붙은것, final 필드도 꼭필요한 인자에 해당됨)
//@DATA에 @RequiredArgsConstructor가 포함됨. final 필드나 @NonNull이 붙은 필드가 없으면 NoArgsConstructor와 동일
//@EqualsAndHashCode //@DATA를 사용하면 필요없는 부분
@Data //Equivalent to @Getter @Setter @RequiredArgsConstructor @ToString @EqualsAndHashCode. 이것들을 쓴것과 동일하다.
@Builder //@AllArgsConstructor와 비슷하게 객체를 생성하고 필드값을 builder의 형식에 맞게 주입해준다.
@Entity // ORM은 JAVA 객체와 데이터베이스 테이블을 연결해준다고 했다. 이때 JAVA 객체를 Entity라고하며 @Entity 를 붙여 Entity 객체로 만든다.
public class User {
    //필드 전체가 아닌 특정 필드만 만들고 싶으면 Annotation을 특정  필드 위에 두고 사용해도된다.
    //@Getter
    //@Setter
    @Id //Entity를 사용하면 반드시 Primary key가 필요하다. PK인 Id로 만들어준다.
    @GeneratedValue // 숫자가 자동으로 증가하게 된다.
    private Long id;
    @NonNull
    private String name;
    @NonNull
    private String email;
    private LocalDateTime createdAt; //언제 생성되었는지
    private LocalDateTime updatedAt; //언제 업데이트되었는지 이력관리를 위함
}
