package com.tsswebapps.payflow.model;

import com.tsswebapps.payflow.enums.BancosBrasileiros;
import com.tsswebapps.payflow.enums.TipoConta;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "conta")
@SequenceGenerator(name = "seq_conta", sequenceName = "seq_conta", allocationSize = 1, initialValue = 1)
public class Conta implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_conta")
	private Long id;

	private String descricao;

	@Enumerated(EnumType.STRING)
	private TipoConta tipoConta;

	@Enumerated(EnumType.STRING)
	private BancosBrasileiros banco;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "usuario_id", referencedColumnName = "id", unique = false, foreignKey = @ForeignKey(name = "fk_usuario_conta"))
	private Usuario usuario;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public TipoConta getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(TipoConta tipoConta) {
		this.tipoConta = tipoConta;
	}

	public BancosBrasileiros getBanco() {
		return banco;
	}

	public void setBanco(BancosBrasileiros banco) {
		this.banco = banco;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Conta [id=" + id + ", descricao=" + descricao + ", tipoConta=" + tipoConta + ", bancosBrasileiros="
				+ banco + ", usuario=" + usuario + "]";
	}


}
