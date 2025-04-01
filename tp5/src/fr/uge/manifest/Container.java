package fr.uge.manifest;

import java.util.Objects;


public record Container(String bic, int weight, String destination) implements Transportable {
    
	public Container{
		
		Objects.requireNonNull(bic);
		Objects.requireNonNull(destination);
		
		if (weight < 0) {
			throw new IllegalArgumentException();
		}
	}

	
	@Override
	public int price() {

		return weight*2;
		
	}
	
	@Override
	public String identifier() {
		return bic;
	}
	
	@Override
	public String toString() {
        return bic + " " + weight + "kg to " + destination;
	}


	 @Override
	    public int weight() {
	        return weight;
	    }
}
