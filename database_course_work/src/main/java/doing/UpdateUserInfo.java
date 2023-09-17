package doing;

import entity_try.Userinfo;
import utils.AbstractJPAPers;

import java.util.Scanner;

public class UpdateUserInfo extends AbstractJPAPers {
    Scanner scanner = new Scanner(System.in);

    public Integer searchLogin() throws Exception {
        System.out.println("Введите login пользователя, чье имя хотите сменить:");
        Integer login = Integer.parseInt(scanner.nextLine());
        try {
           return login;
        } catch (Exception e) {
            if (login < 100000) {
                System.out.println(e.getMessage());
                throw new Exception("Слишком маленькое значение 'login'");
            }
            else {
                System.out.println(e.getMessage());
                throw new Exception("Укажите правильное значение 'login' ");
            }
        }
    }
    public void newInfo(Integer id){
        init();
        Userinfo newUser = entityManager.find(Userinfo.class,id);

        if(newUser == null){
            System.out.println("Пользователь с данным id не найден.");
            return;
        }
        System.out.println("Введите новое имя пользователя:");
        newUser.setName(scanner.nextLine());
        System.out.println("Введите новую фамилию пользователя(Enter если хотите пропустить данный пункт):");
        String surname ="" + scanner.nextLine();
        if (surname.equals("")) newUser.setSurname(null);
        else newUser.setSurname(surname);
        System.out.println("Введите новый пароль:");
        newUser.setPassword(scanner.nextLine());
        System.out.println("Введите новую эл.почту пользователя(Enter если хотите пропустить данный пункт):");
        String mail = "" + scanner.nextLine();
        if (mail.equals("")) newUser.setEmail(null);
        else newUser.setEmail(mail);
        System.out.println("Введите новый номер телефона(Enter если хотите пропустить данный пункт):");
        String phone = scanner.nextLine();
        if (phone.equals("")) newUser.setPhoneNumber(null);
        else newUser.setPhoneNumber(phone);
        newUser.setSubscribeStatus("Inactive");
        System.out.println("Информация о пользователе успешно изменена");
        close();

    }
}