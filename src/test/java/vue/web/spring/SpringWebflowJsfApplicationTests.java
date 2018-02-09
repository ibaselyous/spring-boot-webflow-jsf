package vue.web.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringWebflowJsfApplication.class)
@WebAppConfiguration
public class SpringWebflowJsfApplicationTests {

	@Test
	public void contextLoads() {
	}

}
