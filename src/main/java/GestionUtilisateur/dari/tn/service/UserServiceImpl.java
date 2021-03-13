package GestionUtilisateur.dari.tn.service;

import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import GestionUtilisateur.dari.tn.entity.User;
import GestionUtilisateur.dari.tn.repository.UserRepository;
import GestionUtilisateur.dari.tn.service.UserServiceImpl;


@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userRepository;
	
	private static final Logger L = LogManager.getLogger(UserServiceImpl.class);

	@Override
	public List<User> retrieveAllUsers() {
		List<User> users = (List<User>) userRepository.findAll();
		for (User user : users) {
			L.info("user :" + user);
		}
		return users ;
	}

	@Override
	public User addUser(User u) {
		// TODO Auto-generated method stub
		return userRepository.save(u);
	}

	@Override
	public void deleteUser(String id) {
		// TODO Auto-generated method stub
		userRepository.deleteById(Long.parseLong(id));
		
	}

	@Override
	public User getUserById(long id) {
		Optional<User> optional = userRepository.findById(id);
		User user = null;
		if (optional.isPresent()) {
			user = optional.get();
		} else {
			throw new RuntimeException("User not found for id :: " + id);
		}
		return user;
	}

	@Override
	public User retrieveUser(String id) {
		// TODO Auto-generated method stub
		return (User) userRepository.findAll();
	}

	@Override
	public User updateUser(User u) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUserById(long id) {
		// TODO Auto-generated method stub
		this.userRepository.deleteById(id);
	}

}
