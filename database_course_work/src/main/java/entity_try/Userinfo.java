package entity_try;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "userinfo", schema = "todo", catalog = "music_shop")
public class Userinfo {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int login;
    @Basic
    @Column(name = "name", nullable = true, length = 16)
    private String name;
    @Basic
    @Column(name = "surname", nullable = true, length = 32)
    private String surname;
    @Basic
    @Column(name = "password", nullable = false, length = 32)
    private String password;
    @Basic
    @Column(name = "email", nullable = true, length = 64)
    private String email;
    @Basic
    @Column(name = "phone number", nullable = true, length = 16)
    private String phoneNumber;
    @Basic
    @Column(name = "subscribe status", nullable = true, length = 16)
    private String subscribeStatus;


    public int getLogin() {
        return login;
    }

    public void setLogin(int login) {
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSubscribeStatus() {
        return subscribeStatus;
    }

    public void setSubscribeStatus(String subscribeStatus) {
        this.subscribeStatus = subscribeStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Userinfo userinfo = (Userinfo) o;
        return login == userinfo.login && Objects.equals(name, userinfo.name) && Objects.equals(surname, userinfo.surname) && Objects.equals(password, userinfo.password) && Objects.equals(email, userinfo.email) && Objects.equals(phoneNumber, userinfo.phoneNumber) && Objects.equals(subscribeStatus, userinfo.subscribeStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, name, surname, password, email, phoneNumber, subscribeStatus);
    }


}
