public class Pato {

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

    public Pato(int mana, int stamina, int vida) {
        this.mana = mana;
        this.stamina = stamina;
        this.vida = vida;
    }
}