package jpa.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity(name = "cuentas")
public class Cuenta {

	@Id
	@Column(name = "idcuenta")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idCuenta;
	
	@Column(name = "descripcion")
	private String descripcion;
	
	@Column(name = "titular")
	private String titular;
	
	//Many Cuentas To One Banco => Esta anotación nos permite definir una relacion @OneToMany en Banco. (Mapeandolo a este campo "banco")
	//Para evitar que la consulta sea ciclica (información redundante) se debe agregar la anotación @JsonIgnore
	@ManyToOne
	@JoinColumn(name = "idBanco")
	@JsonIgnore
	private Banco banco;
	
	//Many Cuentas To One Moneda => Esta anotación nos permite definir una relacion @OneToMany en Modena. (Mapeandolo a este campo "moneda")
	//Para evitar que la consulta sea ciclica (información redundante) se debe agregar la anotación @JsonIgnore
	@ManyToOne
	@JoinColumn(name = "idMoneda")
	@JsonIgnore
	private Moneda moneda;
}
