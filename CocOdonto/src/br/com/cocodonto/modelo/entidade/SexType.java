package br.com.cocodonto.modelo.entidade;

public enum SexType {

	M("Masculino"), F("Feminino");

	private String descricao;

	private SexType(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
