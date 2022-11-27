public class Jogo {
    public static void main (String... args) throws Exception{
        Personagem p = new Personagem(5,5,5);
        Personagem p2 = new Personagem("JOHN", 10, 0, 0);
        
        while(true){
        p.cacar();
        p.comer();
        p.dormir();
        p.cacar();
        p.cacar();
        p.cacar();
        p2.cacar();
        p2.comer();
        p2.dormir();
        p2.cacar();
        p2.cacar();
        p2.cacar();
        System.out.println("===================================== \n");
        Thread.sleep(5000);
        }
    }
}
