package carreiras.com.github.helpdeskapi;

import carreiras.com.github.helpdeskapi.domain.Customer;
import carreiras.com.github.helpdeskapi.domain.Technician;
import carreiras.com.github.helpdeskapi.domain.Ticket;
import carreiras.com.github.helpdeskapi.domain.repositories.CustomerRepository;
import carreiras.com.github.helpdeskapi.domain.repositories.TechnicianRepository;
import carreiras.com.github.helpdeskapi.domain.repositories.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

import static carreiras.com.github.helpdeskapi.domain.enums.Priority.MEDIA;
import static carreiras.com.github.helpdeskapi.domain.enums.Profile.ADMIN;
import static carreiras.com.github.helpdeskapi.domain.enums.Profile.CLIENTE;
import static carreiras.com.github.helpdeskapi.domain.enums.Status.ANDAMENTO;

@SpringBootApplication
public class HelpdeskApiApplication implements CommandLineRunner {

    @Autowired
    private TechnicianRepository technicianRepository;

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private TicketRepository ticketRepository;

    public static void main(String[] args) {
        SpringApplication.run(HelpdeskApiApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Technician tech1 = new Technician(
            null,
            "Admin",
            "64977093046",
            "admin@email.com",
            "123456"
        );
        tech1.addProfile(ADMIN);

        Customer cust1 = new Customer(
            null,
            "Ulpoyrandir",
            "17577156060",
            "ulpoyrandir@gmail.com",
            "123456"
        );
        cust1.addProfile(CLIENTE);

        Ticket tick1 = new Ticket(
            null,
            MEDIA,
            ANDAMENTO,
            "Chamado 01",
            "Primeiro chamado",
            tech1,
            cust1
        );

        technicianRepository.saveAll(Arrays.asList(tech1));
        customerRepository.saveAll(Arrays.asList(cust1));
        ticketRepository.saveAll(Arrays.asList(tick1));
    }
}
