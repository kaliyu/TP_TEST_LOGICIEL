public class CalculImpot {

    public Double calculerImpot(Double revenu) throws Exception {
        double impot = 0.0;
        if(revenu < impot){
            throw new ExceptionTestNegatif("revenu invalide");
        }
        if(revenu <= 20000) {
            impot = revenu * 0.1;
            return impot;
        } else if (revenu > 20000 && revenu <= 100000) {
            impot = 2000 + (revenu - 20000) * 0.2;
            return impot;
        } else  {
            impot = 2000 + 16000 + (revenu - 100000) * 0.3;
            return impot;
        }
    }
}
