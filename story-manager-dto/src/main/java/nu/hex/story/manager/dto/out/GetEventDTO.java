package nu.hex.story.manager.dto.out;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.time.LocalDate;
import javax.validation.constraints.NotNull;

/**
 * Created 2016-jun-28
 *
 * @author hl
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class GetEventDTO {

    @NotNull
    private Long id;
    private String date;
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}