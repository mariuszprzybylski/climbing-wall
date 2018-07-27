package pl.mprzybylski.climbingWall.dao;

import org.springframework.data.repository.CrudRepository;
import pl.mprzybylski.climbingWall.model.Climber;

public interface ClimberDao extends CrudRepository<Climber, Integer> {
}
