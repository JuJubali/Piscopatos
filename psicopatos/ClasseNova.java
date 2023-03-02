// Classificação de cada pato
//package psicopatos;
package psicopatos;
public class ClasseNova{
    public static void main (String[] args) {
        //Instânciando Tank
        Tank tankUm = new Tank("Nyxlim", 10, 10, 5, 5, 10, 2);
        tankUm.informacoes();
        tankUm.correr();
        tankUm.informacoes();
        tankUm.inteligenciaAdd();
        tankUm.inteligenciaAdd();
        tankUm.informacoes();
        
        //Instânciando lutador
        Lutador lutador = new Lutador("SuperPlayer", 10, 10, 5, 10, 2, 5);
        lutador.informacoes();
        lutador.correr();
        lutador.informacoes();
        lutador.resistenciaAdd();
        lutador.resistenciaAdd();
        lutador.informacoes();

        //Instanciando invocador
        Invocador invocador = new Invocador("JooJ", 10, 10, 2, 5, 5, 10);
        invocador.informacoes();
        invocador.correr();
        invocador.informacoes();
        invocador.vidaAdd();
        invocador.vidaAdd();
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