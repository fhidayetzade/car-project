package az.car.technician.carproject.repositories;

import az.car.technician.carproject.models.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {

}