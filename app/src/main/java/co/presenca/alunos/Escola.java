package co.presenca.alunos;

public class Escola {

    private long id;
    private String escola;

    public Escola() {
    }

    public Escola(long id, String escola) {
        this.id = id;
        this.escola = escola;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }
}
