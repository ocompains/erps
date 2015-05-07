package org.cuatrovientos.cremme;

/**
 * Represents an inhabitant of the village
 * @author OSKAR
 *
 */

public class Inhabitant {
	private String Name;
	private String DNI;
	
	/**
	 * @param Name
	 * @param DNI
	 */
	public Inhabitant(String Name,String DNI){
		
		this.Name = Name ;
		this.DNI = DNI;
		
		
		
	}
	
	/**
	 * shows INHABITANT WIHT DNI AND NAME
	 * @return
	 */
	public String show () {
	return DNI.toString() + "" + Name;
	}
	/**
	 * @return the NAME
	 */
	public String getInhabitant() {
		return Name;
	}
	/**
	 * @param text the text to set
	 */
	public void setName(String Name) {
	this.Name = Name;
	}
	/**
	 * @return the date
	 */
	public String getDNI() {
	return DNI;
	}
	/**
	 * @param date the date to set
	 */
	public void setDNI(String DNI) {
	this.DNI = DNI;
	}


}
