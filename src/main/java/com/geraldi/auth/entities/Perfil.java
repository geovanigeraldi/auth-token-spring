package com.geraldi.auth.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

@Entity
@Table(name = "PERFIL")
public class Perfil implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer perfilId;
	private String perfilDescricao;
	private String authotity;
	
	public Perfil() {		
	}

	public Perfil(Integer perfilId, String perfilDescricao, String authotity) {
		this.perfilId = perfilId;
		this.perfilDescricao = perfilDescricao;
		this.authotity = authotity;
	}

	public Integer getPerfilId() {
		return perfilId;
	}

	public void setPerfilId(Integer perfilId) {
		this.perfilId = perfilId;
	}

	public String getPerfilDescricao() {
		return perfilDescricao;
	}

	public void setPerfilDescricao(String perfilDescricao) {
		this.perfilDescricao = perfilDescricao;
	}

	public String getAuthotity() {
		return authotity;
	}

	public void setAuthotity(String authotity) {
		this.authotity = authotity;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((perfilId == null) ? 0 : perfilId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Perfil other = (Perfil) obj;
		if (perfilId == null) {
			if (other.perfilId != null)
				return false;
		} else if (!perfilId.equals(other.perfilId))
			return false;
		return true;
	}
	
}