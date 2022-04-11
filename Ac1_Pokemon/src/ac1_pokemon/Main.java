package ac1_pokemon;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random gerador = new Random();
        

        // Instanciando Pokemons      
        Pokemon bulbassauro = new Pokemon("Bulbasauro", "Planta", gerador.nextInt(40));
        Pokemon pikachu = new Pokemon("Pikachu", "Raio", gerador.nextInt(40));
        Pokemon charizard = new Pokemon("Charizard", "Fogo", gerador.nextInt(40));

        // Instanciando MewTwo (pokemon Principal)
        Pokemon mewtwo = new Pokemon("MewTwo", "Psíquico", gerador.nextInt(40));

        // Instanciando a Batalha
        Batalhas batalha = new Batalhas();
        
        batalha.pikachuPokemon(pikachu.getNome(),pikachu.getVida());
        batalha.bulbassauroPokemon(bulbassauro.getNome() ,bulbassauro.getVida());
        batalha.charizardPokemon(charizard.getNome(), charizard.getVida());
        batalha.mewtwoPokemon(mewtwo.getNome(), mewtwo.getVida());       
        
        
        //Começando a tela da batalha       
        batalha.comecarBatalha();
        

    }

}
