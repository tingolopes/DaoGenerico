package br.edu.ifms.application;

import br.edu.ifms.dao.DaoGenerico;
import br.edu.ifms.model.Pessoa;

public class UpdateApplication {

    public static void main(String[] args) {

        DaoGenerico<Pessoa> daoPessoa = new DaoGenerico<>();

        Pessoa pessoa = daoPessoa.findById(Pessoa.class, 3L);
        pessoa.setNome("Raphael Oliveira Neves");
        daoPessoa.saveOrUpdate(pessoa);
        System.out.println("Entidade atualizada com sucesso.");

    }

}
