package psicopatos;

public class Teste {
    public static void main(String[] arg){
        psicopatos.Pato tank = new psicopatos.Pato();
        tank.setMana(10);
        tank.setStamina(10);
        tank.setPontodeVida(5);
        tank.setPontodeDano(10);
        tank.setPontodeResistencia(5);
        tank.setPontodeInteligencia(2); 
        tank.informacoes();
    }
}
