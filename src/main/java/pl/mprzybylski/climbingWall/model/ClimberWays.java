package pl.mprzybylski.climbingWall.model;


import javax.persistence.*;

@Entity
public class ClimberWays {

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Integer id;


   @OneToOne
   private Climber climber;

   @OneToOne
   private ClimbingRoute climbingRoute;

   public Integer getId() {
      return id;
   }

   public void setId(Integer id) {
      this.id = id;
   }

   public Climber getClimber() {
      return climber;
   }

   public void setClimber(Climber climber) {
      this.climber = climber;
   }

   public ClimbingRoute getClimbingRoute() {
      return climbingRoute;
   }

   public void setClimbingRoute(ClimbingRoute climbingRoute) {
      this.climbingRoute = climbingRoute;
   }
}
