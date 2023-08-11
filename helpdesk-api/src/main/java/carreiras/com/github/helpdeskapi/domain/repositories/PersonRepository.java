package carreiras.com.github.helpdeskapi.domain.repositories;

import carreiras.com.github.helpdeskapi.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Integer> {
}
