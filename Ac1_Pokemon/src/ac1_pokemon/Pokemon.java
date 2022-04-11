package ac1_pokemon;

import java.util.Random;

public class Pokemon {
    
    //Instanciando objeto random
    Random gerador = new Random();

    //Atributos
    private String nome;
    private String tipoPokemon;
    private double vida;
    private double defesa;
    private double ataque;
    private int level;

    public Pokemon(String nome, String tipoPokemon, int level) {
        this.nome = nome;
        this.tipoPokemon = tipoPokemon;
        this.level = level;

        calculaAtributos();
        imprimeAtributos();
        //calculaLevel();
    }

    //Getters and Setters para proteção dos atributos
    public double getVida() {
        return vida;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoPokemon() {
        return tipoPokemon;
    }

    public void setTipoPokemon(String tipoPokemon) {
        this.tipoPokemon = tipoPokemon;
    }

    public double getDefesa() {
        return defesa;
    }

    public void setDefesa(double defesa) {
        this.defesa = defesa;
    }

    public double getAtaque() {
        return ataque;
    }

    public void setAtaque(double ataque) {
        this.ataque = ataque;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    //Métodos
    private void imprimeAtributos() {

        System.out.println("====\n"
                + "Nome: " + this.nome + "\n"
                + "Tipo: " + this.tipoPokemon + "\n"
                + "Vida: " + this.vida + "\n"
                + "Level: " + this.level + "\n"
                + "Defesa: " + this.defesa + "\n"
                + "Ataque: " + this.ataque + "\n"
                + "====\n");

    }

   /*private void calculaLevel() {

        this.vida = this.vida + (level / 2);
        this.vida = this.vida + (level / 3);
        this.vida = this.vida + (level / 4);       

    }*/

    private void calculaAtributos() {

        switch (this.tipoPokemon) {

            case "Fogo":

                this.ataque = 100;
                this.defesa = 50;
                this.vida = gerador.nextInt(100);

                break;

            case "Planta":

                this.ataque = 200;
                this.defesa = 10;
                this.vida = gerador.nextInt(100);

                break;

            case "Raio":

                this.ataque = 200;
                this.defesa = 150;
                this.vida = gerador.nextInt(100);

                break;

            case "Psíquico":

                this.ataque = 300;
                this.defesa = 700;
                this.vida = gerador.nextInt(100);

                break;
        }
    }

}
