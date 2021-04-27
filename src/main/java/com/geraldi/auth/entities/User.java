package com.geraldi.auth.entities;

import java.io.Serializable;
import java.time.Instant;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Entity
@Table(name = "USUARIO")
public class User implements UserDetails, Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long usuarioId;
	private String usuarioNome;
	private String usuarioEmail;
	private String usuarioLogin;
	private String usuarioSenha1;
	private String usuarioSenha;
	private Boolean usuarioAtivo;
	private Instant usuarioDataCadastro;
	private Instant usuarioDataAtualizacao;
	private String usuarioMatricula;
	private String usuarioDigito;
	private Instant usuarioDataUltimoAcesso;
	private Integer perfilId;
	private Integer usuarioIdPai;
	private Instant usuarioDtnascimento;
	private String usuarioFoto;
	private String usuarioTokenMps;

	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "PERFIL_ID")
	private Profile roles = new Profile();
	
	public User() {
	}

	public User(Long usuarioId, String usuarioNome, String usuarioEmail, String usuarioLogin, String usuarioSenha1,
			String usuarioSenha, Boolean usuarioAtivo, Instant usuarioDataCadastro, Instant usuarioDataAtualizacao,
			String usuarioMatricula, String usuarioDigito, Instant usuarioDataUltimoAcesso, Integer perfilId,
			Integer usuarioIdPai, Instant usuarioDtnascimento, String usuarioFoto, String usuarioTokenMps) {
		this.usuarioId = usuarioId;
		this.usuarioNome = usuarioNome;
		this.usuarioEmail = usuarioEmail;
		this.usuarioLogin = usuarioLogin;
		this.usuarioSenha1 = usuarioSenha1;
		this.usuarioSenha = usuarioSenha;
		this.usuarioAtivo = usuarioAtivo;
		this.usuarioDataCadastro = usuarioDataCadastro;
		this.usuarioDataAtualizacao = usuarioDataAtualizacao;
		this.usuarioMatricula = usuarioMatricula;
		this.usuarioDigito = usuarioDigito;
		this.usuarioDataUltimoAcesso = usuarioDataUltimoAcesso;
		this.perfilId = perfilId;
		this.usuarioIdPai = usuarioIdPai;
		this.usuarioDtnascimento = usuarioDtnascimento;
		this.usuarioFoto = usuarioFoto;
		this.usuarioTokenMps = usuarioTokenMps;
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

	public String getUsuarioLogin() {
		return usuarioLogin;
	}

	public void setUsuarioLogin(String usuarioLogin) {
		this.usuarioLogin = usuarioLogin;
	}

	public String getUsuarioSenha1() {
		return usuarioSenha1;
	}

	public void setUsuarioSenha1(String usuarioSenha1) {
		this.usuarioSenha1 = usuarioSenha1;
	}

	public String getUsuarioSenha() {
		return usuarioSenha;
	}

	public void setUsuarioSenha(String usuarioSenha) {
		this.usuarioSenha = usuarioSenha;
	}

	public Boolean getUsuarioAtivo() {
		return usuarioAtivo;
	}

	public void setUsuarioAtivo(Boolean usuarioAtivo) {
		this.usuarioAtivo = usuarioAtivo;
	}

	public Instant getUsuarioDataCadastro() {
		return usuarioDataCadastro;
	}

	public void setUsuarioDataCadastro(Instant usuarioDataCadastro) {
		this.usuarioDataCadastro = usuarioDataCadastro;
	}

	public Instant getUsuarioDataAtualizacao() {
		return usuarioDataAtualizacao;
	}

	public void setUsuarioDataAtualizacao(Instant usuarioDataAtualizacao) {
		this.usuarioDataAtualizacao = usuarioDataAtualizacao;
	}

	public String getUsuarioMatricula() {
		return usuarioMatricula;
	}

	public void setUsuarioMatricula(String usuarioMatricula) {
		this.usuarioMatricula = usuarioMatricula;
	}

	public String getUsuarioDigito() {
		return usuarioDigito;
	}

	public void setUsuarioDigito(String usuarioDigito) {
		this.usuarioDigito = usuarioDigito;
	}

	public Instant getUsuarioDataUltimoAcesso() {
		return usuarioDataUltimoAcesso;
	}

	public void setUsuarioDataUltimoAcesso(Instant usuarioDataUltimoAcesso) {
		this.usuarioDataUltimoAcesso = usuarioDataUltimoAcesso;
	}

	public Integer getPerfilId() {
		return perfilId;
	}

	public void setPerfilId(Integer perfilId) {
		this.perfilId = perfilId;
	}

	public Integer getUsuarioIdPai() {
		return usuarioIdPai;
	}

	public void setUsuarioIdPai(Integer usuarioIdPai) {
		this.usuarioIdPai = usuarioIdPai;
	}

	public Instant getUsuarioDtnascimento() {
		return usuarioDtnascimento;
	}

	public void setUsuarioDtnascimento(Instant usuarioDtnascimento) {
		this.usuarioDtnascimento = usuarioDtnascimento;
	}

	public String getUsuarioFoto() {
		return usuarioFoto;
	}

	public void setUsuarioFoto(String usuarioFoto) {
		this.usuarioFoto = usuarioFoto;
	}

	public String getUsuarioTokenMps() {
		return usuarioTokenMps;
	}

	public void setUsuarioTokenMps(String usuarioTokenMps) {
		this.usuarioTokenMps = usuarioTokenMps;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((usuarioId == null) ? 0 : usuarioId.hashCode());
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
		User other = (User) obj;
		if (usuarioId == null) {
			if (other.usuarioId != null)
				return false;
		} else if (!usuarioId.equals(other.usuarioId))
			return false;
		return true;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return roles
				.stream().map(role -> new SimpleGrantedAuthority(role.getAuthotity()))
				.collect(Collectors.toList());
	}

	@Override
	public String getPassword() {
		return usuarioSenha;
	}

	@Override
	public String getUsername() {
		return usuarioEmail;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
