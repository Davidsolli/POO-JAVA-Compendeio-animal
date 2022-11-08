package Compedio;

import java.util.Scanner;

public class Mamifero extends Animal {
    
    private String corPelos;
    private int quantidadeDedos;

    public String statusMamifero() {
        return "corPelos = " + corPelos 
             + "\nquantidadeDedos = " + quantidadeDedos + "\n";
    }
    
    public String getCorPelos() {
        return corPelos;
    }

    public void setCorPelos(String corPelos) {
        this.corPelos = corPelos;
    }

    public int getQuantidadeDedos() {
        return quantidadeDedos;
    }

    public void setQuantidadeDedos(int quantidadeDedos) {
        this.quantidadeDedos = quantidadeDedos;
    }

    @Override
    public void locomocao() {
        System.out.println("Caminhado");
    }

    @Override
    public void tipoNutricao() {
        System.out.println("Animais onivoros");
    }

    @Override
    public void Comunicacao() {
        System.out.println("Sons gerais");
    }

    @Override
    public void definirParametros() {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("DIGITE O HABITAT: ");
        setHabitat(scan.next());
        System.out.println("DIGITE O PESO: ");
        setPeso(scan.nextFloat());
        System.out.println("DIGITE A IDADE");
        setIdade(scan.nextInt());
        System.out.println("DIGITE A QUANTIDADE DE MEMBROS: ");
        setMembros(scan.nextInt());
        System.out.println("DIGITE A COR DOS PELOS DESSE MAMIFERO: ");
        setCorPelos(scan.next());
        System.out.println("DIGITE A QUANTIDADE DE DEDOS: ");
        setQuantidadeDedos(scan.nextInt());
    }
}
