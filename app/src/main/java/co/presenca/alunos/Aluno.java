package co.presenca.alunos;


public class Aluno {


    private long id;
    private String nome;
    private Integer idade;



    public Aluno(long id, String nome, Integer idade) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;

    }

    public Aluno() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
}