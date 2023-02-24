//Métodos: Atacar, correr e descançar
//Atributos: Mana, stamina, saúde. OS VALORES SÃO FIXOS PARA TODOS OS PATOS
//Mana: Valor fixo para todos os patos
//Stamina: Começa fixo. Se atacar, stamina diminui. Se descançar, stamina aumenta
//Saúde: Se descançar, aumenta 

public class Pato {

    public String nome;
    public int mana;
    public int stamina;
    public int vida;

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

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void atacar () {

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
        vida = vida + 2;
        stamina = stamina + 2;
        if (vida >= 10) {
            vida = 10;
            System.out.println("Sua vida já está cheia");
        }
        else {
            System.out.println("Vocês está descançando zzz");
        }
        
    }

}

 /*    public Pato (int mana, int stamina, int vida) {
        this.mana = mana;
        this.stamina = stamina;
        this.vida = vida; */

