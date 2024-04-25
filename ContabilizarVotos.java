import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ContabilizarVotos {
    private ArrayList<Jogador> participates;

    public ContabilizarVotos() {
        this.participates = new ArrayList<>();
    }

    public void cadastrarParticipantes(String nome) {
        Jogador jogador = new Jogador(nome);
        participates.add(jogador);
    }

    public void votarEm(String nome) {
        for (Jogador jogador : participates) {
            if (jogador.getNome().equals(nome)) {
                jogador.adicionarVoto();
                return;
            }
        }
        System.out.println("Participante não encontrado.");
    }

    public String DeterminaroEliminado() {
        Map<String, Integer> mapVotos = new HashMap<>();
        for (Jogador jogador : participates) {
            mapVotos.put(jogador.getNome(), jogador.getVotos());
        }

        //Localizar o jogador com o maior numero de voto
        String eliminado = "";
        int maiorNumeroVotos = 0;
        for (Map.Entry<String, Integer> entry : mapVotos.entrySet()) {
            if (entry.getValue() > maiorNumeroVotos) {
                eliminado = entry.getKey();
                maiorNumeroVotos = entry.getValue();
            }
        }
        return eliminado;
    }

    public static void main(String[] args) {
        ContabilizadorVotos contabilizador = new ContabilizadorVotos();
        contabilizador.cadastrarParticipantes("Alana Dias");
        contabilizador.cadastrarParticipantes("Beatriz Reis");
        contabilizador.cadastrarParticipantes("Davi Brito");
        contabilizador.cadastrarParticipantes("Deniziane Ferreira");
        contabilizador.cadastrarParticipantes("Fernanda Bande");
        contabilizador.cadastrarParticipantes("Giovanna Lima");
        contabilizador.cadastrarParticipantes("Giovanna Pitel");
        contabilizador.cadastrarParticipantes("Isabelle Nogueira");
        contabilizador.cadastrarParticipantes("Juninho");
        contabilizador.cadastrarParticipantes("Leidy Elin");
        contabilizador.cadastrarParticipantes("Lucas Henrique");
        contabilizador.cadastrarParticipantes("Lucas Luigi");
        contabilizador.cadastrarParticipantes("Lucas Pizane");
        contabilizador.cadastrarParticipantes("Marcus Vinicius");
        contabilizador.cadastrarParticipantes("Matteus Amaral");
        contabilizador.cadastrarParticipantes("Maycon Cosmer");
        contabilizador.cadastrarParticipantes("MC Bin Laden");
        contabilizador.cadastrarParticipantes("Michel Nogueira");
        contabilizador.cadastrarParticipantes("Nizam");
        contabilizador.cadastrarParticipantes("Raquele Cardozo");
        contabilizador.cadastrarParticipantes("Rodriguinho");
        contabilizador.cadastrarParticipantes("Thalyta Alves");
        contabilizador.cadastrarParticipantes("Vanessa Lopes");
        contabilizador.cadastrarParticipantes("Vinicius Rodrigues");
        contabilizador.cadastrarParticipantes("Wanessa Camargo");
        contabilizador.cadastrarParticipantes("Yasmin Brunet");

        contabilizador.votarEm("Alana Dias");
        contabilizador.votarEm("Alana Dias");
        contabilizador.votarEm("Alana Dias");
        contabilizador.votarEm("Alana Dias");
        contabilizador.votarEm("Alana Dias");
        contabilizador.votarEm("Alana Dias");
        contabilizador.votarEm("Alana Dias");
        contabilizador.votarEm("Alana Dias");
        contabilizador.votarEm("Yasmin Brunet");
        contabilizador.votarEm("Yasmin Brunet");
        contabilizador.votarEm("Yasmin Brunet");
        contabilizador.votarEm("Yasmin Brunet");
        contabilizador.votarEm("Yasmin Brunet");
        contabilizador.votarEm("Yasmin Brunet");
        contabilizador.votarEm("Yasmin Brunet");
        contabilizador.votarEm("Yasmin Brunet");
        contabilizador.votarEm("Yasmin Brunet");
        contabilizador.votarEm("Yasmin Brunet");
        contabilizador.votarEm("Yasmin Brunet");
        contabilizador.votarEm("Yasmin Brunet");
        contabilizador.votarEm("Yasmin Brunet");
        contabilizador.votarEm("Yasmin Brunet");
        contabilizador.votarEm("Yasmin Brunet");
        contabilizador.votarEm("Yasmin Brunet");

        String eliminado = contabilizador.DeterminaroEliminado();
        System.out.println("O eliminado é : " + eliminado);

    }
}