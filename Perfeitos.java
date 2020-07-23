package com.mod.dados;

public class Perfeitos extends Gerador {
	
	public void gerar(int qtd) {
		int cont=0;
		for(int i=1;i<=qtd;i++) {
			for(int j=1;j<i;j++) {
				if(i%j==0) {
					cont+=j;
				}
			}if(cont==i) {
				System.out.println(i);
				cont=0;
			}else {
				cont=0;
			}
		}
	}
	 public String toString() {
	    	return "Perfeitos";
	    }

}
