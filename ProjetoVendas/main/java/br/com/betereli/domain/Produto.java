package br.com.betereli.domain;

import java.math.BigDecimal;

import anotacao.TipoChave;
import br.com.betereli.dao.Persistente;

public class Produto implements Persistente { 
	
	
	@TipoChave("getCodigo")
	private String codigo;
	
	private String nome;
	
	private BigDecimal valor;

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}



}
