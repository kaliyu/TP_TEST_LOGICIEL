import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatriceTest {
    @Test
    void testConstructeur() {
        Calculatrice calc = new Calculatrice(4, 5);
        String resultatAttendu = "x = 4; y = 5";
        String resultatEffectif = calc.toString();
        System.out.println("le resultat ets  : "+ resultatEffectif);
        assertEquals(resultatAttendu, resultatEffectif, "constructionsimple");
    }

    @Test
    void testAjouter(){
        Calculatrice calc = new Calculatrice(4,5);
        int resultatAttendu = 9;
        int resultatEffectif = calc.ajouter();
        System.out.println("le res attendu est :"+ resultatEffectif);
        assertEquals(resultatAttendu,resultatEffectif,"9");
    }
}
