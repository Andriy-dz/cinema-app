package cinema.dto.request;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CinemaHallRequestDto {
    @Min(10)
    private int capacity;
    @Size(max = 200)
    private String description;
}
