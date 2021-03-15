package GestionUtilisateur.dari.tn;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;
import GestionUtilisateur.dari.tn.service.UserServiceImpl;



@RunWith(SpringRunner.class)
@SpringBootTest
@ComponentScan()
public class ApplicationTests {
	
	@Autowired
	UserServiceImpl us;

	@Test
	public void testRetrieveAllUsers() {
		us.retrieveAllUsers();
	}
	
}
