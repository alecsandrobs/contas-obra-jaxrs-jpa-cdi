package com.stolk.alecsandro.obra.recurso;

import com.stolk.alecsandro.obra.banco.LancamentoDao;
import com.stolk.alecsandro.obra.transacao.Transacional;
import com.stolk.alecsandro.obra.modelo.Lancamento;

import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.io.Serializable;
import java.net.URI;
import java.util.List;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Named
@Path("lancamentos")
@Consumes(APPLICATION_JSON)
@Produces(APPLICATION_JSON)
public class LancamentoResource implements Serializable {

    private static final long serialVersionUID = 1L;

    Lancamento lancamento = new Lancamento();

    @Inject
    private LancamentoDao dao;

    @GET
    public Response get() {
        List<Lancamento> lancamentos = dao.buscar();
        return Response.ok(lancamentos).build();
    }

    @GET
    @Path("{id}")
    public Response get(@PathParam("id") Long id) {
        Lancamento lancamento = dao.buscar(id);
        return Response.ok(lancamento).build();
    }

    @POST
    @Transacional
    public Response post(Lancamento lancamento) {
        dao.cadastrar(lancamento);
        return Response.created(URI.create(String.format("/lancamentos/%s", lancamento.getId()))).build();
    }

    @PUT
    @Transacional
    public Response put(Lancamento lancamento) {
        dao.editar(lancamento);
        return Response.ok(URI.create(String.format("/lancamentos/%s", lancamento.getId()))).build();
    }

    @PUT
    @Transacional
    @Path("{id}")
    public Response put(@PathParam("id") Long id, Lancamento lancamento) {
        Lancamento lancamentoBusca = dao.buscar(id);
        lancamento.setId(lancamentoBusca.getId());
        dao.editar(lancamento);
        return Response.ok(URI.create(String.format("/lancamentos/%s", lancamento.getId()))).build();
    }

    @DELETE
    @Transacional
    public Response delete(Lancamento lancamento) {
        Lancamento lancamentoRemover = dao.buscar(lancamento.getId());
        if (lancamentoRemover != null) {
            dao.excluir(lancamentoRemover);
        }
        return Response.noContent().build();
    }

    @DELETE
    @Transacional
    @Path("{id}")
    public Response delete(@PathParam("id") Long id) {
        Lancamento lancamento = dao.buscar(id);
        if (lancamento != null) {
            dao.excluir(lancamento);
        }
        return Response.noContent().build();
    }
}
