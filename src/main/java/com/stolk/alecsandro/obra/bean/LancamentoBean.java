//package com.stolk.alecsandro.obra.bean;
//
//import com.stolk.alecsandro.obra.banco.LancamentoDao;
//import com.stolk.alecsandro.obra.modelo.Lancamento;
//
//import javax.inject.Inject;
//import javax.inject.Named;
//import java.io.Serializable;
//import java.util.List;
//
//@Named
//public class LancamentoBean implements Serializable {
//
//    private static final long serialVersionUID = 1L;
//
//    private Lancamento lancamento = new Lancamento();
//
//    @Inject
//    private LancamentoDao dao;
//
//    public List<Lancamento> buscar() {
//        return dao.buscar();
//    }
//
//    public void buscarId() {
//        this.lancamento = dao.buscar(lancamento.getId());
//    }
//
//    public void gravar() {
//        if (this.lancamento.getId() != null) {
//            dao.cadastrar(this.lancamento);
//        } else {
//            dao.editar(this.lancamento);
//        }
//        this.lancamento = new Lancamento();
//    }
//
//    public void remover(Lancamento lancamento) {
//        dao.excluir(lancamento);
//    }
//}
