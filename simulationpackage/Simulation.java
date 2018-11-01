package avaj.simulationpackage;

import avaj.simulationpackage.aircraftpackage.AircraftFactory;
import avaj.simulationpackage.aircraftpackage.Flyable;
import avaj.simulationpackage.aircraftpackage.Helicopter;
import avaj.simulationpackage.aircraftpackage.Baloon;
import avaj.simulationpackage.aircraftpackage.JetPlane;
import avaj.simulationpackage.WeatherTower;

public class Simulation {

	private static WeatherTower weatherTower = new WeatherTower();

	public static void main(String[] arg) {

		Flyable helicop = AircraftFactory.newAircraft("Helicopter", "loh", 2, 3, 20);
		Flyable helicop2 = AircraftFactory.newAircraft("Helicopter", "pidr", 1, 8, 66);
		Flyable bal = AircraftFactory.newAircraft("Baloon", "zubenko", 23, 44, 32);
		Flyable jet = AircraftFactory.newAircraft("JetPlane", "mafioznik", 654, 33, 20);

		helicop.registerTower(weatherTower);
		helicop2.registerTower(weatherTower);
		bal.registerTower(weatherTower);
		jet.registerTower(weatherTower);

		for (int i = 0; i < 6; i++)
			weatherTower.changeWeather();
	}

}