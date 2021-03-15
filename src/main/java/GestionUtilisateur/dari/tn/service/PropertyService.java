package GestionUtilisateur.dari.tn.service;

import java.util.List;

import GestionUtilisateur.dari.tn.entity.Property;

public interface PropertyService {
	
	List<Property> retrieveAllProperty();

	Property addProperty(Property p);
	
	void deleteProperty(String id);
	
	Property updateProperty(Property p);
	
	Property retrieveProperty(String id);

	Property getPropertyById(long id);
	
	void deletePropertyById(long id);

}
