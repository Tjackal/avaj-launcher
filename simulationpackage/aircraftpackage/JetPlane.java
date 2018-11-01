package avaj.simulationpackage.aircraftpackage;

import avaj.simulationpackage.WeatherTower;

public class JetPlane extends Aircraft implements Flyable {


	private WeatherTower weatherTower;

	JetPlane (String name, Coordinates coordinates) {
		super(name, coordinates);
	}

	@Override
	public void updateConditions() {
		String w = weatherTower.getWeather(coordinates);
		if (w == "RAIN") {
			coordinates = new Coordinates(coordinates.getLongitude(), coordinates.getLatitude() + 5, coordinates.getHeight());
			System.out.println("JetPlane#" + this.name 
			+ " (" + this.id + "): rain.");
		}
		else if (w == "FOG") {
			coordinates = new Coordinates(coordinates.getLongitude(), coordinates.getLatitude() + 1, coordinates.getHeight());
			System.out.println("JetPlane#" + this.name 
			+ " (" + this.id + "): fog.");
		}
		else if (w == "SUN") {
			coordinates = new Coordinates(coordinates.getLongitude(), coordinates.getLatitude() + 10, coordinates.getHeight() + 2);
			System.out.println("JetPlane#" + this.name 
			+ " (" + this.id + "): sun.");
		}
		else if (w == "SNOW") {
			coordinates = new Coordinates(coordinates.getLongitude(), coordinates.getLatitude(), coordinates.getHeight() - 7);
			System.out.println("JetPlane#" + this.name 
			+ " (" + this.id + "): snow.");
		}
	}

	@Override
	public void registerTower(WeatherTower weatherTower) {
		this.weatherTower = weatherTower;
		weatherTower.register(this);
		System.out.println("JetPlane#" + this.name 
			+ " (" + this.id + ") registered to weather tower.");
	}

}