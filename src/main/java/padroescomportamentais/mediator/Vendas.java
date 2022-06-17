package padroescomportamentais.mediator;

public class Vendas implements Setor {

    private static Vendas instancia = new Vendas();

    private Vendas() {}

    public static Vendas getInstancia() {
        return instancia;
    }

    public String receberReclamacao(String mensagem) {
        return "O setor de vendas vai procurar melhorar o serviço da reclamação: " + mensagem;
    }

    public String receberElogio(String mensagem) {
        return "O setor de vendas agradece a mensagem: " + mensagem;
    }

    public String receberSugestao(String mensagem) {
        return "O setor de vendas vai analisar a sugestão: " + mensagem;
    }
}
