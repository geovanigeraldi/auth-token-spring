package com.geraldi.auth.dto;

import java.io.Serializable;

import com.geraldi.auth.entities.User;

public class UserDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long usuarioId;
	private String usuarioNome;
	private String usuarioEmail;

	public UserDTO() {
	}

	public UserDTO(Long usuarioId, String usuarioNome, String usuarioEmail) {
		this.usuarioId = usuarioId;
		this.usuarioNome = usuarioNome;
		this.usuarioEmail = usuarioEmail;
	}

	public UserDTO(User entity) {
		usuarioId = entity.getUsuarioId();
		usuarioNome = entity.getUsuarioNome();
		usuarioEmail = entity.getUsuarioEmail();
	}

	public Long getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(Long usuarioId) {
		this.usuarioId = usuarioId;
	}

	public String getUsuarioNome() {
		return usuarioNome;
	}

	public void setUsuarioNome(String usuarioNome) {
		this.usuarioNome = usuarioNome;
	}

	public String getUsuarioEmail() {
		return usuarioEmail;
	}

	public void setUsuarioEmail(String usuarioEmail) {
		this.usuarioEmail = usuarioEmail;
	}

}