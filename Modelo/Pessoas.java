package Modelo;


public class Pessoas {
    String id;
    String nome;
    String endereço;
    String telefone;
    String disciplina;
    public Pessoas(){
    }
    
    public Pessoas(String id, String nome, String endereço, String telefone){
        this.id = id;
        this.nome = nome;
        this.endereço = endereço;
        this.telefone = telefone;
        this.disciplina = disciplina;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
       public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
}
