package br.edu.ifms.application;

import br.edu.ifms.dao.DaoGenerico;
import br.edu.ifms.model.Carro;
import br.edu.ifms.model.Pessoa;

public class RemoveApplication {

    public static void main(String[] args) {

        DaoGenerico<Pessoa> daoPessoa = new DaoGenerico<>();
        DaoGenerico<Carro> daoCarro = new DaoGenerico<>();

        daoPessoa.remove(Pessoa.class, 1);
        daoCarro.remove(Carro.class, 1);

        System.out.println("Entidades removidas com sucesso!");

    }
}
