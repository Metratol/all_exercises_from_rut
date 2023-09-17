package entity_try;

import jakarta.persistence.*;

import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "performer", schema = "todo", catalog = "music_shop")
public class Performer {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "name", nullable = false, length = 32)
    private String name;
    @Basic
    @Column(name = "short info", nullable = true, length = 150)
    private String shortInfo;
    @Basic
    @Column(name = "audition rate", nullable = false)
    private long auditionRate;
    @Basic
    @Column(name = "born", nullable = false, length = 4)
    private String born;
    @OneToMany(mappedBy = "performerByCreatorId")
    private Collection<Album> albumsById;

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

    public long getAuditionRate() {
        return auditionRate;
    }

    public void setAuditionRate(long auditionRate) {
        this.auditionRate = auditionRate;
    }

    public String getBorn() {
        return born;
    }

    public void setBorn(String born) {
        this.born = born;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Performer performer = (Performer) o;
        return id == performer.id && auditionRate == performer.auditionRate && Objects.equals(name, performer.name) && Objects.equals(shortInfo, performer.shortInfo) && Objects.equals(born, performer.born);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, shortInfo, auditionRate, born);
    }

    public Collection<Album> getAlbumsById() {
        return albumsById;
    }

    public void setAlbumsById(Collection<Album> albumsById) {
        this.albumsById = albumsById;
    }

    @Override
    public String toString() {
        return "Performer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", shortInfo='" + shortInfo + '\'' +
                ", auditionRate=" + auditionRate +
                ", born='" + born + '\'' +
                '}';
    }
}
