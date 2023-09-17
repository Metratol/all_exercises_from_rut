package doing;

import entity_try.MusicalTrack;
import org.hibernate.Session;
import utils.AbstractJPA;
import utils.HibernateUtil;

import java.util.Scanner;

public class AddMusicalTrack extends AbstractJPA {
    Scanner scanner = new Scanner(System.in);

    public void add() throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.getTransaction().begin();
        try {
            MusicalTrack musicalTrack = new MusicalTrack();
            System.out.print("Введите название трека:");
            musicalTrack.setName(scanner.nextLine());
            System.out.print("Введите длительность трека:");
            musicalTrack.setTime(Integer.parseInt(scanner.nextLine()));
            System.out.print("Введите жанр трека:");
            musicalTrack.setGenre(scanner.nextLine());
            System.out.print("Введите номер альбома к которому принадлежит трек трека:");
            Integer album =Integer.parseInt(scanner.nextLine());
            musicalTrack.setAlbumId(album);
            session.persist(musicalTrack);
            session.getTransaction().commit();
            session.close();
            HibernateUtil.close();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("Укажите правильное значение для номер альбома или длительности трека");

        }
    }
}
