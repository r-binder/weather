package de.fh.albsig.mnr85104.weather;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.UUID;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import de.fh.albsig.mnr85104.weather.business.IWeatherService;
import de.fh.albsig.mnr85104.weather.model.Weather;

public class WeatherServiceTest {
    private String test;

    @BeforeEach
    public void initEach() {
        test = UUID.randomUUID().toString();
    }

    @Test
    public void test() {
        IWeatherService weatherService = mock(IWeatherService.class);

        Weather w = new Weather();
        w.setLocation(test);

        when(weatherService.fetchWeather(Mockito.anyString())).thenReturn(w);

        assertEquals(test, weatherService.fetchWeather("1").getLocation());
    }

}
