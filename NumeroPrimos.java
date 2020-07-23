package com.mod.dados;

public class NumeroPrimos extends Gerador{
	
	public void gerar(int qtd) {
		int cont=0;
		for(int i=2;i<=qtd;i++) {
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					cont++;
				}
			}if(cont==0) {
				System.out.println(i);
			}else {
				cont=0;
			}
		}
	}
	 public String toString() {
	    	return "Numeros Primos";
	    }

}

