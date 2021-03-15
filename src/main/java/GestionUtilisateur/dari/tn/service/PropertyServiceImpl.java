package GestionUtilisateur.dari.tn.service;

import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import GestionUtilisateur.dari.tn.entity.Property;
import GestionUtilisateur.dari.tn.repository.PropertyRepository;


@Service
public class PropertyServiceImpl implements PropertyService {
	
	@Autowired
	PropertyRepository propertyRepository;
	
	private static final Logger L = LogManager.getLogger(UserServiceImpl.class);

	@Override
	public List<Property> retrieveAllProperty() {
		List<Property> propertys = (List<Property>) propertyRepository.findAll();
		for (Property property : propertys) {
			L.info("property :" + property);
		}
		return propertys ;
	}

	@Override
	public Property addProperty(Property p) {
		// TODO Auto-generated method stub
		return propertyRepository.save(p);
	}

	@Override
	public void deleteProperty(String id) {
		// TODO Auto-generated method stub
		propertyRepository.deleteById(Long.parseLong(id));
	}

	@Override
	public Property updateProperty(Property p) {
		// TODO Auto-generated method stub
		return propertyRepository.save(p);
	}

	@Override
	public Property retrieveProperty(String id) {
		// TODO Auto-generated method stub
		return (Property) propertyRepository.findAll();
	}

	@Override
	public Property getPropertyById(long id) {
		// TODO Auto-generated method stub
		Optional<Property> optional = propertyRepository.findById(id);
		Property property = null;
		if (optional.isPresent()) {
			property = optional.get();
		} else {
			throw new RuntimeException("Property not found for id :: " + id);
		}
		return property;
	}

	@Override
	public void deletePropertyById(long id) {
		// TODO Auto-generated method stub
		this.propertyRepository.deleteById(id);
	}

}
