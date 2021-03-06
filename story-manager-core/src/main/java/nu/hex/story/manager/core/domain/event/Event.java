package nu.hex.story.manager.core.domain.event;

import java.time.LocalDate;
import nu.hex.story.manager.core.domain.DomainEntity;

/**
 * Created 2016-okt-13
 *
 * @author hl
 */
public interface Event extends DomainEntity<Long>, Comparable<Event>  {
    
    String getLabel();
    
    void setLabel(String label);

    LocalDate getDate();

    void setDate(LocalDate date);

    void setDate(String date);

    String getDescription();

    void setDescription(String description);

}
