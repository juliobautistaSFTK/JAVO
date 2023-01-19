package jpa.example.demo.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity(name = "monedas")
public class Moneda {

	@Id
	@Column(name = "idmoneda")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idMoneda;
	
	@Column(name = "nombre")
	private String nombre;
	
	//NOTA: Tener mucho cuidado con la implementación de esta anotación, ya que le puede afectar al performance si no se usa adecuadamente.
	//Por default la relación es de tipo LAZY
	@OneToMany(mappedBy = "moneda")//@OneToMany(mappedBy = "moneda", fetch = FetchType.LAZY)
	private List<Cuenta> lstCuentas;
	
	
	public List<Cuenta> getLstCuentas() {
		return lstCuentas;
	}

	public void setLstCuentas(List<Cuenta> lstCuentas) {
		this.lstCuentas = lstCuentas;
	}

	public long getIdMoneda() {
		return idMoneda;
	}

	public void setIdMoneda(long idMoneda) {
		this.idMoneda = idMoneda;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return this.getIdMoneda() + ", " + this.getNombre();
	}
}
