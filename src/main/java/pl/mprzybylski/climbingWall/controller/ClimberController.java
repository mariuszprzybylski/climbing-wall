package pl.mprzybylski.climbingWall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import pl.mprzybylski.climbingWall.dao.ClimberDao;
import pl.mprzybylski.climbingWall.dao.ClimbingRouteDao;
import pl.mprzybylski.climbingWall.model.Climber;

@Controller
public class ClimberController {

    @Autowired
    ClimberDao climberDao;

    @Autowired
    ClimbingRouteDao climbingRouteDao;

    @GetMapping("/climbers/add")
    public String addClimber(ModelMap modelMap) {
        modelMap.put("climbers", new Climber());
        return "climbers/add";
    }

    @PostMapping("climbers/add")
    public String save(@ModelAttribute Climber climber, ModelMap modelMap) {
        modelMap.put("climbersAll", climber);
        climberDao.save(climber);
        return "climbers/profil";
    }

    @GetMapping("/climbers/all")
    public String all(ModelMap modelMap) {
        modelMap.put("climbersAll", climberDao.findAll());
        return "climbers/all";
    }

    @GetMapping("/climbers/{climber_id}")
    public String profil(@PathVariable Integer climber_id, ModelMap modelMap) {
        modelMap.addAttribute("climbersAll", climberDao.findById(climber_id).get());
        return "climbers/profil";
    }
    @GetMapping("climbers/remove/{climber_id}")
    public String remove(@ModelAttribute Climber climber){
        climberDao.deleteById(climber.getClimber_id());
        return "redirect:/hello";
    }
    @GetMapping("/routes/addWay")
    public String home() {
        return "/routes/addWay";
    }

}
