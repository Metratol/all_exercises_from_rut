package entity_try;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "playlist", schema = "todo", catalog = "music_shop")
public class Playlist {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "name", nullable = false, length = 32)
    private String name;
    @Basic
    @Column(name = "short info", nullable = true, length = 64)
    private String shortInfo;
    @Basic
    @Column(name = "creator", nullable = false, length = 16)
    private String creator;
    @Basic
    @Column(name = "audition rate", nullable = false)
    private long auditionRate;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortInfo() {
        return shortInfo;
    }

    public void setShortInfo(String shortInfo) {
        this.shortInfo = shortInfo;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public long getAuditionRate() {
        return auditionRate;
    }

    public void setAuditionRate(long auditionRate) {
        this.auditionRate = auditionRate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Playlist playlist = (Playlist) o;
        return id == playlist.id && auditionRate == playlist.auditionRate && Objects.equals(name, playlist.name) && Objects.equals(shortInfo, playlist.shortInfo) && Objects.equals(creator, playlist.creator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, shortInfo, creator, auditionRate);
    }


}
