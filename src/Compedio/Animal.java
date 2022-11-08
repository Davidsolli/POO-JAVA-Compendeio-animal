package Compedio;

public abstract class Animal {
    
    protected String habitat;
    protected float peso;
    protected int idade;
    protected int membros;
    
    public String statusGeral() {
        return "habitat = " + habitat  
             + "\npeso = " + peso 
             + "\nidade = " + idade 
             + "\nmembros = " + membros + "\n";
    }
        
    public abstract void locomocao();
    public abstract void tipoNutricao();
    public abstract void Comunicacao();
    public abstract void definirParametros();
    
    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }
}
