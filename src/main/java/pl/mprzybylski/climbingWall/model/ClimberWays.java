package pl.mprzybylski.climbingWall.model;

public class ClimberWays {

   public static String createTableClimberWays = "CREATE TABLE `climber_ways`( " +
           "`climber_id` int(11) NOT NULL," +
           " `climbing_id` int(11) NOT NULL, " +
           "PRIMARY KEY(`climber_id`,`climbing_id`), " +
           "KEY `climbing_id` (`climbing_id`), " +
           "CONSTRAINT `climber_ways_ibfk_1` " +
           "FOREIGN KEY (`climber_id`) REFERENCES `climber` (`climber_id`), " +
           "CONSTRAINT `climber_ways_ibfk_2` " +
           "FOREIGN KEY (`climbing_id`) REFERENCES `climbing_route` (`climbing_id`)) " +
           "ENGINE=MyISAM DEFAULT CHARSET=utf8;";
}
