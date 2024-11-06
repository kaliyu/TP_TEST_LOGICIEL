public class Maximum {
    int taille;

    public Maximum(){
        this.taille = 10;
    }
    public Maximum(int taille){
        this.taille = taille;
    }
    public int maximumAleatoire(){
        int[] tab = new int[taille];
        int max = 0;
        for(int i = 0; i< taille;i++){
            tab[i] = (int) (Math.random() * 100);
            if(tab[i] % 2 == 0 && tab[i] > max){
                max = tab[i];
            }
        }
        return max;
    }
    public int maximum(){
        if(taille % 2 == 0){
            return taille-1;
        }else{
            return taille-2;
        }
    }

    public int maximumImpairs() throws ExceptionMaxNonPair{
        int[] tab = new int[taille];
        for(int i = 0; i < taille; i++){
            if(i%2==0){
                tab[i] = i+1;
            }else{
                tab[i] = i;
            }
        }
        int max = 0;
        for(int i = 0;i<taille;i++){
            if(tab[i] %2== 0 && tab[i] > max){
                max = tab[i];
            }
        }
        if(max == 0){
            throw new ExceptionMaxNonPair("pas de nb pair");
        }
        return max;
    }
}
