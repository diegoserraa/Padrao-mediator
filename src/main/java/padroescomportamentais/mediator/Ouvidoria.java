package padroescomportamentais.mediator;

public class Ouvidoria {

    private static Ouvidoria instancia = new Ouvidoria();

    private Ouvidoria() {}

    public static Ouvidoria getInstancia() {
        return instancia;
    }

    public String receberElogioSetorVendas(String mensagem) {
        return "A Ouvidoria agradece seu contato.\n"+
                "O setor de vendas respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Vendas.getInstancia().receberElogio(mensagem);
    }

    public String receberReclamacaoSetorVendas(String mensagem) {
        return "A Ouvidoria agradece seu contato.\n"+
                "O setor de vendas respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Vendas.getInstancia().receberReclamacao(mensagem);
    }

    public String receberSugestaoSetorVendas(String mensagem) {
        return "A Ouvidoria agradece seu contato.\n"+
                "O setor de vendas respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Vendas.getInstancia().receberSugestao(mensagem);
    }

}
