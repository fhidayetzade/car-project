package az.car.technician.carproject.services;

import java.util.List;
import java.util.Optional;

import az.car.technician.carproject.models.Country;
import az.car.technician.carproject.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryService {
	
	@Autowired
	private CountryRepository countryRepository;
	
	//Get All Countrys
	public List<Country> findAll(){
		return countryRepository.findAll();
	}	
	
	//Get Country By Id
	public Optional<Country> findById(int id) {
		return countryRepository.findById(id);
	}	
	
	//Delete Country
	public void delete(int id) {
		countryRepository.deleteById(id);
	}
	
	//Update Country
	public void save( Country country) {
		countryRepository.save(country);
	}

}
