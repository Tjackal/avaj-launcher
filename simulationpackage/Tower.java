package avaj.simulationpackage;

import java.util.*;
import avaj.simulationpackage.aircraftpackage.Flyable;

public abstract class Tower {

	private List<Flyable> observers = new ArrayList<Flyable>();

	public void register(Flyable flyable) {
		observers.add(flyable);
		System.out.print("Tower says: ");
	}

	public void unregister(Flyable flyable) {
		observers.remove(flyable);
	}

	protected void conditionsChanged() {
		for (Flyable flyable : observers) {
			flyable.updateConditions();
		}
	}

}