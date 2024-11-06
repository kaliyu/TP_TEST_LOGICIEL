import org.junit.Test;
import org.junit.jupiter.api.Assertions;


public class TestPgcd {
    @Test
    public void testPgcdArg2Null(){
        int g = pgcd.pgcd(10,0);
        Assertions.assertEquals(10,g);
    }

    @Test
    public void testPgcd(){
        int g = pgcd.pgcd(50,70);
        System.out.println("le resultat est : "+g);
    }

    @Test
    public void testPgcdArg1Null(){
        int g = pgcd.pgcd(10,0);
        Assertions.assertEquals(10,g);
    }
    @Test
    public void testPgcdArgsNull(){
        int g = pgcd.pgcd(0,0);
        Assertions.assertEquals(0,g);
    }

    @Test
    public void testPgcdArgsMultiple(){
        int g = pgcd.pgcd(2,4);
        Assertions.assertEquals(2,4);
    }

    @Test
    public void testPgcdArgsPremier(){
        int g = pgcd.pgcd(1,3);
        Assertions.assertEquals(1,3);
    }



}
