package az.car.technician.carproject.repositories;

import az.car.technician.carproject.models.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StateRepository extends JpaRepository<State, Integer> {

}
