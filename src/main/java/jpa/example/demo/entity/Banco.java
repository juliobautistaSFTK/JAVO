package jpa.example.demo.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.beans.factory.annotation.Autowired;

import com.sun.xml.bind.v2.runtime.RuntimeUtil.ToStringAdapter;

@Entity(name = "bancos")
public class Banco {

	@Id
	@Column(name = "idbanco")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idBanco;
	
	@Column(name = "nombre")
	private String nombre;
	
	//NOTA: Tener mucho cuidado con la implementación de esta anotación, ya que le puede afectar al performance si no se usa adecuadamente.
	//Por default la relación es de tipo LAZY
	@OneToMany(mappedBy = "banco")//@OneToMany(mappedBy = "banco", fetch = FetchType.LAZY) 
	private List<Cuenta> lstCuentas;
	
	
	public List<Cuenta> getLstCuentas() {
		return lstCuentas;
	}

	public void setLstCuentas(List<Cuenta> lstCuentas) {
		this.lstCuentas = lstCuentas;
	}

	public long getIdBanco() {
		return idBanco;
	}

	public void setIdBanco(long idBanco) {
		this.idBanco = idBanco;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return this.getIdBanco() + ", " + this.getNombre();
	}
}
