package pl.mprzybylski.climbingWall.dao;

import org.springframework.data.repository.CrudRepository;
import pl.mprzybylski.climbingWall.model.Climber;

import java.util.Optional;

public interface ClimberDao extends CrudRepository<Climber, Integer> {
    Optional<Climber> findByName(String name);
}
