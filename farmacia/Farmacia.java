package br.com.farmacia;

import java.util.ArrayList;
import br.com.farmacia.entidades.*;

public class Farmacia {
	
	private ArrayList<Remedio> remedio;
	
	public Farmacia() {
		remedio = new ArrayList<>();
	}
	
	public void adicionarRemedio (Remedio nRemedio) {
		remedio.add(nRemedio);
	}
	
	public void atualizarEstoque(int codigo, int quantidade) {
		for (Remedio nRemedio : remedio) {
			if (nRemedio.getCodigo() == codigo) {
				nRemedio.setQuantEstoque(quantidade);
			}
		}
	}
	
	public void comprarRemedio(int codigo, int quantidade) {
		for (Remedio nRemedio : remedio) {
			if (nRemedio.getCodigo() == codigo) {
				if (nRemedio.getQuantEstoque() >= quantidade) {
					int retirada = nRemedio.getQuantEstoque() - quantidade;
					nRemedio.setQuantEstoque(retirada);
				}else {
					System.out.println("Temos apenas " + 
						nRemedio.getQuantEstoque() + " " + 
						nRemedio.getNome() + "(s) em estoque.");
				}	
			}
		}
	}
	
	public void listarEstoque() {
		for (Remedio nRemedio : remedio) {
			System.out.println(nRemedio.getCodigo() + " - " + nRemedio.getNome() + 
			" - " + nRemedio.getQuantEstoque() + " em estoque.");
		}
	}
	
	public static void main(String[] args) {
		Farmacia f = new Farmacia();
		
		f.adicionarRemedio(new Remedio(01, "Diporona"));
		f.adicionarRemedio(new Remedio(02, "Nimisulida"));
		f.adicionarRemedio(new Remedio(03, "Dorflex"));
		
		//f.listarEstoque();
		
		f.atualizarEstoque(01, 10);
		f.atualizarEstoque(02, 15);
		f.atualizarEstoque(03, 20);
		
		//f.listarEstoque();
		
		f.comprarRemedio(02, 5);
		
		f.listarEstoque();
	}

}
