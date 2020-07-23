package com.mod.dados;

public class Fibonacci extends Gerador {

	public void gerar(int qtd) {
		int f=0;
		int ant=0;
		
		for(int i=1;i<=qtd;i++) {
			if(i==1) {
				f=1;
				ant=0;
			}else {
				f+=ant;
				ant=f-ant;
			}System.out.println(f);
		}
		
	}
	 public String toString() {
	    	return "Fibonacci";
	    }

}
