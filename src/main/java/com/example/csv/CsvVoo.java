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
}
