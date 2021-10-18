package com.myjpa.bookmanger.repository;

import com.myjpa.bookmanger.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> { //JpaRepository를 상속받는 interface를 만드므로써 많은 JPA 메소드를 지원한다.
    //제네릭 타입으로는 처음에 entity 타입, 두번째에 PK의 타입을 사용한다.
}
