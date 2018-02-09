package vue.web.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import vue.web.spring.person.boundary.PersonService;
import vue.web.spring.person.entity.Address;
import vue.web.spring.person.entity.Country;
import vue.web.spring.person.entity.Person;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"vue.web.spring.person.repository"})
@EntityScan(basePackages = {"vue.web.spring.person.entity"})
public class SpringWebflowJsfApplication implements CommandLineRunner {

    @Autowired
    private PersonService personService;

    public static void main(String[] args) {
        SpringApplication.run(SpringWebflowJsfApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Person person = new Person("Hans", "Mustermann");
        Address address = new Address("Hauptstrasse 12", "70179", "Stuttgart", Country.GERMANY, "12345", "test@example.com");
        person.getAddresses().add(address);
        personService.save(person);
        person = new Person("Sabine", "Huber");
        address = new Address("Mainstreet 1a", "55555", "London", Country.GB, "12345", "dummy@example.com");
        person.getAddresses().add(address);
        personService.save(person);
    }
}
