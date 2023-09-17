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
//@Table(name = "playlist",schema = "todo",catalog = "music_shop")
//public class Playlist {
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Id
//    @Column(name = "id", nullable = false)
//    private Integer id;
//    @Basic
//    @Column(name = "name", nullable = false, length = 32)
//    private String name;
//    @Basic
//    @Column(name = "short info", nullable = true, length = 64)
//    private String shortInfo;
//    @Basic
//    @Column(name = "creator", nullable = false, length = 16)
//    private String creator;
//    @Basic
//    @Column(name = "audition rate", nullable = false)
//    private Long auditionRate;
//
//
//}
