//package com.stolk.alecsandro.obra.bean;
//
//import com.stolk.alecsandro.obra.banco.ContatoDao;
//import com.stolk.alecsandro.obra.modelo.Contato;
//
//import javax.inject.Inject;
//import javax.inject.Named;
//import java.io.Serializable;
//import java.util.List;
//
//@Named
//public class ContatoBean implements Serializable {
//
//    private static final long serialVersionUID = 1L;
//
//    private Contato contato = new Contato();
//
//    @Inject
//    private ContatoDao dao;
//
//    public List<Contato> buscar() {
//        return dao.buscar();
//    }
//
//    public void buscarId() {
//        this.contato = dao.buscar(contato.getId());
//    }
//
//    public void gravar() {
//        if (this.contato.getId() != null) {
//            dao.cadastrar(this.contato);
//        } else {
//            dao.editar(this.contato);
//        }
//        this.contato = new Contato();
//    }
//
//    public void remover(Contato contato) {
//        dao.excluir(contato);
//    }
//}
