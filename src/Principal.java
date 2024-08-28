import br.com.jean.screenmatch.modelos.Filme;

public class Principal {
    public static void main(String[] args) {
        Filme filme = new Filme();
        filme.setNome("O Poderoso Chefão");
        filme.setAnoLancamento(1972);
        filme.setIncluidoNoPlano(true);
        filme.setDuracaoEmMinutos(175);
        filme.setGenero("Drama");
        filme.setDescricao("Observações e Descrição do Filme de máfia");

        filme.somarAvaliacao(8.5);
        filme.somarAvaliacao(7.5);
        filme.somarAvaliacao(9.5);
        filme.somarAvaliacao(10);

        filme.exibeFichaTecnica();
        System.out.println("Total de avaliações: " + filme.getTotalDeAvaliacoes());
    }
}
