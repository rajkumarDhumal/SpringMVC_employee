package SpringMVC_Employee;


import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "SpringMVC_Employee")
public class EmployeeConfiguration {
	@Bean 
	public EntityManager getEntityManager() {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("raj");
        EntityManager manager=factory.createEntityManager();
		return manager; 
	}
	@Bean
	public EntityTransaction getTransaction() {
		EntityManager manager=getEntityManager();
		EntityTransaction transcation=manager.getTransaction();
		return transcation;
	}
}
