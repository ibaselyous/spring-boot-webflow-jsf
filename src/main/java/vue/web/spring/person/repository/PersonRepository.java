package vue.web.spring.person.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vue.web.spring.person.entity.Person;

/**
 * JPA repository for {@link Person persons}.
 */
public interface PersonRepository extends JpaRepository<Person, Long> {
}
