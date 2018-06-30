package de.fh.albsig.mnr85104.weather.business;

import de.fh.albsig.mnr85104.weather.model.Weather;

/**
 * Business logic.
 * 
 * @author Robin
 *
 */
public interface IWeatherService {
    /**
     * The weather service.
     * 
     * @param loc
     *            The location
     * @return {@link Weather}
     */
    Weather fetchWeather(String loc);
}
