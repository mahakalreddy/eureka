package name;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeName {

	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	public EmployeeNameModel empna(){
		
		EmployeeNameModel em=new EmployeeNameModel();
		em.setName("pruthvi...This is from employee name class");
		return em;
	}
	
}
