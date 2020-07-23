package com.mod.dados;

public class Naturais extends Gerador{
	
	public void gerar(int qtd) {
		for(int i=0;i<=qtd;i++) {
			System.out.println(i);
		}
	}
	 public String toString() {
	    	return "Naturais";
	    }
	
}
