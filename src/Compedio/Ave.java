package Compedio;

import java.util.Scanner;

public class Ave extends Animal {
    
    private String corPena;
    private boolean voo;
    private boolean selvagem;

    public String statusAve() {
        return "corPena = " + corPena 
             + "\nvoo = " + voo;
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    public boolean isVoo() {
        return voo;
    }

    public void setVoo(boolean voo) {
        this.voo = voo;
    }
    
    public void fazerNinho() {
        System.out.println("Construindo um ninho");
    }
    
    public boolean isSelvagem() {
        return selvagem;
    }

    public void setSelvagem(boolean selvagem) {
        this.selvagem = selvagem;
    }

    @Override
    public void locomocao() {
        System.out.println("Voando");
    }

    @Override
    public void tipoNutricao() {
        System.out.println("Animais onivoros");
    }

    @Override
    public void Comunicacao() {
        System.out.println("Vocalizacao");
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
        System.out.println("ESTE ANIMAL E SELVAGEM?");
        setSelvagem(scan.nextBoolean());
        System.out.println("DIGITE A COR DAS PENAS DESSA AVE");
        setCorPena(scan.next());
        System.out.println("ESTE PODE VOAR?");
        setVoo(scan.nextBoolean());
    }
}
