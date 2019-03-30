package br.edu.ifms.application;

import br.edu.ifms.dao.DaoGenerico;
import br.edu.ifms.model.Carro;
import br.edu.ifms.model.Pessoa;

public class FindByIdApplication {

    public static void main(String[] args) {

        DaoGenerico<Pessoa> daoPessoa = new DaoGenerico<>();
        DaoGenerico<Carro> daoCarro = new DaoGenerico<>();

        Pessoa pessoa = daoPessoa.findById(Pessoa.class, 3L);
        Carro carro = daoCarro.findById(Carro.class, 4L);

        System.out.println("### Entidade Pessoa encontrada ###");
        System.out.println("ID: " + pessoa.getId());
        System.out.println("NOME: " + pessoa.getNome());

        System.out.println("");

        System.out.println("### Entidade Carro encontrada ###");
        System.out.println("ID: " + carro.getId());
        System.out.println("MODELO: " + carro.getModelo());

    }

}