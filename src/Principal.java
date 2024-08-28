import br.com.jean.screebmatch.calculos.CalculadoraDeTempo;
import br.com.jean.screenmatch.modelos.Filme;
import br.com.jean.screenmatch.modelos.Serie;

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

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoLancamento(2000);
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        lost.setAtiva(true);

        lost.exibeFichaTecnica();

        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos() + " minutos");

        CalculadoraDeTempo calculadoraDeTempo = new CalculadoraDeTempo();
        calculadoraDeTempo.inclui(filme);
        System.out.println("Tempo total de filmes: " + calculadoraDeTempo.getTempoTotal());

        Filme outrofilme = new Filme();
        outrofilme.setNome("Avatar");
        outrofilme.setAnoLancamento(2009);
        outrofilme.setIncluidoNoPlano(true);
        outrofilme.setDuracaoEmMinutos(162);
        outrofilme.setGenero("Ação");
        outrofilme.setDescricao("Observações e Descrição do Filme");

        calculadoraDeTempo.inclui(outrofilme);
        calculadoraDeTempo.inclui(lost);

        System.out.println("Tempo total de filmes: " + calculadoraDeTempo.getTempoTotal());
    }
}
