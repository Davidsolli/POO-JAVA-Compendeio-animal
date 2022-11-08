package Compedio;

public class Arara extends Ave {
    
    public void mostrarStatus() {
        
        System.out.println("###ARARA###\n" 
                         + statusGeral() + statusAve() 
                         + "\nSelvagem = " + isSelvagem() 
                         + "\n###ARARA###\n");
    }
}
