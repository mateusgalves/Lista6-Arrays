/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista6arrays;

/**
 *
 * @author aluno
 */
public class Carro {
    
    private String modelo;
    private int ano;
    private int c;
    private double preco[] = new double[5];
    
    public double getPmedio() {
        double soma = 0;
        for (int c = 0; c < preco.length; c++) {
            soma = soma + preco[c];
        }
        return soma / preco.length;
        
    }
    
    public double getMaior() {
        double maior = preco[0];
        for (int c = 0; c < preco.length; c++) {
            if (preco[c] > maior) {
                maior = preco[c];
            }            
        }
        return maior;
    }
    
    public double getMenor() {
        double menor = preco[0];
        for (int c = 0; c < preco.length; c++) {
            if (preco[c] < menor) {
                menor = preco[c];
            }
        }
        return menor;
    }
    
    public Carro(String modelo, double[] preco, int ano) {
        this.modelo = modelo;
        this.preco = preco;
        this.ano = ano;
    }
    
    public void setPreco(double p) {
        System.out.print(p);
    }
    
    public double[] getPreco() {
        return preco;
    }

    public void setModelo(String m) {
        System.out.print(m);
    }
    public String getModelo (){
        return modelo;
    }
    
    public void setAno (int a){
        System.out.print(a);
    }
    public int getAno(){
        return ano;
    }
    
}
