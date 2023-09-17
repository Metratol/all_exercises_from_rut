//package entity;
//
//import jakarta.persistence.*;
//import lombok.*;
//
//@Entity
//@Setter
//@Getter
//@AllArgsConstructor
//@NoArgsConstructor
//@Table(name = "userinfo",schema = "todo",catalog = "music_shop")
//public class User {
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Id
//    @Column(name = "login", nullable = false)
//    private Integer login;
//
//    @Column(name = "name", nullable = true, length = 16)
//    private String name;
//    @Column(name = "surname", nullable = true, length = 32)
//    private String surname;
//
//    @Column(name = "password", nullable = false, length = 32)
//    private String password;
//
//    @Column(name = "email", nullable = true, length = 64)
//    private String email;
//
//    @Column(name = "phone number", nullable = true, length = 16)
//    private String phoneNumber;
//
//    @Column(name = "subscribe status", nullable = true, length = 16)
//    private String subscribeStatus;
//
//
//}
