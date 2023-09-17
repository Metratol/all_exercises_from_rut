package entity_try;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "album", schema = "todo", catalog = "music_shop")
public class Album {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private short id;
    @Basic
    @Column(name = "track count", nullable = false)
    private int trackCount;
    @Basic
    @Column(name = "number_of_singers", nullable = false)
    private int numberOfSingers;
    @Basic
    @Column(name = "time", nullable = true)
    private Integer time;
    @Basic
    @Column(name = "name", nullable = false, length = 32)
    private String name;
    @Basic
    @Column(name = "creator_id", nullable = false,insertable=false, updatable=false)
    private int creatorId;

    @ManyToOne
    @JoinColumn(name = "creator_id", referencedColumnName = "id")
    private Performer performerByCreatorId;

    public short getId() {
        return id;
    }

    public void setId(short id) {
        this.id = id;
    }

    public int getTrackCount() {
        return trackCount;
    }

    public void setTrackCount(int trackCount) {
        this.trackCount = trackCount;
    }

    public int getNumberOfSingers() {
        return numberOfSingers;
    }

    public void setNumberOfSingers(int numberOfSingers) {
        this.numberOfSingers = numberOfSingers;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(int creatorId) {
        this.creatorId = creatorId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Album album = (Album) o;
        return id == album.id && trackCount == album.trackCount && numberOfSingers == album.numberOfSingers && creatorId == album.creatorId && Objects.equals(time, album.time) && Objects.equals(name, album.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, trackCount, numberOfSingers, time, name, creatorId);
    }
}
