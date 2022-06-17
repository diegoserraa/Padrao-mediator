package padroescomportamentais.mediator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveElogiarSetorVendas() {
        Cliente cliente = new Cliente();
        assertEquals("A Ouvidoria agradece seu contato.\nO setor de vendas respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>O setor de vendas agradece a mensagem: Ótimo atendimento",
                cliente.elogiarSetorVendas("Ótimo atendimento"));
    }

    @Test
    void deveReclamarSetorVendas() {
        Cliente cliente = new Cliente();
        assertEquals("A Ouvidoria agradece seu contato.\nO setor de vendas respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>O setor de vendas vai procurar melhorar o serviço da reclamação: Lentidão no atendimento",
                cliente.reclamarSetorVendas("Lentidão no atendimento"));
    }

    @Test
    void deveSugerirSetorVendas() {
        Cliente cliente = new Cliente();
        assertEquals("A Ouvidoria agradece seu contato.\nO setor de vendas respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>O setor de vendas vai analisar a sugestão: Ampliar horário funcionamento",
                cliente.sugerirSetorVendas("Ampliar horário funcionamento"));
    }

}