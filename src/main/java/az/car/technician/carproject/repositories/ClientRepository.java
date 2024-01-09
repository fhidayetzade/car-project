package az.car.technician.carproject.repositories;

import az.car.technician.carproject.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {

}
