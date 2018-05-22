package hello;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SmokeTest {

    // The @Autowired annotation is interpreted by the Spring and the controller is
    // injected before the test methods are run. We are using AssertJ (assertThat() etc.)
    // to express the test assertions.
    @Autowired
    private HomeController controller;

    // The @SpringBootTest annotation tells Spring Boot to go and look for a main configuration class
    // (one with @SpringBootApplication for instance), and use that to start a Spring application context.
    // You can run this test in your IDE or on the command line (mvn test or gradle test) and it should pass.
    // To convince yourself that the context is creating your controller you could add an assertion:
    @Test
    public void contextLoads() throws Exception {
        final String sWho = "SmokeTest::contextLoads";
        System.out.println("*** " + sWho + "(): SHEMP: Makin' sure dha context is creatin' dha controller, Moe...");
        assertThat(controller).isNotNull();
    }
}