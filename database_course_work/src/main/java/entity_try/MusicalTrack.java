package entity_try;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "musical_track", schema = "todo", catalog = "music_shop")
public class MusicalTrack {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "name", nullable = false, length = 32)
    private String name;
    @Basic
    @Column(name = "time", nullable = false)
    private int time;
    @Basic
    @Column(name = "genre", nullable = true, length = 16)
    private String genre;
    @Basic
    @Column(name = "album_id", nullable = true,insertable=false, updatable=false)
    private Integer albumId;
    @ManyToOne
    @JoinColumn(name = "album_id", referencedColumnName = "id")
    private Album albumByAlbumId;

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

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Integer getAlbumId() {
        return albumId;
    }

    public void setAlbumId(Integer albumId) {
        this.albumId = albumId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MusicalTrack that = (MusicalTrack) o;
        return id == that.id && time == that.time && Objects.equals(name, that.name) && Objects.equals(genre, that.genre) && Objects.equals(albumId, that.albumId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, time, genre, albumId);
    }

    public Album getAlbumByAlbumId() {
        return albumByAlbumId;
    }

    public void setAlbumByAlbumId(Album albumByAlbumId) {
        this.albumByAlbumId = albumByAlbumId;
    }

    @Override
    public String toString() {
        return "MusicalTrack{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", time=" + time +
                ", genre='" + genre + '\'' +
                ", albumId=" + albumId +
                '}';
    }
}
