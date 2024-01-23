public class iPhone implements ReprodutorMusical, AparelhoTelefônico {

    // Reprodutor Musical
    public void abrirlistadeMusicas() {
        System.out.println("Lista aberta, selecione sua musica");
    }

    public void selecionarMusica() {
        System.out.println("Musica Selecionada");
    }

    public void tocarMusica() {
        System.out.println("Tocando musica");

    }

    public void pausarMusica() {
        System.out.println("Musica Pausada");
    }

    // Aparelho Telefonico

    public void digitarNumero() {
        System.out.println("Digitando Numero");
    }

    public void ligarParaNumero() {
        System.out.println("Ligando para numero digitado...");
    }

    public void iniciarCorreiovoz() {
        System.out.println("Iniciando Correio de Voz");
    }

    // Navegando na Internet

    public void exibirPagina() {
        System.out.println("Exibindo pagina WEB");
    }

    public void adicionarNovaAba() {
        System.out.println("Uma nova aba foi adicionada");
    }

    public void atualizarPagina() {
        System.out.println("Pagina atualizada");
    }

}