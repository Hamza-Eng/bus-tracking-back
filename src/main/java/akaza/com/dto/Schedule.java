package akaza.com.dto;

import java.time.LocalDateTime;

import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Schedule {
   
    private Long scheduleId;
    
//    @ManyToOne
//    private BusRoute route;
    
//    @ManyToOne
//    private Bus bus;
    
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;
    
    // Constructors, getters, and setters
}
