package az.car.technician.carproject.repositories;

import az.car.technician.carproject.models.Location;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface LocationRepository extends CrudRepository<Location, Integer> {

}
