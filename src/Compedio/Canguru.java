package Compedio;

public class Canguru extends Mamifero {
    
    public void mostrarStatus() {
        System.out.println("###MAMIFERO###" 
                         + statusGeral() + statusMamifero() 
                         + "###CANGURU###\n");
    }
}
