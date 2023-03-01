// Classificação de cada pato
//package psicopatos;
package psicopatos;
public class ClasseNova{
    public static void main (String[] args) {
        //Instânciando Tank
        Tank id1 = new Tank("Nyxlim", 10, 10, 5, 5, 10, 2);
        id1.informacoes();
        id1.correr();
        id1.informacoes();
        id1.inteligenciaAdd();
        id1.inteligenciaAdd();
        id1.informacoes();
        
        //Instânciando lutador
        Pato lutador = new Pato("SuperPlayer", 10, 10, 5, 10, 2, 5);
        lutador.informacoes();
        lutador.correr();
        lutador.informacoes();

        //Instanciando invocador
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