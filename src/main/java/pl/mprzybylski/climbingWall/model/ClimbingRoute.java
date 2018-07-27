package pl.mprzybylski.climbingWall.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ClimbingRoute {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Integer id;
    private String wayName;
    private String level;
    private int amountOfClimb;
    private String description;

}
