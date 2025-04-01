package fr.uge.manifest;
import java.util.*;

public class Manifest {
	private final ArrayList<Transportable> transportables = new ArrayList<Transportable>();
    private final Set<String> identifiers = new HashSet<>();

	public void add(Transportable transportable) {
		Objects.requireNonNull(transportable);
		String id = transportable.identifier();
		
	    if (!identifiers.add(id)) {
	        throw new IllegalStateException("Duplicate identifier found: " + id);
	    }
		transportables.add(transportable);
    }
	
	public int totalPrice() {
		int total = 0;
		
		for (Transportable transportable : transportables) {
			total += transportable.price();
		}
		return total;
	}
	
	public List<Transportable> toDestination(String destination) {
        Objects.requireNonNull(destination);
        List<Transportable> result = new ArrayList<>();
        
        for (Transportable transportable : transportables) {
            if (transportable.destination().equals(destination)) {
                result.add(transportable);
            }
        }
        return result;
    }
		
	
	public Map<String, Integer> weightPerDestination() {
        Map<String, Integer> weights = new HashMap<>();
        
        for (Transportable transportable : transportables) {
            weights.merge(transportable.destination(), transportable.weight(), Integer::sum);
        }
        return weights;
    }

// Question 9 
/* Si on implémente checkIsInvalid en utilisant deux boucles imbriquées pour comparer chaque élément avec tous les autres :
 * On compare chaque élément avec tous les autres éléments donc on aura une complexité de O(n^2)
 * 
 * Si on utilise HashSet on aura une complexité de O(n) dans le pire des cas. Car on va parcourir une seule fois Transportable et 
 * on recupère instantanement lors de la comparaison dans Hashset (O(1)): c'est la particularité de type Hahset.
 * 
*/
/*	public void checkIsInvalid() {
	    Set<String> identifiers = new HashSet<>();

	    for (Transportable transportable : transportables) {
	        String id;
	        if (transportable instanceof Passenger passenger) {
	            id = passenger.name();
	        } else if (transportable instanceof Container container) {
	            id = container.bic();
	        } else {
	            continue;
	        }

	        if (!identifiers.add(id)) {  // add() retourne false si l'élément est déjà présent
	            throw new IllegalStateException("Duplicate identifier found: " + id);
	        }
	    }
	}

*/	
	
	@Override
	public String toString() {
        StringBuilder sb = new StringBuilder();
        int index = 1;
        for (Transportable transportable : transportables) {
            sb.append(index++).append(". ").append(transportable.toString()).append("\n");
        }
        return sb.toString();
    }
}
		

