import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TestMax {
    @Test
    public void testMaxPair(){
        Maximum max = new Maximum();
        int res = max.maximum();
        System.out.println("le res = " + res);
        Assertions.assertNotEquals(3,res);
    }
    @Test
    public void testMaxNonPair() throws ExceptionMaxNonPair{
        Maximum max = new Maximum();
        int res = max.maximumImpairs();
        System.out.println("le max est : "+ res);
        Assertions.assertNotEquals(3,res);
    }
}
