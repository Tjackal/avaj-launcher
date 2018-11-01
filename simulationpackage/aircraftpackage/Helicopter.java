package avaj.simulationpackage.aircraftpackage;

import avaj.simulationpackage.WeatherTower;

public class Helicopter extends Aircraft implements Flyable {


	private WeatherTower weatherTower;

	Helicopter (String name, Coordinates coordinates) {
		super(name, coordinates);
	}

	@Override
	public void updateConditions() {
		// System.out.println("Helicopter updated  " + coordinates.getHeight());
		String w = weatherTower.getWeather(coordinates);
		if (w == "RAIN") {
			coordinates = new Coordinates(coordinates.getLongitude() + 5, coordinates.getLatitude(), coordinates.getHeight());
			System.out.println("Helicopter#" + this.name 
			+ " (" + this.id + "): rain.");
		}
		else if (w == "FOG") {
			coordinates = new Coordinates(coordinates.getLongitude() + 1, coordinates.getLatitude(), coordinates.getHeight());
			System.out.println("Helicopter#" + this.name 
			+ " (" + this.id + "): fog.");
		}
		else if (w == "SUN") {
			coordinates = new Coordinates(coordinates.getLongitude() + 10, coordinates.getLatitude(), coordinates.getHeight() + 2);
			System.out.println("Helicopter#" + this.name 
			+ " (" + this.id + "): sun.");
		}
		else if (w == "SNOW") {
			coordinates = new Coordinates(coordinates.getLongitude(), coordinates.getLatitude(), coordinates.getHeight() - 12);
			System.out.println("Helicopter#" + this.name 
			+ " (" + this.id + "): snow.");
		}
	}

	@Override
	public void registerTower(WeatherTower weatherTower) {
		this.weatherTower = weatherTower;
		weatherTower.register(this);
		System.out.println("Helicopter#" + this.name 
			+ " (" + this.id + ") registered to weather tower.");
	}

}
