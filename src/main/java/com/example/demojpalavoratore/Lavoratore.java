package com.example.demojpalavoratore;
import javax.persistence.*;

@Entity(name="Lavoratore")
@Table(name ="lavoratore")
public class Lavoratore {

    @Id
    @SequenceGenerator(
            name="id_lavoratore",
            sequenceName = "id_lavoratore",
            allocationSize = 1
    )
    private Long idLavoratore;


    @Column(
            name = "first_name",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String firstName;

    @Column(
            name = "last_name",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String lastName;

    @Column(
            name = "email",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String email;

    @Column(
            name = "age",
            nullable = false

    )
    private Integer age;

    @OneToOne(orphanRemoval = true)
    @JoinTable(name = "lavoratore_user",
            joinColumns = @JoinColumn(name = "lavoratore_null"),
            inverseJoinColumns = @JoinColumn(name = "user_id_user"))
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


    public Lavoratore(Long idLavoratore, String firstName, String lastName, String email, Integer age) {
        this.idLavoratore = idLavoratore;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
    }

    public Lavoratore() {

    }

    public Long getIdLavoratore() {
        return idLavoratore;
    }

    public void setIdLavoratore(Long idLavoratore) {
        this.idLavoratore = idLavoratore;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Lavoratore{" +
                "idLavoratore=" + idLavoratore +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}
