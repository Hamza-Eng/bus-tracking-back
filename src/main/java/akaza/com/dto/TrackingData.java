package akaza.com.dto;

import java.time.LocalDateTime;

import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;


@Builder
@Data
public class TrackingData {
   
    private long trackingId;
    
//    @ManyToOne
//    private Bus bus;
    
    private double latitude;
    private double longitude;
    private LocalDateTime timestamp;
    
    // Constructors, getters, and setters
}
