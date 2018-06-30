package de.fh.albsig.mnr85104.weather;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT)
public class WeatherConrollerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void testAbout() {
        final String message = this.restTemplate.getForObject("/weather",
                String.class);
        assertNotNull(message);
    }

}
