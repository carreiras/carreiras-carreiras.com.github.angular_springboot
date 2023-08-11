package carreiras.com.github.helpdeskapi.domain;

import carreiras.com.github.helpdeskapi.domain.enums.Priority;
import carreiras.com.github.helpdeskapi.domain.enums.Status;

import java.time.LocalDate;
import java.util.Objects;

public class Ticket {

    private Integer id;
    private LocalDate openingDate = LocalDate.now();
    private LocalDate closingDate;
    private Priority priority;
    private Status status;
    private String title;
    private String comment;
    private Technician technician;
    private Customer customer;

    public Ticket(
        Integer id,
        Priority priority,
        Status status,
        String title,
        String comment,
        Technician technician,
        Customer customer
    ) {
        this.id = id;
        this.priority = priority;
        this.status = status;
        this.title = title;
        this.comment = comment;
        this.technician = technician;
        this.customer = customer;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getOpeningDate() {
        return openingDate;
    }

    public void setOpeningDate(LocalDate openingDate) {
        this.openingDate = openingDate;
    }

    public LocalDate getClosingDate() {
        return closingDate;
    }

    public void setClosingDate(LocalDate closingDate) {
        this.closingDate = closingDate;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Technician getTechnician() {
        return technician;
    }

    public void setTechnician(Technician technician) {
        this.technician = technician;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return Objects.equals(id, ticket.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
