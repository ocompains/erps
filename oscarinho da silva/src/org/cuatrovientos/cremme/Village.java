package org.cuatrovientos.cremme;

import java.util.Vector;

/**
 * represents a village with inhabitants
 * @author OSKAR
 *
 */


public class Village {
	private Vector<Inhabitant> Inhabitants;
	
	/**
	 * default constructor, inits inhabitants vector
	 */
	public Village () {
		Inhabitants = new Vector<Inhabitant>();
	}

	/**
	 * adds inhabitant into village
	 * @param inhabitant

	 */
	public void addInhabitant (Inhabitant Inhabitant) {
		Inhabitants.add(Inhabitant);
		
	}
	/**
	 * removes inhabitant from village
	 */
	public boolean removeInhabitant (int index) {
		if (index < Inhabitants.size()) {
			Inhabitants.remove(index);
			return true;
		} else {
			return false;
			
			
		}
		
	}
/**
 * search one inhabitant from village
 * @param index
 * @return inhabitant referenced by index
 */
public Inhabitant searchInhabitant (int index) {
	if (index < Inhabitants.size()) {
		return Inhabitants.elementAt(index);
	}else {
		return null;
	}
}

/**
 * shows all inhabitants in village
 */
public String showAll() {
	String result = "";
	for (Inhabitant Inhabitant: Inhabitants ) {
		result = result + Inhabitant.show() + "/n";
	}
	
	return result;
}


}
