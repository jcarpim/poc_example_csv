package com.example.csv;

public class CsvVoo {
    private String origem;
    private String destino;
    private String saida;
	private String chegada;

	public CsvVoo(String origem, String destino, String saida, String chegada) {
		super();
		this.origem = origem;
		this.destino = destino;
		this.saida = saida;
		this.chegada = chegada;
	}

    public String toString() {
        return "CsvVoo{Origem='" + origem + "\', Destino=" + destino + "\', Saida='" + saida + "\' +, Chegada='" + chegada + "\'}";
    }

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getSaida() {
		return saida;
	}

	public void setSaida(String saida) {
		this.saida = saida;
	}

	public String getChegada() {
		return chegada;
	}

	public void setChegada(String chegada) {
		this.chegada = chegada;
	}
    
    
}
