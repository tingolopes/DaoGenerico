package br.edu.ifms.application;

import br.edu.ifms.dao.DaoGenerico;
import br.edu.ifms.model.Carro;
import br.edu.ifms.model.Pessoa;

public class InsertApplication {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        Carro carro = new Carro();

        DaoGenerico<Pessoa> daoPessoa = new DaoGenerico<>();
        DaoGenerico<Carro> daoCarro = new DaoGenerico<>();

        pessoa.setNome("Raphael Neves");
        pessoa.setIdade(28);

        carro.setModelo("Mustang");
        carro.setAnoFabricacao(1989);

        daoPessoa.saveOrUpdate(pessoa);
        daoCarro.saveOrUpdate(carro);

        System.out.println("Entidades salvas com sucesso!");
        
    }

}
