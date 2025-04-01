package fr.uge.manifest;

public record Passenger(String name, String destination) implements Transportable{

	@Override
	public int price() {
		return 10;
	}
	
	@Override
	public String identifier() {
		return name;
	}
	
	
	@Override
	public String toString() {
		return name + " " + destination;
	}

	@Override
	public int weight() {
		return 0;
	}





	
		

}
