package avaj.simulationpackage.aircraftpackage;

public abstract class Aircraft {

	protected long id;
	protected String name;
	protected Coordinates coordinates;

	private static long idCounter;

	protected Aircraft(String name, Coordinates coordinates) {
		id = nextId();
		System.out.println("id: " + id);
		this.name = name;
		this.coordinates = coordinates;
	}

	private long nextId() { return ++idCounter; }

}
