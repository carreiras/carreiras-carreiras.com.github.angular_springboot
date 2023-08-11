package carreiras.com.github.helpdeskapi.domain.repositories;

import carreiras.com.github.helpdeskapi.domain.Technician;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TechnicianRepository extends JpaRepository<Technician, Integer> {
}
