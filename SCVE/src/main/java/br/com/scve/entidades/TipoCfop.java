package br.com.scve.entidades;

public enum TipoCfop {
	
	ENTRADA("ENTRADA"),
	SAIDA("SAIDA");
	
	private String descricao;
	
	private TipoCfop(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	};
}
