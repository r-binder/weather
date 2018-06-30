package de.fh.albsig.mnr85104.weather.controller;

import org.apache.commons.lang3.Validate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import de.fh.albsig.mnr85104.weather.business.IWeatherService;
import de.fh.albsig.mnr85104.weather.model.Weather;

/**
 * Weather rest controller.
 * 
 * @author Robin
 *
 */
@RestController
public class WeatherController {

    @Autowired
    private IWeatherService weatherService;

    /**
     * The rest service.
     * 
     * @param loc
     *            The location
     * @return {@link Weather}
     */
    @RequestMapping(value = "/weather", produces = {
            MediaType.APPLICATION_XML_VALUE }, method = { RequestMethod.GET })
    public final Weather getPersonList(@RequestParam final String loc) {
        Validate.notBlank(loc);
        return weatherService.fetchWeather(loc);
    }
}
