package pl.mprzybylski.climbingWall.dao;

import org.springframework.data.repository.CrudRepository;
import pl.mprzybylski.climbingWall.model.ClimberWays;

public interface ClimbingWaysDao extends CrudRepository<ClimberWays,Integer> {
}
