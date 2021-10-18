# Repository Interface 계층 살펴보기



## JPA 실습

### build.gradle 
-  jpa를 추가하여 jpa를 사용할 수 있게 된다.

```gradle
dependencies {
	implementation 'org.springframework.boot:spring-boot-starter-data-jpa'
}
```

<br>

### User class

```java
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor 
@Data
@Builder
@Entity 
public class User {
    @Id 
    @GeneratedValue
    private Long id;
    @NonNull
    private String name;
    @NonNull
    private String email;
    private LocalDateTime createdAt; 
    private LocalDateTime updatedAt; 
}
```
- @Entity : ORM은 JAVA 객체와 데이터베이스 테이블을 연결해준다. 이때 JAVA 객체를 Entity라고 하며 @Entity Annotation을 붙여 Entity 객체로 만든다.
- @Id : Entity를 사용하면 반드시 Primary key가 필요하다. PK인 Id로 만들어준다.
- @GeneratedValue : 숫자가 자동으로 증가하게 된다.

<br>

### UserRepository class
```java
public interface UserRepository extends JpaRepository<User,Long> { 
}
```
- /paRepository를 상속받는 interface를 만드는 것만으로도 많은 JPA 메소드를 지원한다.
- Generic Type 첫번째 인자에 entity 타입, 두번째 인자에 PK의 타입을 사용한다.

<br><br>

## Test

```java
@SpringBootTest 
class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    void crud(){ //create, read, update, delete
        userRepository.save(new User());

        System.out.println(">>>"+userRepository.findAll());
    }
}
```
- @SpringBootTest : springcontext를 로딩해서 test에 활용하겠다는 의미

<br>

### Console 결과

```
>>>[User(id=1, name=null, email=null, createdAt=null, updatedAt=null)]
```
