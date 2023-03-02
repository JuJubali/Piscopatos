package psicopatos;
import java.util.Random;

public class Lutador extends Pato{

    public Lutador(String nome, int mana, int stamina, int pontodeVida, int pontodeDano, int pontodeResistencia,
    int pontodeInteligencia) {
    super(nome, mana, stamina, pontodeVida, pontodeDano, pontodeResistencia, pontodeInteligencia);
    }

    public boolean usado = false;

    public void resistenciaAdd (){
        if (usado == false ){
        Random omega = new Random();
        int x = omega.nextInt(8) + 1;
        pontodeResistencia = pontodeResistencia + x;
        System.out.println("Seu PR aumentou em: " +x+ " pontos!");
        usado = true;
        }
        else {
            System.out.println("Recurso já usado");
        }
    }
}
