package com.example.demojpalavoratore;
import javax.persistence.*;

@Entity(name = "User")
@Table(
        name="user"
)
public class User {

    @Id
    @SequenceGenerator( name = "user_sequence",sequenceName = "student_sequence",allocationSize = 1)
    private Long idUser;


    @Column(
            name = "user_name"
    )
    private String UserName;

    @Column(
            name = "email"
    )
    private String Email;

    @Column(
            name = "password"
    )
    private String password;


    @OneToOne(
            mappedBy = "user",
            orphanRemoval = true,
            cascade = {CascadeType.PERSIST, CascadeType.REMOVE}

    )
    private Lavoratore lavoratore;

    public User() {

    }

    public User(Long idUser, String userName, String email, String password) {
        this.idUser = idUser;
        UserName = userName;
        Email = email;
        this.password = password;
    }




    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "idUser=" + idUser +
                ", UserName='" + UserName + '\'' +
                ", Email='" + Email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
