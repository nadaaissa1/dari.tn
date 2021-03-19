package tn.dari.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.dari.entity.Property;

@Repository
public interface PropertyRepository extends CrudRepository <Property , Long> {

}
