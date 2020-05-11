//package com.stolk.alecsandro.obra;
//
//import com.stolk.alecsandro.obra.banco.Dao;
//import com.stolk.alecsandro.obra.modelo.Conta;
//import com.stolk.alecsandro.obra.modelo.Contato;
//import com.stolk.alecsandro.obra.modelo.Fornecedor;
//import com.stolk.alecsandro.obra.modelo.Lancamento;
//
//import static com.stolk.alecsandro.obra.modelo.Lancamento.TipoLancamento.PAGAMENTO;
//import static com.stolk.alecsandro.obra.modelo.Lancamento.TipoLancamento.RECEBIMENTO;
//import static com.stolk.alecsandro.obra.util.Util.dataBr;
//import static java.util.Arrays.asList;
//
//public class ObraTest {
//    public static void main(String[] args) {
//
//        // Contas
//        new Dao<>(Conta.class).cadastrar(new Conta("Nu Pagamentos", "1", "1234567"));
//        new Dao<>(Conta.class).cadastrar(new Conta("Banco Inter", "1", "7654321"));
//        new Dao<>(Conta.class).cadastrar(new Conta("Itaú", "2662", "12647"));
//        new Dao<>(Conta.class).cadastrar(new Conta("Bradesco", "1677", "45679"));
//        new Dao<>(Conta.class).cadastrar(new Conta("Santander", "6543", "165450"));
//        new Dao<>(Conta.class).cadastrar(new Conta("Banco do Brasil", "5460", "65404"));
//        new Dao<>(Conta.class).cadastrar(new Conta("Caixa Econômica Federal", "6506", "65460"));
//
//        Conta conta1 = new Conta();
//        Conta conta2 = new Conta();
//        Conta conta3 = new Conta();
//        Conta conta4 = new Conta();
//        Conta conta5 = new Conta();
//        Conta conta6 = new Conta();
//        Conta conta7 = new Conta();
//        conta1.setId(1L);
//        conta2.setId(2L);
//        conta3.setId(3L);
//        conta4.setId(4L);
//        conta5.setId(5L);
//        conta6.setId(6L);
//        conta7.setId(7L);
//
//        // Contatos
//        new Dao<>(Contato.class).cadastrar(new Contato("José da Silva de Alencar", "12345678909", "57995876341", "josesa@email.com"));
//        new Dao<>(Contato.class).cadastrar(new Contato("Maria Souza de Alencar", null, "23977931594", "mariasa@email.com"));
//        new Dao<>(Contato.class).cadastrar(new Contato("Maurício Aquino Rego", null, "46931782597", null));
//        new Dao<>(Contato.class).cadastrar(new Contato("Flávia Madeira Rego", "98765432100", "10932594621", "rego.flavia@regomail.com.br"));
//        new Dao<>(Contato.class).cadastrar(new Contato("Rui Barba Rosa", "41378847698253", "60991734682", "rbarbarosa@barbamail.com.br"));
//        new Dao<>(Contato.class).cadastrar(new Contato("Joana Flores Rosa", null, null, "hfloresrosa@barbamail.com.br"));
//        new Dao<>(Contato.class).cadastrar(new Contato("Amim Amou Amado", "89512792061900", null, null));
//
//        Contato contato1 = new Contato();
//        Contato contato2 = new Contato();
//        Contato contato3 = new Contato();
//        Contato contato4 = new Contato();
//        Contato contato5 = new Contato();
//        Contato contato6 = new Contato();
//        Contato contato7 = new Contato();
//        contato1.setId(1L);
//        contato2.setId(2L);
//        contato3.setId(3L);
//        contato4.setId(4L);
//        contato5.setId(5L);
//        contato6.setId(6L);
//        contato7.setId(7L);
//
//        // Fornecedores
//        new Dao<>(Fornecedor.class).cadastrar(new Fornecedor("Madereira Madeira LTDA", "26315520658700", asList(conta4, conta3, conta2), asList(contato2, contato1)));
//        new Dao<>(Fornecedor.class).cadastrar(new Fornecedor("Olaria Tijolada ME", "42305910346185", asList(conta6), asList(contato6, contato5)));
//        new Dao<>(Fornecedor.class).cadastrar(new Fornecedor("Materiais de construção Construtivo EPP", "65468294543502", null, asList(contato7)));
//        new Dao<>(Fornecedor.class).cadastrar(new Fornecedor("Empreiteira Dia-a-dia LTDA", "87613260861612", asList(conta1, conta5), null));
//        new Dao<>(Fornecedor.class).cadastrar(new Fornecedor("Revestimentos sem Ânimos EPP", "25216885251607", asList(conta7), null));
//        new Dao<>(Fornecedor.class).cadastrar(new Fornecedor("Ferragens Ferrado LTDA ME", "51671360140837", null, asList(contato3, contato4)));
//        new Dao<>(Fornecedor.class).cadastrar(new Fornecedor("Caixa Econômica Federal", null, null, null));
//
//        Fornecedor fornecedor1 = new Fornecedor();
//        Fornecedor fornecedor2 = new Fornecedor();
//        Fornecedor fornecedor3 = new Fornecedor();
//        Fornecedor fornecedor4 = new Fornecedor();
//        Fornecedor fornecedor5 = new Fornecedor();
//        Fornecedor fornecedor6 = new Fornecedor();
//        Fornecedor fornecedor7 = new Fornecedor();
//        fornecedor1.setId(1L);
//        fornecedor2.setId(2L);
//        fornecedor3.setId(3L);
//        fornecedor4.setId(4L);
//        fornecedor5.setId(5L);
//        fornecedor6.setId(6L);
//        fornecedor7.setId(7L);
//
//        // Lançamentos
//        new Dao<>(Lancamento.class).cadastrar(new Lancamento(dataBr("01/07/2019"), fornecedor7, null, RECEBIMENTO, 1000.0, dataBr("05/09/2019"), "converter a resposta em comentário"));
//        new Dao<>(Lancamento.class).cadastrar(new Lancamento(dataBr("02/05/2019"), fornecedor5, conta1, PAGAMENTO, 73159.99, dataBr("05/06/2019"), "Tem que analisar a utilidade"));
//        new Dao<>(Lancamento.class).cadastrar(new Lancamento(dataBr("03/11/2019"), fornecedor2, conta6, PAGAMENTO, 46.82, dataBr("07/11/2019"), "Exclusão da resposta só em casos extremos"));
//        new Dao<>(Lancamento.class).cadastrar(new Lancamento(dataBr("10/09/2019"), fornecedor4, null, PAGAMENTO, 75.35, dataBr("10/09/2019"), "deixar um comentário"));
//        new Dao<>(Lancamento.class).cadastrar(new Lancamento(dataBr("10/10/2019"), fornecedor3, conta4, PAGAMENTO, 1597.53, dataBr("10/10/2019"), "Nosso objetivo é mostrar para as pessoas que elas podem fazer melhor"));
//        new Dao<>(Lancamento.class).cadastrar(new Lancamento(dataBr("12/07/2019"), fornecedor6, null, PAGAMENTO, 543.21, dataBr("12/07/2019"), "Editar para torná-la útil não é uma opção"));
//        new Dao<>(Lancamento.class).cadastrar(new Lancamento(dataBr("07/12/2019"), fornecedor1, conta3, RECEBIMENTO, 12033.45, null, "Votar contra"));
//
//    }
//}
