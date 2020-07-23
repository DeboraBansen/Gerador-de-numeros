package com.mod.dados;

public class Fatoriais extends Gerador {

	public void gerar(int qtd) {
		int cont=1;
		for(int i=1;i<=qtd;i++) {
			for(int j=1;j<=i;j++) {
				cont=cont*j;
			}
			System.out.println(cont);
			cont=1;
		}
	}
	 public String toString() {
	    	return "Fatoriais";
	    }
	
}
