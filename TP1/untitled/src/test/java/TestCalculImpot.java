import org.junit.jupiter.api.Timeout;
import org.testng.IExpectedExceptionsHolder;
import org.testng.annotations.Test;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestCalculImpot {

    @Timeout(value = 10)
    @Test
    public void testCalcul20000() throws Exception {
        CalculImpot calcul = new CalculImpot();
        Double res = calcul.calculerImpot(20000.0);
        System.out.println("Le r´esultat est " + res);
        Assertions.assertEquals(2000.0,res);
    }
    @Timeout(value = 10)
    @Test
    public void testCalcul19999() throws Exception {
        CalculImpot calcul = new CalculImpot();
        Double res = calcul.calculerImpot(19999.0);
        System.out.println("Le r´esultat est " + res);
        Assertions.assertEquals(1999.9,res);
    }
    @Timeout(value = 10)
    @Test
    public void testCalcul20001() throws Exception {
        CalculImpot calcul = new CalculImpot();
        Double res = calcul.calculerImpot(20001.0);
        System.out.println("Le r´esultat est " + res);
        Assertions.assertEquals(2000.20,res);
    }
    @Timeout(value = 10)
    @Test
    public void testCalcul200000() throws Exception {
        CalculImpot calcul = new CalculImpot();
        Double res = calcul.calculerImpot(200000.0);
        System.out.println("Le r´esultat est " + res);
        Assertions.assertEquals(48000.0,res);
    }
    @Test
    public void testCalculNegatif(){
        ExceptionTestNegatif exc = assertThrows(ExceptionTestNegatif.class,() -> {
            CalculImpot calcul = new CalculImpot();
            Double res = calcul.calculerImpot(-10000.0);
            System.out.println("Le r´esultat est " + res);
        });
        Assertions.assertEquals("revenu Negatif",exc.getMessage());
    }
}
