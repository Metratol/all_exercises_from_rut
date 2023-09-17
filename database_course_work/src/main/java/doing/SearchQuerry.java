package doing;

import entity_try.Album;
import entity_try.MusicalTrack;
import entity_try.Performer;
import jakarta.persistence.TypedQuery;
import org.hibernate.Session;
import utils.HibernateUtil;

import java.util.List;

public class SearchQuerry {
    public static List<MusicalTrack> trackTime(int time){
        try(Session session = HibernateUtil.getSessionFactory().openSession()) {
            TypedQuery<MusicalTrack> typedQuery = session.createQuery("SELECT m FROM MusicalTrack m WHERE m.time >:time",MusicalTrack.class);
            typedQuery.setParameter("time",time);
            return typedQuery.getResultList();
        }
    }
    public static List<Album> performerAs(String name){
        try(Session session = HibernateUtil.getSessionFactory().openSession()) {
            TypedQuery<Album> typedQuery = session.createQuery("SELECT a FROM Album a JOIN Performer p ON a.performerByCreatorId.id = p.id WHERE p.name =:name", Album.class);
            typedQuery.setParameter("name",name);
            return typedQuery.getResultList();
        }
    }
    public static List<MusicalTrack> musicalTrackAs(String name){
        try(Session session = HibernateUtil.getSessionFactory().openSession()) {
            TypedQuery<MusicalTrack> typedQuery = session.createQuery("SELECT m FROM MusicalTrack m JOIN  Album a ON m.albumByAlbumId.id = a.id JOIN Performer p ON a.performerByCreatorId.id = p.id WHERE p.name =:name", MusicalTrack.class);
            typedQuery.setParameter("name",name);
            return typedQuery.getResultList();
        }
    }
    public static List<Performer> musicalTrackBy(String name) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            TypedQuery<Performer> typedQuery = session.createQuery("SELECT p FROM Performer p JOIN  Album a ON a.performerByCreatorId.id = p.id  JOIN MusicalTrack m ON m.albumByAlbumId.id = a.id WHERE m.name =:name", Performer.class);
            typedQuery.setParameter("name", name);
            return typedQuery.getResultList();
        }
    }
}
