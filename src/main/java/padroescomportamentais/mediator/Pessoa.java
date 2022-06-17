package padroescomportamentais.mediator;

public class Pessoa {

    public String elogiarSetorVendas(String mensagem) {
        return Ouvidoria.getInstancia().receberElogioSetorVendas(mensagem);
    }

    public String reclamarSetorVendas(String mensagem) {
        return Ouvidoria.getInstancia().receberReclamacaoSetorVendas(mensagem);
    }

    public String sugerirSetorVendas(String mensagem) {
        return Ouvidoria.getInstancia().receberSugestaoSetorVendas(mensagem);
    }


}
