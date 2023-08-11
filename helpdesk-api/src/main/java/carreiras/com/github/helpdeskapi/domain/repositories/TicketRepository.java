package carreiras.com.github.helpdeskapi.domain.repositories;

import carreiras.com.github.helpdeskapi.domain.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Integer> {
}
