package Compedio;

public class Peixe extends Animal{
    
    private String corEscama;
    private boolean aguaDoce;

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
    public void soltarBolhas() {
        System.out.println("Soltando bolhas");
    }

    public boolean isAguaDoce() {
        return aguaDoce;
    }

    public void setAguaDoce(boolean aguaDoce) {
        this.aguaDoce = aguaDoce;
    }

    @Override
    public void locomocao() {
        System.out.println("Nadando");
    }

    @Override
    public void tipoNutricao() {
        System.out.println("Animais onivoros");
    }

    @Override
    public void Comunicacao() {
        System.out.println("Vibracao pela agua");
    }

    @Override
    public void definirParametros() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
