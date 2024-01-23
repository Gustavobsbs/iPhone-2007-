public class Usuario {
    public static void main(String[] args) {
        iPhone iphone = new iPhone();

        System.out.println(" ## Ultilizando a função de Reprodutor Musical: ");
        iphone.abrirlistadeMusicas();
        iphone.selecionarMusica();
        iphone.tocarMusica();

        System.out.println(" ## Ultilizando a função de Aparelho telefonico: ");
        iphone.digitarNumero();
        iphone.ligarParaNumero();
        iphone.iniciarCorreiovoz();

        System.out.println(" ## Navegando na Internet: ");
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
