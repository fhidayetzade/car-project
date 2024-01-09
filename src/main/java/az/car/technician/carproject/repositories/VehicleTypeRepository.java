package az.car.technician.carproject.repositories;

import az.car.technician.carproject.models.VehicleType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface VehicleTypeRepository extends JpaRepository<VehicleType, Integer> {

}
