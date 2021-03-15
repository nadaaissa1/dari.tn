package GestionUtilisateur.dari.tn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import GestionUtilisateur.dari.tn.entity.Property;
import GestionUtilisateur.dari.tn.service.PropertyService;



@Controller
public class PropertyController {

	
	@Autowired
	PropertyService propertyservice;
	
	@GetMapping("/")
	public String viewHomePage(Model model) {
		model.addAttribute("listProprety", propertyservice.retrieveAllProperty());		
	return "index";
	}
	
	@PostMapping("/saveProperty")
    public String saveEmployee(@ModelAttribute("property") Property property) {
        // save employee to database
		propertyservice.addProperty(property);
        return "redirect:/";
    }
	
	@GetMapping("/showNewPropretyForm")
	public String showNewPropretyForm(Model model) {
		// create model attribute to bind form data
		Property property = new Property();
		model.addAttribute("property", property);
		return "new_property";
	}
	
	@GetMapping("/showFormForUpdate/{id}")
	public String showFormForUpdate(@PathVariable ( value = "id") long id, Model model) {
		Property property = propertyservice.getPropertyById(id);
		model.addAttribute("property", property);
		return "update_property";
	}
	
	@GetMapping("/deleteProperty/{id}")
	public String deleteProperty(@PathVariable (value = "id") long id) {
		
		// call delete employee method 
		this.propertyservice.deletePropertyById(id);
		return "redirect:/";
	}
}
