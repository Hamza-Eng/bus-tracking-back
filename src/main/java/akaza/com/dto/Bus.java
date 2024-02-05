package akaza.com.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Bus {
	private long id;
	private String name;
	private int number;

}
