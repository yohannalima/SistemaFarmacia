package br.com.farmacia.entidades;

//import java.util.ArrayList;

public class Remedio {
	
	private String nome;
	//private ArrayList<String> nomesRemedios = new ArrayList<String>();
	private int codigo;
	//private ArrayList<Integer> codigosRemedios = new ArrayList<Integer>();
	private int quantEstoque;
	
	public Remedio(int codigo, String nome) {
		this.nome = nome;
		this.codigo = codigo;
		this.quantEstoque = 0;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getQuantEstoque() {
		return quantEstoque;
	}

	public void setQuantEstoque(int quantEstoque) {
		this.quantEstoque = quantEstoque;
	}

}

