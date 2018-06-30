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

    private static final int THE_10 = 10;
    /**
     * Useing {@link Random} for random number generation.
     */
    private final Random random;

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
     * de.fh.albsig.mnr85104.weather.business.IWeatherService#fetchWeather(java.
     * lang .String)
     */
    @Override
    public final Weather fetchWeather(final String loc) {
        final Weather w = new Weather();
        w.setTemp(BigDecimal.valueOf(random.nextDouble() * THE_10));
        w.setUuid(UUID.randomUUID().toString());
        w.setLocation(loc);
        return w;
    }

}
