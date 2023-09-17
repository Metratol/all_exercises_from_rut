//package entity;
//
//import jakarta.persistence.*;
//import lombok.*;
//
//@Entity
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@Table(name = "musical_track", schema = "todo",catalog = "music_shop")
//public class MusicalTrack {
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Id
//    private Integer id;
//
//    @Column(name = "name", nullable = false, length = 32)
//    private String name;
//
//    @Column(name = "time", nullable = false)
//    private Integer time;
//
//    @Column(name = "genre", nullable = true, length = 16)
//    private String genre;
//
//    @Column(name = "album_id", nullable = true)
//    private Integer albumId;
//
//    @ManyToOne(cascade = {CascadeType.MERGE}, fetch = FetchType.LAZY)
//    @JoinColumn(name = "id")
//    private Album album;
//
//
//}
