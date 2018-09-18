package fund.io;

import java.io.Serializable;
import java.util.ArrayList;

public class Curso implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1636594303858428204L;
	
	private PersonaSerializable[] personas;

	public PersonaSerializable[] getPersonas() {
		return personas;
	}

	public void setPersonas(PersonaSerializable[] personas) {
		this.personas = personas;
	}

	public Curso(ArrayList<PersonaSerializable> personas) {
		super();
		PersonaSerializable[] personitas = new PersonaSerializable[personas.size()];
		for (int i = 0; i < personas.size() ; i ++) {
			personitas[i] = personas.get(i);
		}
		this.personas = personitas;
	}
	
}
