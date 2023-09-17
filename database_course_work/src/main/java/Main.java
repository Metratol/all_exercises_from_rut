import doing.AddMusicalTrack;
import doing.DeletePlaylist;
import doing.SearchQuerry;
import doing.UpdateUserInfo;
import entity_try.Album;
import entity_try.MusicalTrack;
import entity_try.Performer;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println();
            System.out.println("Kakoe действие вы хотите произвести?\n1)Добавить музыкальный трек\n2)Удалить плейлист по id пользователя" +
                    "\n3)Изменить данные пользователя с указанным id\n4)Вывести треки с временем больше указанного\n5)Вывести альбомы указанного исполнителя\n6)Вывести треки указанного исполнителя\n7)Вывести исполнителя указанного трека");
            int change =Integer.parseInt(scanner.nextLine());
            if(change == 1){
                AddMusicalTrack addMusicalTrack = new AddMusicalTrack();
                addMusicalTrack.add();
            }
            else if(change == 2){
                DeletePlaylist deletePlaylist = new DeletePlaylist();
                deletePlaylist.deleteByCreator();

            }
            else if(change == 3){
                UpdateUserInfo updateUserInfo = new UpdateUserInfo();
                updateUserInfo.newInfo(updateUserInfo.searchLogin());
            }
            else if(change == 4){
                System.out.println("Введите время:");
                int time = Integer.parseInt(scanner.nextLine());
                List<MusicalTrack> musTracksTime = SearchQuerry.trackTime(time);
                for(MusicalTrack i:musTracksTime){
                    System.out.println("Название:" + i.getName() + "-->" + i.getTime() + "сек");
                }
            }
            else if(change == 5){
                System.out.println("Введите альбомы какого исполнителя вы хотите узнать:");
                String name = scanner.nextLine();
                List<Album> albumSearch = SearchQuerry.performerAs(name);
                for(Album i: albumSearch){
                    System.out.println("Исполнитель " + name + " выпустил альбом " + i.getName());
                }
            }
            else if(change == 6){
                System.out.println("Введите песни какого исполнителя вы хотите узнать:");
                String name = scanner.nextLine();
                List<MusicalTrack> musicTrackSearch = SearchQuerry.musicalTrackAs(name);
                for(MusicalTrack i: musicTrackSearch){
                    System.out.println("Исполнитель " + name + " выпустил трек " + i.getName());
                }

            }
            else if(change == 7){
                System.out.println("Введите исполнителя какой песни вы хотите узнать:");
                String name = scanner.nextLine();
                List<Performer> performerTrack = SearchQuerry.musicalTrackBy(name);
                for(Performer i: performerTrack){
                    System.out.println("Песня " + name + " принадлежит исполнителю " + i.getName());
                }

            }
            else break;
        }











    }
}
