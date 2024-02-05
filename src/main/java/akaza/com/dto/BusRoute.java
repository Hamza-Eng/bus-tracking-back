package akaza.com.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class BusRoute {
   
    private Long routeId;
    private String routeName;
    private String startingPoint;
    private String endPoint;
    
//    @OneToMany(mappedBy = "route")
//    private List<Bus> buses;
//    
//    @OneToMany(mappedBy = "route")
//    private List<Schedule> schedules;
    
    // Constructors, getters, and setters
}
