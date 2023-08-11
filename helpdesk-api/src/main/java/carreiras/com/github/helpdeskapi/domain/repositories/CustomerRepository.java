package carreiras.com.github.helpdeskapi.domain.repositories;

import carreiras.com.github.helpdeskapi.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
