package pl.mprzybylski.climbingWall.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.mprzybylski.climbingWall.dao.ClimberDao;

@Controller
public class SearchController {


    @Autowired
    private ClimberDao climberDao;


    @GetMapping("/climbers/search")
    public String search(@RequestParam String name, ModelMap modelMap){
        modelMap.put("climber",climberDao.findByName(name).get());
        return "climbers/result";
    }

    @GetMapping("/search")
    public String display(){
        return "climbers/search";
    }
}
