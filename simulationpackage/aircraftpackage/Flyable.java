package avaj.simulationpackage.aircraftpackage;

import avaj.simulationpackage.WeatherTower; 

public interface Flyable {
	
	public void updateConditions();
	public void registerTower(WeatherTower weatherTower);

}