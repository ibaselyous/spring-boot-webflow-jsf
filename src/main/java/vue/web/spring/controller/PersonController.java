package vue.web.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import vue.web.spring.beans.PersonFormBean;
import vue.web.spring.person.boundary.PersonService;
import vue.web.spring.person.entity.Person;

/**
 * Controller to create and store {@link Person person entities}.
 */
@Controller("personController")
public class PersonController {

    @Autowired
    private PersonService personService;

    public PersonFormBean createNewPersonFormBean() {
        return new PersonFormBean();
    }

    public String savePerson(PersonFormBean personFormBean) {
        personService.save(new Person(personFormBean.getFirstName(), personFormBean.getLastName()));
        return "success";
    }

}
