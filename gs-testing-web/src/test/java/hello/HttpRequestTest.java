package hello;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class HttpRequestTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void greetingShouldReturnDefaultMessage() throws Exception {
        final String sWho = "HttpRequestTest::greetingShouldReturnDefaultMessage";
        System.out.println("*** " + sWho + "(): SHEMP: Gee, Moe, let's see if dha service retoyns a \"" + hello.HomeController.S_HELLO_WORLD + "\"...");
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/",
                String.class)).contains(hello.HomeController.S_HELLO_WORLD);
    }
}
