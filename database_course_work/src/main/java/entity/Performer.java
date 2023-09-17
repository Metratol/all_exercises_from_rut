//package entity;
//
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//import java.util.ArrayList;
//
//@Entity
//@Setter
//@Getter
//@AllArgsConstructor
//@NoArgsConstructor
//@Table(name = "performer",schema = "todo",catalog = "music_shop")
//public class Performer {
//
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id", nullable = false)
//    private Integer id;
//
//
//    @Column(name = "name", nullable = false, length = 32)
//    private String name;
//
//
//    @Column(name = "short info", nullable = true, length = 150)
//    private String shortInfo;
//
//
//    @Column(name = "audition rate", nullable = false)
//    private Long auditionRate;
//
//
//    @Column(name = "born", nullable = false, length = 4)
//    private String born;
//
//
//    @OneToMany(mappedBy = "creator_id",cascade = {CascadeType.ALL})
//    private ArrayList<Album> albums = new ArrayList<>();
//
//
//
//
//
//
//
//
//
//
//}
