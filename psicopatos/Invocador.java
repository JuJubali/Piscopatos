package psicopatos;
import java.util.Random;

public class Invocador extends Pato{

    public Invocador(String nome, int mana, int stamina, int pontodeVida, int pontodeDano, int pontodeResistencia,
    int pontodeInteligencia){
    super(nome, mana, stamina, pontodeVida, pontodeDano, pontodeResistencia, pontodeInteligencia);
    }

    public boolean usado = false;

    public void vidaAdd(){
        if (usado == false ){
        Random omega = new Random();
        int x = omega.nextInt(8) + 1;
        pontodeVida = pontodeVida + x;
        System.out.println("Seu PV aumentou em: " +x+ " pontos!");
        usado = true;
        }
        else {
            System.out.println("Recurso já usado");
        }

    }
}
