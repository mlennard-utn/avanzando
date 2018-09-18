package fund.io;

import java.io.Serializable;
import java.util.Date;

public class PersonaSerializable implements Serializable {
	

	private static final long serialVersionUID = 1531759999460873284L;

	private String name;
	private Date fechaNacimiento;
	private transient Double edadActual;
	
	public PersonaSerializable(String name, Date fechaNacimiento, Double edadActual) {
		super();
		this.name = name;
		this.fechaNacimiento = fechaNacimiento;
		this.edadActual = edadActual;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Double getEdadActual() {
		return edadActual;
	}

	public void setEdadActual(Double edadActual) {
		this.edadActual = edadActual;
	}

}

