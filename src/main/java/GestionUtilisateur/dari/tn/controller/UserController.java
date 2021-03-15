package GestionUtilisateur.dari.tn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import GestionUtilisateur.dari.tn.entity.User;
import GestionUtilisateur.dari.tn.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService service;
	
	@GetMapping("/")
	public String viewHomePage(Model model) {
		model.addAttribute("listUser", service.retrieveAllUsers());		
	return "index";
	}
	
	@GetMapping("/showNewUserForm")
	public String showNewUserForm(Model model) {
		// create model attribute to bind form data
		User user = new User();
		model.addAttribute("user", user);
		return "new_user";
	}
	
	@PostMapping("/saveUser")
    public String saveEmployee(@ModelAttribute("user") User user) {
        // save employee to database
        service.addUser(user);
        return "redirect:/";
    }
	
	@GetMapping("/showFormForUpdate/{id}")
	public String showFormForUpdate(@PathVariable ( value = "id") long id, Model model) {
		
		// get employee from the service
		User user = service.getUserById(id);
		
		// set employee as a model attribute to pre-populate the form
		model.addAttribute("user", user);
		return "update_user";
	}
	@GetMapping("/deleteUser/{id}")
	public String deleteUser(@PathVariable (value = "id") long id) {
		
		// call delete employee method 
		this.service.deleteUserById(id);
		return "redirect:/";
	}
}
