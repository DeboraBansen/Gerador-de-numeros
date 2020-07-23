package com.mod.apresentacao;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.text.DecimalFormat;
import com.mod.dados.*;


public class Principal {
	
	public static DecimalFormat formatador=new DecimalFormat("0.00");
	public static List<Gerador> lista=new LinkedList<Gerador>();
	public static void main(String[] args) {
		Random r=new Random();
		Gerador gerador;
		
		
		gerador=new Naturais();
		lista.add(gerador);
		
		gerador=new Abundantes();
		lista.add(gerador);
		
		gerador=new Fatoriais();
		lista.add(gerador);
		
		gerador=new Fibonacci();
		lista.add(gerador);
		
		gerador=new NumeroPrimos();
		lista.add(gerador);
		
		gerador=new Perfeitos();
		lista.add(gerador);
		
		gerador=new Quadrados();
		lista.add(gerador);
		
		double [] soma=new double[7];
		double [] mediaArit=new double[7];
		double [] mediaGeo=new double[7];
		double [] variancia=new double[7];
		double [] desvioPadrao=new double[7];
		double [] amplitude=new double[7];
		
		
		
		for(int i=0;i<lista.size();i++) {
			for(int j=0;j<10;j++) {
				lista.get(i).setSequencia(r.nextInt(10)+1);
			}
			System.out.println(lista.get(i).toString());
			System.out.println(lista.get(i).getSequencia());
			System.out.println("Somatorio = "+lista.get(i).somatorio());
			soma[i]=lista.get(i).somatorio();
			System.out.println("Media Aritmetica = "+formatador.format(lista.get(i).mediaAritmetica()));
			mediaArit[i]=lista.get(i).mediaAritmetica();
			System.out.println("Media Geometrica = "+formatador.format(lista.get(i).mediaGeometrica()));
			mediaGeo[i]=lista.get(i).mediaGeometrica();
			System.out.println("Variancia = "+formatador.format(lista.get(i).variancia()));
			variancia[i]=lista.get(i).variancia();
			System.out.println("Desvio Padrao = "+formatador.format(lista.get(i).desvioPadrao()));
			desvioPadrao[i]=lista.get(i).desvioPadrao();
			System.out.println("Amplitude = "+lista.get(i).amplitude());
			amplitude[i]=lista.get(i).amplitude();
			System.out.println();
		}
		
		maior("Maior Somatorio = ", soma);
		maior("Maior Media Aritmetica = ", mediaArit);
		maior("Maior Media Geometrica = ", mediaGeo);
		maior("Maior variancia = ", variancia);
		maior("Maior Desvio Padrao = ",desvioPadrao);
		maior("Maior Amplitude = ", amplitude);
	}
	
	public static void maior(String st, double [] n) {
		for(int i=0;i<7;i++) {
			for(int j=0;j<6;j++) {
				if(n[i]>n[j+1]) {
					double aux=n[j];
					n[j]=n[j+1];
					n[j+1]=aux;
				}
			}
		}
		for(int i=0;i<7;i++) {
			if(lista.get(i).somatorio()==n[6]) {
				System.out.println("\n"+st+" "+ lista.get(i).toString()+" "+formatador.format(n[6]));
			}
			if(lista.get(i).mediaAritmetica()==n[6]) {
				System.out.println("\n"+st+" "+ lista.get(i).toString()+" "+formatador.format(n[6]));
			}
			if(lista.get(i).mediaGeometrica()==n[6]) {
				System.out.println("\n"+st+" "+ lista.get(i).toString()+" "+formatador.format(n[6]));
			}
			if(lista.get(i).variancia()==n[6]) {
				System.out.println("\n"+st+" "+ lista.get(i).toString()+" "+formatador.format(n[6]));
			}
			if(lista.get(i).desvioPadrao()==n[6]) {
				System.out.println("\n"+st+" "+ lista.get(i).toString()+" "+formatador.format(n[6]));
			}
			if(lista.get(i).amplitude()==n[6]) {
				System.out.println("\n"+st+" "+ lista.get(i).toString()+" "+formatador.format(n[6]));
			}
		}
		
		
	}
	
	
}
