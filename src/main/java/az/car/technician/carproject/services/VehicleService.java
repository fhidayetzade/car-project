package az.car.technician.carproject.services;

import java.util.List;
import java.util.Optional;

import az.car.technician.carproject.models.Vehicle;
import az.car.technician.carproject.repositories.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class VehicleService {
	
	@Autowired
	private VehicleRepository vehicleRepository;
	
	//Get All Vehicles
	public List<Vehicle> findAll(){
		return vehicleRepository.findAll();
	}	
	
	//Get Vehicle By Id
	public Optional<Vehicle> findById(int id) {
		return vehicleRepository.findById(id);
	}	
	
	//Delete Vehicle
	public void delete(int id) {
		vehicleRepository.deleteById(id);
	}
	
	//Update Vehicle
	public void save(Vehicle vehicle) {
		vehicleRepository.save(vehicle);
	}

}
