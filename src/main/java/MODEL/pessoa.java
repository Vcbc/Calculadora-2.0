
package MODEL;


public class pessoa {
    private int id;
    private String nome;
    private int idade;
    private String sexo;
    private double peso;
    private double altura;
    
    public pessoa(int id, String nome, int idade, String sexo, double peso, double altura){
        this.id = id;
        this.nome =  nome;
        this.idade = idade;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        
    }

    public pessoa() {
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getSexo() {
      
        return sexo;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    
    
}
