public class Personagem{
    String nome;
    private int fome = 0;
    private int sono = 0;
    private int energia = 10;

    public Personagem(String nome, int energia, int fome, int sono){
        this(energia, fome, sono);
        this.nome = nome;

    }

    public Personagem(int energia, int fome, int sono){
        if(energia >= 0 && energia <= 10)
            this.energia = energia;
        if(fome >= 0 && fome <= 10)
            this.fome = fome;
        if(sono >= 0 && sono <= 10)
            this.sono = sono;
    }

    public void cacar(){
        if (energia >= 2){
        System.out.printf("%s cacando ... \n ", nome);
        fome ++;
        energia--;
        }
        else{
        System.out.printf("sem energia para cacar ... \n", nome);    
        }
        fome = Math.min(fome + 1, 10);
        sono = Math.min(sono + 1, 10);
    }

    public void comer(){
        if (fome >= 1){
            System.out.printf("%s comeu ... \n", nome);
        energia = Math.min(energia + 1, 10);
        fome--;
        }
        else{
            System.out.printf("%s sem fome ... \n", nome);
        }
    }

    public void dormir(){
        if(sono >= 1){
        System.out.printf("%s dormindo ... \n", nome);
        sono--;
        energia = energia + 1 <= 10 ? energia + 1 : 10;
        }
        else{
            System.out.printf("%s sem sono ... \n", nome);
        }
    }
}