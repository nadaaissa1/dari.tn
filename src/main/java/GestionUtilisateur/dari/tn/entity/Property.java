package GestionUtilisateur.dari.tn.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "P_PROPERTY")
public class Property implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="type_prop")
	private String typeProp;
	@Column(name="name_prop")
	private String nameProp;
	@Column(name="city_prop")
	private String cityProp;
	@Column(name="adresse_prop")
	private String adresseProp; 
	@Column(name="image_prop")
	private String imageProp;
	@Column(name="category_prop")
	private String categoryProp;
	@Temporal(TemporalType.DATE)
	private Date dateAjout;
	@Enumerated(EnumType.STRING)
	PropertyType propretytype;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTypeProp() {
		return typeProp;
	}
	public void setTypeProp(String typeProp) {
		this.typeProp = typeProp;
	}
	public String getNameProp() {
		return nameProp;
	}
	public void setNameProp(String nameProp) {
		this.nameProp = nameProp;
	}
	public String getCityProp() {
		return cityProp;
	}
	public void setCityProp(String cityProp) {
		this.cityProp = cityProp;
	}
	public String getAdresseProp() {
		return adresseProp;
	}
	public void setAdresseProp(String adresseProp) {
		this.adresseProp = adresseProp;
	}
	public String getImageProp() {
		return imageProp;
	}
	public void setImageProp(String imageProp) {
		this.imageProp = imageProp;
	}
	public String getCategoryProp() {
		return categoryProp;
	}
	public void setCategoryProp(String categoryProp) {
		this.categoryProp = categoryProp;
	}
	public Date getDateAjout() {
		return dateAjout;
	}
	public void setDateAjout(Date dateAjout) {
		this.dateAjout = dateAjout;
	}
	

}
