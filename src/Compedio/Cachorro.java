package Compedio;

public class Cachorro extends Mamifero {
    
    public void mostrarStatus() {
        System.out.println("###CACHORRO###\n" 
                         + statusGeral() + statusMamifero() 
                         + "###CACHORRO###" + "\n");
    }
}
