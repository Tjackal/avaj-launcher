package avaj.simulationpackage;

import avaj.simulationpackage.aircraftpackage.Coordinates;
import avaj.weather.WeatherProvider;

public class WeatherTower extends Tower {

	public String getWeather(Coordinates coordinates) {
		return WeatherProvider.getProvider().getCurrentWeather(coordinates);
	}

	void changeWeather() {
		conditionsChanged();
	}

}