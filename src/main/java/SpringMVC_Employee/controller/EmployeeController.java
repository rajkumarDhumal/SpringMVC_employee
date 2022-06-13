package SpringMVC_Employee.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import SpringMVC_Employee.dao.EmployeeDao;
import SpringMVC_Employee.dto.Employee;

@RestController
public class EmployeeController {
	@Autowired
    EmployeeDao dao;
	
	@RequestMapping("registration")
	public ModelAndView save() {
		ModelAndView view =new ModelAndView();
		view.addObject("employee", new Employee());
		view.setViewName("registration.jsp");
		return view;
	}
	
	@PostMapping("/save")
	public Employee savEmployee(@ModelAttribute Employee employee) {
		return dao.saveEmployee(employee);
	}
	@PostMapping("/update")
	public Employee updateEmployee(@ModelAttribute Employee employee) {
		return null;
	}
}
 