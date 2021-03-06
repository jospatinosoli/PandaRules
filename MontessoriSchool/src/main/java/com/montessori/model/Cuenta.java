package com.montessori.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cuenta")
public class Cuenta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_cuenta")
	private int idCuenta;
	
	@Column(name = "deuda", nullable = false)
	private double deuda;
	
	@Column(name = "promBeca", nullable = false)
	private double promBeca;

	@OneToOne(mappedBy = "cuenta")
	private Alumno alumno;
	
	public Cuenta() {
		super();
	}

	public Cuenta(int idCuenta) {
		this.idCuenta = idCuenta;
	}

	public int getIdCuenta() {
		return idCuenta;
	}

	public void setIdCuenta(int idCuenta) {
		this.idCuenta = idCuenta;
	}

	public double getDeuda() {
		return deuda;
	}

	public void setDeuda(double deuda) {
		this.deuda = deuda;
	}

	public double getPromBeca() {
		return promBeca;
	}

	public void setPromBeca(double promBeca) {
		this.promBeca = promBeca;
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	

}
