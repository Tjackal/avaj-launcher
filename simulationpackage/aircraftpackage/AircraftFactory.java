package avaj.simulationpackage.aircraftpackage; 

public abstract class AircraftFactory {

	public static Flyable newAircraft(String type, String name,
	int longitude, int latitude, int height) {
		if (type == "Helicopter") {
			System.out.println("is HELI");
			return new Helicopter(name, new Coordinates(longitude, latitude, height));
		}
		else if (type == "Baloon") {
			System.out.println("is Baloon");
			return new Baloon(name, new Coordinates(longitude, latitude, height));
		}
		else if (type == "JetPlane") {
			System.out.println("is Jet");
			return new JetPlane(name, new Coordinates(longitude, latitude, height));
		}
		return null;
	}

}