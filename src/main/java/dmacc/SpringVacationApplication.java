package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.beans.Destinations;
import dmacc.beans.Traveler;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.DestinationsRepository;

@SpringBootApplication
public class SpringVacationApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringVacationApplication.class, args);
	}

	@Autowired
	DestinationsRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		Destinations d = appContext.getBean("destinations", Destinations.class);
		d.setCountry("United States");
		d.setState("Colorado");
		d.setCity("Denver");
		repo.save(d);
		
		Destinations b = new Destinations("United States", "Texas", "Austin");
		Traveler t = new Traveler("Jamie", "Meis");
		b.setTraveler(t);
		
		List<Destinations> allMyDestinations = repo.findAll();
		for(Destinations places: allMyDestinations) {
			System.out.println(places.toString());
		}
		
		((AbstractApplicationContext) appContext).close();
		
	}

}
