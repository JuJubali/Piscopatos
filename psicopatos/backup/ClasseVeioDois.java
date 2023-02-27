package psicopatos;

// Classificação de cada pato
//package psicopatos;

public class ClasseNova{
    public static void main (String[] args) {
        Pato tank = new Pato("Nyxlim", 10, 10, 5, 10, 5, 2);
        tank.informacoes();
        tank.correr();
        tank.informacoes();
        
        Pato lutador = new Pato("SuperPlayer", 10, 10, 10, 5, 2, 5);
        lutador.informacoes();
        lutador.correr();
        lutador.informacoes();

        Pato invocador = new Pato("JooJ", 10, 10, 2, 5, 5, 10);
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