//package entity;

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
//@Table(name = "album",schema = "todo",catalog = "music_shop")
//public class Album {
//
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Id
//    @Column(name = "id", nullable = false)
//    private Short id;
//
//    @Column(name = "track count", nullable = false)
//    private Integer trackCount;
//
//    @Column(name = "number_of_singers", nullable = false)
//    private Integer numberOfSingers;
//
//    @Column(name = "time", nullable = true)
//    private Integer time;
//
//    @Column(name = "name", nullable = false, length = 32)
//    private String name;
//
//    @Column(name = "creator_id", nullable = false)
//    private Integer creatorId;
//
//    @OneToMany(mappedBy = "album_id",cascade = {CascadeType.ALL})
//    private ArrayList<MusicalTrack> musicalTracks = new ArrayList<>();
//
//    @ManyToOne(cascade = {CascadeType.MERGE}, fetch = FetchType.LAZY)
//    @JoinColumn(name = "id")
//    private Performer performer;
//
//
//
//}
