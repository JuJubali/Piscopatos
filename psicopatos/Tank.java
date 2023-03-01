package psicopatos;
import java.util.Random;

public class Tank extends Pato {

    public Tank(String nome, int mana, int stamina, int pontodeVida, int pontodeDano, int pontodeResistencia,
        int pontodeInteligencia) {
    super(nome, mana, stamina, pontodeVida, pontodeDano, pontodeResistencia, pontodeInteligencia);
    }

    private boolean usado = false;

    public void inteligenciaAdd(){
        if (usado == false){
            Random omega = new Random();
            int x = omega.nextInt(8) + 1;
            pontodeInteligencia = pontodeInteligencia + x;
            System.out.println("Seu PI aumentou: " +x+ " pontos!");
            usado = true;
        }
        else{
            System.out.println("Recurso já usado");
        }
    }

}
