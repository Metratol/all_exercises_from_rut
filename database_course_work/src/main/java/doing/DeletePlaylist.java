package doing;

import entity_try.Playlist;
import utils.AbstractJPAPers;

import java.util.Scanner;

public class DeletePlaylist extends AbstractJPAPers {
    Scanner scanner = new Scanner(System.in);

    public void deleteByCreator() {
        init();
        System.out.println("Введите id создателя, чей плейлист хотите удалить");
        String id = scanner.nextLine();
        Playlist playlist = entityManager.getReference(Playlist.class, id);
        entityManager.remove(playlist);
        close();

    }
}
