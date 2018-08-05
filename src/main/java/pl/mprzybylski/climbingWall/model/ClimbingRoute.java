package pl.mprzybylski.climbingWall.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "ClimbingRoute")
public class ClimbingRoute {


    @OneToMany(mappedBy = "climbingRoute")
    private List<ClimberWays> climberWays = new ArrayList<>();


    public ClimbingRoute(){}


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

    public String toString(){
        return getWayName()+" ";
    }
}
