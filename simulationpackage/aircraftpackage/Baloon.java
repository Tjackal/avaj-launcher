package avaj.simulationpackage.aircraftpackage;

import avaj.simulationpackage.WeatherTower;

public class Baloon extends Aircraft implements Flyable {


	private WeatherTower weatherTower;

	Baloon (String name, Coordinates coordinates) {
		super(name, coordinates);
	}

	@Override
	public void updateConditions() {
		String w = weatherTower.getWeather(coordinates);
		if (w == "RAIN") {
			coordinates = new Coordinates(coordinates.getLongitude(), coordinates.getLatitude(), coordinates.getHeight() - 5);
			System.out.println("Baloon#" + this.name 
			+ " (" + this.id + "): rain.");
		}
		else if (w == "FOG") {
			coordinates = new Coordinates(coordinates.getLongitude(), coordinates.getLatitude(), coordinates.getHeight() - 3);
			System.out.println("Baloon#" + this.name 
			+ " (" + this.id + "): fog.");
		}
		else if (w == "SUN") {
			coordinates = new Coordinates(coordinates.getLongitude() + 2, coordinates.getLatitude(), coordinates.getHeight() + 4);
			System.out.println("Baloon#" + this.name 
			+ " (" + this.id + "): sun.");
		}
		else if (w == "SNOW") {
			coordinates = new Coordinates(coordinates.getLongitude(), coordinates.getLatitude(), coordinates.getHeight() - 15);
			System.out.println("Baloon#" + this.name 
			+ " (" + this.id + "): snow.");
		}
	}

	@Override
	public void registerTower(WeatherTower weatherTower) {
		this.weatherTower = weatherTower;
		weatherTower.register(this);
		System.out.println("Baloon#" + this.name 
			+ " (" + this.id + ") registered to weather tower.");
	}

}