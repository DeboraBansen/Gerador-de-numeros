package com.mod.dados;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;


public abstract class Gerador implements ISequencia {
	private List<Integer> sequencia=new LinkedList<Integer>();
	
	public List<Integer> getSequencia() {
		return sequencia;
	}

	public void setSequencia(Integer sequencia) {
		this.sequencia.add(sequencia);
	}
	
	public abstract void gerar(int qtd);

	public int sortear() {
		Random r=new Random();
		return sequencia.get(r.nextInt(sequencia.size()));
	}
	
	public long somatorio() {
		int soma=0;
		
		for(int i=0;i<sequencia.size();i++) {
			soma+=sequencia.get(i);
		}
		
		return soma;
	}
	
	public double mediaAritmetica() {
		int soma=0;
		
		for(int i=0;i<sequencia.size();i++) {
			soma+=sequencia.get(i);
		}
		return soma/(double)sequencia.size();
	}
	
    public double mediaGeometrica() {
    	int prod=1;
		
		for(int i=0;i<sequencia.size();i++) {
			prod*=sequencia.get(i);
		}
		
		return Math.pow(prod, (1.0/sequencia.size()));
    }
	
	public double variancia() {
		double soma=0;
		double media=this.mediaAritmetica();
		
		for(int i=0;i<sequencia.size();i++) {
			soma+=Math.pow((sequencia.get(i)-media), 2);
		}	
		
		return soma/(double)(sequencia.size()-1);
	}
	
	public double desvioPadrao() {
		
		return (Math.sqrt(variancia()));
		
	}
	
	public long amplitude() {
		return Collections.max(sequencia)-Collections.min(sequencia);
	}
}
