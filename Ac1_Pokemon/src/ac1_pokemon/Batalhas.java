package ac1_pokemon;

public class Batalhas {

    double vidaPikachu;
    double vidaBulbassauro;
    double vidaCharizard;
    String nomePikachu;
    String nomeBulbassauro;
    String nomeCharizard;
    //Pokemon Principal
    double vidaMewtwo;
    String nomeMewtwo;

    public void pikachuPokemon(String nome, double vida) {

        this.nomePikachu = nome;
        this.vidaPikachu = vida;

    }

    public void bulbassauroPokemon(String nome, double vida) {

        this.nomeBulbassauro = nome;
        this.vidaBulbassauro = vida;

    }

    public void charizardPokemon(String nome, double vida) {

        this.nomeCharizard = nome;
        this.vidaCharizard = vida;

    }

    public void mewtwoPokemon(String nome, double vida) {

        this.vidaMewtwo = vida;
        this.nomeMewtwo = nome;

    }

    public void pikachuvsmewtwo() {

        if (vidaPikachu > vidaMewtwo) {

            vitoria telaVitoria = new vitoria();
            telaVitoria.setVisible(true);
        } else {

            derrota telaDerrota = new derrota();
            telaDerrota.setVisible(true);
        }

    }

    public void bulbassaurovsmewtwo() {

        if (vidaBulbassauro > vidaMewtwo) {

            vitoria telaVitoria = new vitoria();
            telaVitoria.setVisible(true);

        } else {

            derrota telaDerrota = new derrota();
            telaDerrota.setVisible(true);
        }

    }

    public void charizardvsmewtwo() {

        if (vidaCharizard > vidaMewtwo) {

            vitoria telaVitoria = new vitoria();
            telaVitoria.setVisible(true);

        } else {

            derrota telaDerrota = new derrota();
            telaDerrota.setVisible(true);
        }

    }

    public void comecarBatalha() {

        TelaAbertura telacomeco = new TelaAbertura();
        telacomeco.setVisible(true);

    }

}
