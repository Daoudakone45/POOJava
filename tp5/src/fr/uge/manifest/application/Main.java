package fr.uge.manifest.application;

import fr.uge.manifest.Container;
import fr.uge.manifest.Manifest;
import fr.uge.manifest.Passenger;

public class Main {
	public static void main(String[] args) {
		
		
	    var container1 = new Container("DSVX 123456 5", 500, "Germany");
	    System.out.println(container1.bic());  // DSVX 123456 5
	    System.out.println(container1.weight());  // 500
	    System.out.println(container1.destination());  // Germany
	   
		var container2 = new Container("MSCU 789012 3", 400, "Italy");
	    var container3 = new Container("ONEZ 345678 2", 200, "Austria");
	    var manifest1 = new Manifest();
	    manifest1.add(container2);
	    manifest1.add(container3);
	    
	    var passenger1 = new Passenger("Nicolas F", "France");
	    var container4 = new Container("OOCL 098765 0", 350, "England");
	    var manifest2 = new Manifest();
	    manifest2.add(passenger1);
	    manifest2.add(container4);
	    
	    System.out.println(manifest2.totalPrice());
	    
	    var manifest3 = new Manifest();
	    manifest3.add(new Container("OOCL 098765 0", 350, "England"));
	    manifest3.add(new Passenger("Jane D", "US"));
	    System.out.println(manifest3);
	    // 1. OOCL 098765 0 350kg to England
	    // 2. Jane D to US
	    
	    var manifest4 = new Manifest();
	    manifest4.add(new Container("HAPC 543210 3", 450, "Russia"));
	    manifest4.add(new Container("BICU 123456 5", 200, "China"));
	    manifest4.add(new Container("CMAU 432109 6", 125, "Russia"));
	    manifest4.add(new Passenger("Ana K","Russia"));
	    var embargoed = manifest4.toDestination("Russia");
	    System.out.println(embargoed);
	    // [HAPC 543210 3 450kg to Russia, CMAU 432109 6 125kg to Russia, Ana K to Russia]
	    
	    /*
	    var manifest5 = new Manifest();
	    manifest5.add(new Passenger("James Bond", "UK"));
	    manifest5.add(new Passenger("James Bond", "Iceland"));
	    //manifest5.checkIsInvalid();  // boom !

	    var manifest6 = new Manifest();
	    manifest6.add(new Container("HLLY 345678 5", 30, "Slovenia"));
	    manifest6.add(new Container("HLLY 345678 5", 40, "France"));
	    //manifest6.checkIsInvalid();  // boom 
	    */
	    var manifest7 = new Manifest();
	    manifest7.add(new Container("BICU 123456 7", 100, "Monaco"));
	    manifest7.add(new Container("CXSB 987654 9", 200, "Luxembourg"));
	    manifest7.add(new Container("EYRA 321098 6", 50, "Paris"));
	    manifest7.add(new Container("DNVN 543210 8", 300, "Monaco"));
	    manifest7.add(new Passenger("Dimitri From", "Paris"));
	    System.out.println(manifest7.weightPerDestination());
	      // {Monaco=400, Luxembourg=200, Paris=50}
	  }

}