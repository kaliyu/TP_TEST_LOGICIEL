public class Entier {
    int valeur;

    public Entier(int valeur){
        this.valeur = valeur;
    }

    public int triple(){
        return 3*valeur;
    }
    public Entier entierTriple(){
        return new Entier(triple());
    }
}
