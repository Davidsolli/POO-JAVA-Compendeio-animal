package Compedio;

public class Reptil extends Animal {
    
    private String corEscama;
    private boolean Patas;

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    public boolean isPatas() {
        return Patas;
    }

    public void setPatas(boolean Patas) {
        this.Patas = Patas;
    }

    @Override
    public void locomocao() {
        System.out.println("Rastejando");
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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
