package br.edu.ifms.application;

import br.edu.ifms.dao.DaoGenerico;
import br.edu.ifms.model.Carro;
import br.edu.ifms.model.Pessoa;

public class FindByIdApplication {

    public static void main(String[] args) {

        DaoGenerico<Pessoa> daoPessoa = new DaoGenerico<>();
        DaoGenerico<Carro> daoCarro = new DaoGenerico<>();

        Pessoa pessoa = daoPessoa.findById(Pessoa.class, 1L);
        Carro carro = daoCarro.findById(Carro.class, 1L);

        System.out.println("### Entidade Pessoa encontrada ###");
        System.out.println("ID: " + pessoa.getId());
        System.out.println("NOME: " + pessoa.getNome());

        System.out.println("");

        System.out.println("### Entidade Carro encontrada ###");
        System.out.println("ID: " + carro.getId());
        System.out.println("MODELO: " + carro.getModelo());
        
        //tres pessoas que comecam com Raphael!!! Deu certo!!!
//        System.out.println(daoPessoa.findByNome(Pessoa.class, "Raphael", "nome").toString());
        
        for(Pessoa p : daoPessoa.findByNome(Pessoa.class, "Raphael", "nome")){
            //tras a lista de pessoas com esse nome
            System.out.println(p.getId()+" "+p.getNome()+" "+p.getIdade());
        }
        
        for(Carro c : daoCarro.findByNome(Carro.class, "Mustang", "modelo")){
            //tras a lista de carros com esse nome
            System.out.println(c.getId()+" "+c.getModelo()+" "+c.getAnoFabricacao());
        }

    }

}
