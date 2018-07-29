package pl.mprzybylski.climbingWall.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "Climber")
public class Climber {

    public Climber() {}

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(
            name = "Climber_Ways",
            joinColumns = {@JoinColumn(name="climber_id")},
            inverseJoinColumns = {@JoinColumn(name ="climbing_id")}
    )
    Set<ClimbingRoute> climbingRoutes = new HashSet<>();

    public Climber(Set<ClimbingRoute> climbingRoutes) {
        this.climbingRoutes = climbingRoutes;
    }

    public Set<ClimbingRoute> getClimbingRoutes() {
        return climbingRoutes;
    }

    public void setClimbingRoutes(Set<ClimbingRoute> climbingRoutes) {
        this.climbingRoutes = climbingRoutes;
    }

//    @OneToMany(mappedBy = "climbingRoutesMapped")
//
//    List<ClimbingRoute> climbingRoutesList;
//
//    public List<ClimbingRoute> getClimbingRoutesList() {
//        return climbingRoutesList;
//    }
//
//    public void setClimbingRoutesList(List<ClimbingRoute> climbingRoutesList) {
//        this.climbingRoutesList = climbingRoutesList;
//    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Integer climber_id;
    private String name;
    private String surname;
    private String nickname;
    private int age;
    private String sex;
    private String city;
    private String phoneNumber;
    private String email;
    private int numberOfClimbing;
    private String comment;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Integer getClimber_id() {
        return climber_id;
    }

    public void setClimber_id(Integer climber_id) {
        this.climber_id = climber_id;
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

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumberOfClimbing() {
        return numberOfClimbing;
    }

    public void setNumberOfClimbing(int numberOfClimbing) {
        this.numberOfClimbing = numberOfClimbing;
    }

}
