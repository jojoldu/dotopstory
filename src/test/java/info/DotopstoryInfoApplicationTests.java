package info;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import dotop.DotopstoryInfoApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DotopstoryInfoApplication.class)
@WebAppConfiguration
public class DotopstoryInfoApplicationTests {

	@Test
	public void contextLoads() {
	}

}
