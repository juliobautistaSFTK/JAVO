package jpa.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.sun.xml.bind.v2.runtime.RuntimeUtil.ToStringAdapter;

@Entity(name = "user")
public class User {
	
	@Id
	@Column(name = "iduser")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idUser;

	@Column(name = "user")
	private String user;
	
	@Column(name = "password")
	private String password;

	public Long getIdUser() {
		return idUser;
	}


	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}


	public String getUser() {
		return user;
	}


	public void setUser(String user) {
		this.user = user;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
		
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getIdUser() + ", " + this.getUser() + ", " + this.getPassword();
	}
}
