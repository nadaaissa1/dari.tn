package GestionUtilisateur.dari.tn.repository;

import org.springframework.data.repository.CrudRepository;

import GestionUtilisateur.dari.tn.entity.User;

public interface UserRepository extends CrudRepository<User, Long> {

}
