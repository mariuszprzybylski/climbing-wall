package pl.mprzybylski.climbingWall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.mprzybylski.climbingWall.dao.ClimberDao;
import pl.mprzybylski.climbingWall.dao.ClimbingRouteDao;
import pl.mprzybylski.climbingWall.model.ClimbingRoute;

@Controller
public class ClimbingRouteController {

    @Autowired
    ClimbingRouteDao climbingRouteDao;

    @Autowired
    ClimberDao climberDao;


    @GetMapping("/routes/add")
    public String addRoute(ModelMap modelMap) {
        modelMap.put("routes", new ClimbingRoute());
        return "routes/add";
    }

    @PostMapping("routes/add")
    public String saveRoute(@ModelAttribute ClimbingRoute climbingRoute, ModelMap modelMap) {
        modelMap.put("routesAll", climbingRoute);
        climbingRouteDao.save(climbingRoute);
        return "routes/all";
    }

    @GetMapping("/routes/all")
    public String allRoutes(ModelMap modelMap) {
        modelMap.put("routesAll", climbingRouteDao.findAll());
        return "routes/all";
    }
}
