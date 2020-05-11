package com.stolk.alecsandro.obra.bean;

import com.stolk.alecsandro.obra.banco.ContaDao;
import com.stolk.alecsandro.obra.modelo.Conta;

import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
public class ContaBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private Conta conta = new Conta();

    @Inject
    private ContaDao dao;

    public List<Conta> buscar() {
        return dao.buscar();
    }

    public void buscarId() {
        this.conta = dao.buscar(conta.getId());
    }

    public void gravar() {
        if (this.conta.getId() != null) {
            dao.cadastrar(this.conta);
        } else {
            dao.editar(this.conta);
        }
        this.conta = new Conta();
    }

    public void remover(Conta conta) {
        dao.excluir(conta);
    }
}
