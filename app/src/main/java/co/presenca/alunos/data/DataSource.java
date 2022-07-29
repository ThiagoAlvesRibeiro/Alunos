package co.presenca.alunos.data;

import java.util.ArrayList;
import java.util.List;

import co.presenca.alunos.Aluno;

public class DataSource {

    private List<Aluno> list = new ArrayList<>();

    public DataSource(List<Aluno> list) {

        this.list = list;

        list.add(new Aluno(1,"Manoel Soares",21));
        list.add(new Aluno(2,"Antonio Da Silva",24));
        list.add(new Aluno(3,"Thiago Alves",18));

    }

    public List<Aluno> getList() {return list;}

   public List<String> getNomelist(List<String> nomes){
     this.list.stream().forEach(aluno -> aluno.getNome());

        return null;
   };
}
