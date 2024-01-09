package az.car.technician.carproject.repositories;

import az.car.technician.carproject.models.VehicleStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface VehicleStatusRepository extends JpaRepository<VehicleStatus, Integer> {

}
