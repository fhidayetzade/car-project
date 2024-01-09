package az.car.technician.carproject.controllers;

import java.util.Optional;

import az.car.technician.carproject.models.VehicleModel;
import az.car.technician.carproject.services.VehicleModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class VehicleModelController {

	
	@Autowired private VehicleModelService vehicleModelService;
	
	//Get All VehicleModels
	@GetMapping("vehicleModels")
	public String findAll(Model model){		
		model.addAttribute("vehicleModels", vehicleModelService.findAll());
		return "vehicleModel";
	}	
	
	@RequestMapping("vehicleModels/findById") 
	@ResponseBody
	public Optional<VehicleModel> findById(Integer id)
	{
		return vehicleModelService.findById(id);
	}
	
	//Add VehicleModel
	@PostMapping(value="vehicleModels/addNew")
	public String addNew(VehicleModel vehicleModel) {
		vehicleModelService.save(vehicleModel);
		return "redirect:/vehicleModels";
	}	
	
	@RequestMapping(value="vehicleModels/update", method = {RequestMethod.PUT, RequestMethod.GET})
	public String update(VehicleModel vehicleModel) {
		vehicleModelService.save(vehicleModel);
		return "redirect:/vehicleModels";
	}
	
	@RequestMapping(value="vehicleModels/delete", method = {RequestMethod.DELETE, RequestMethod.GET})	
	public String delete(Integer id) {
		vehicleModelService.delete(id);
		return "redirect:/vehicleModels";
	}

}
