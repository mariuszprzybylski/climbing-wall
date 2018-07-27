package pl.mprzybylski.climbingWall.dao;

import org.springframework.data.repository.CrudRepository;
import pl.mprzybylski.climbingWall.model.ClimbingRoute;

public interface ClimbingRouteDao extends CrudRepository<ClimbingRoute, Integer> {
}
