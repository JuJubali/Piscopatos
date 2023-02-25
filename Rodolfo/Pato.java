//Métodos: Atacar, correr e descançar
//Atributos: Mana, stamina, saúde. OS VALORES SÃO FIXOS PARA TODOS OS PATOS
//Mana: Valor fixo para todos os patos
//Stamina: Começa fixo. Se atacar, stamina diminui. Se descançar, stamina aumenta
//Saúde: Se descançar, aumenta 

package Rodolfo;
public class Pato {

    public String nome;
    public int mana;
    public int stamina;
    public int pontodeVida;
    public int pontodeDano;
    public int pontodeResistencia;
    public int pontodeInteligencia;


    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getpontodeVida() {
        return pontodeVida;
    }

    public void setPontodeVida(int pontodeVida) {
        this.pontodeVida = pontodeVida;
    }

    public int getPontodeDano(){
        return pontodeDano;

    }

    public void setPontodeDano(int pontodeDano){
        this.pontodeDano = pontodeDano;
    }

    public int getPontodeResistencia(){
        return pontodeResistencia;
    }

    public void setPontodeResistencia(int pontodeResistencia){
        this.pontodeResistencia = pontodeResistencia;
    }

    public int getPontodeInteligencia(){
        return pontodeInteligencia;
    }

    public void setPontodeInteligencia(int pontodeInteligencia){
        this.pontodeInteligencia = pontodeInteligencia;
    }

    public void atacar () {
        stamina = stamina - 2;
        if (stamina <= 0 ){
            System.out.println ("Stamina insuficiente!");
        }

    }

    public void correr() {
        stamina = stamina - 2;
        if (stamina <= 0) {
            stamina = 0;
            System.out.println("Stamina insuficiente!");
        }
        else {
            System.out.println("Correu!");
        }
    }

    public void descancar () {
        pontodeVida = pontodeVida + 2;
        stamina = stamina + 2;
        if (pontodeVida >= 10){
            pontodeVida = 10;
            System.out.println("Sua vida está cheia");
        }
        
        if (stamina >= 10){
            stamina = 10;
            System.out.println ("Sua stamina está cheia");
        }
        if (pontodeVida == 10 && stamina == 10){
            System.out.println ("Sua vida e a sua stamina já estão cheias");
        }
        else{  
            System.out.println ("Descançando zzz");
        }
    }

    public void informacoes(){
        System.out.println("Informações: Mana: " +getMana() +" Stamina: " +getStamina() +" Vida: " +getpontodeVida() +" Dano: " +getPontodeDano() +" Resistência: " +getPontodeResistencia() +" Inteligência: " +getPontodeInteligencia());
    }

}

 /*    public Pato (int mana, int stamina, int vida) {
        this.mana = mana;
        this.stamina = stamina;
        this.vida = vida; */

