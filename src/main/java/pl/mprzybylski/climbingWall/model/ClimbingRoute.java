package pl.mprzybylski.climbingWall.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "ClimbingRoute")
public class ClimbingRoute {

    public ClimbingRoute(){}

    @ManyToMany(mappedBy = "climbingRoutes")
    private Set<Climber> climbers = new HashSet<>();

    public ClimbingRoute(Set<Climber> climbers) {
        this.climbers = climbers;
    }

    public Set<Climber> getClimbers() {
        return climbers;
    }

    public void setClimbers(Set<Climber> climbers) {
        this.climbers = climbers;
    }

//    @OneToMany(mappedBy = "climbersMapped")
//
//    List<Climber> climbersList;
//
//    public List<Climber> getClimbersList() {
//        return climbersList;
//    }
//
//    public void setClimbersList(List<Climber> climbersList) {
//        this.climbersList = climbersList;
//    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Integer climbing_id;
    private String wayName;
    private String level;
    private int amountOfClimb;
    private String description;

    public Integer getClimbing_id() {
        return climbing_id;
    }

    public void setClimbing_id(Integer climbing_id) {
        this.climbing_id = climbing_id;
    }

    public String getWayName() {
        return wayName;
    }

    public void setWayName(String wayName) {
        this.wayName = wayName;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public int getAmountOfClimb() {
        return amountOfClimb;
    }

    public void setAmountOfClimb(int amountOfClimb) {
        this.amountOfClimb = amountOfClimb;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
