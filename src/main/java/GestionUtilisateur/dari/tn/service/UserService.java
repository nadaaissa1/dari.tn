package GestionUtilisateur.dari.tn.service;

import java.util.List;

import GestionUtilisateur.dari.tn.entity.User;



public interface UserService {
	
	List<User> retrieveAllUsers();

	User addUser(User u);
	
	void deleteUser(String id);
	
	User updateUser(User u);
	
	User retrieveUser(String id);

	User getUserById(long id);
	
	void deleteUserById(long id);


}
