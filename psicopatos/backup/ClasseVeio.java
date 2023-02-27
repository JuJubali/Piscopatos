package psicopatos;

// Classificação de cada pato
//package psicopatos;

public class ClasseVeio{
    public static void main (String[] args) {
        psicopatos.Pato tank = new psicopatos.Pato();
            tank.setMana(10);
            tank.setStamina(10);
            tank.setPontodeVida(5);
            tank.setPontodeDano(10);
            tank.setPontodeResistencia(5);
            tank.setPontodeInteligencia(2); 
            tank.informacoes();
            tank.correr();
            tank.informacoes();
        
        psicopatos.Pato lutador = new psicopatos.Pato();
            lutador.setMana(10);
            lutador.setStamina(10);
            lutador.setPontodeVida(10);
            lutador.setPontodeDano(5);
            lutador.setPontodeResistencia(2);
            lutador.setPontodeInteligencia(5);
            lutador.informacoes();
            lutador.correr();
            lutador.informacoes();

        psicopatos.Pato invocador = new psicopatos.Pato();
            invocador.setMana(10);
            invocador.setStamina(10);
            invocador.setPontodeVida(2);
            invocador.setPontodeDano(5);
            invocador.setPontodeResistencia(5);
            invocador.setPontodeInteligencia(10);
            invocador.informacoes();
            invocador.correr();
            invocador.informacoes();
    }
}
  
     
    /*
    public Tank(int mana, int stamina, int vida) {
        super(mana, stamina, vida);
        //TODO Auto-generated constructor stub
    
        private void.setMana(10); // Fiz tudo errado 
    }
    */