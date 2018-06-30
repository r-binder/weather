package de.fh.albsig.mnr85104.weather.business.impl;

import java.math.BigDecimal;
import java.util.Random;
import java.util.UUID;

import org.springframework.stereotype.Service;

import de.fh.albsig.mnr85104.weather.business.IWeatherService;
import de.fh.albsig.mnr85104.weather.model.Weather;

/**
 * Weather Service implementation.
 * 
 * @author Robin
 *
 */
@Service
public class WeatherService implements IWeatherService {

    private Random random;

    /**
     * The Constructor.
     * 
     */
    public WeatherService() {
        random = new Random();
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * de.fh.albsig.mnr85104.weather.business.IWeatherService#fetchWeather(java.lang
     * .String)
     */
    @Override
    public Weather fetchWeather(String loc) {
        Weather w = new Weather();
        w.setTemp(BigDecimal.valueOf(random.nextDouble() * 10));
        w.setUuid(UUID.randomUUID().toString());
        w.setLocation(loc);
        return w;
    }

}
