import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

public class TestEntier {
    Entier t;

    @BeforeEach
    void init(){t = new Entier(7);}

    @Test
    public void testEntierTriple(){
        int res = t.triple();
        System.out.println("le res est : "+res);
        Assertions.assertEquals(21,res);
    }

    @Test
    public void testEntierTripleE(){
        Entier excepted = new Entier(21);
        Entier res = t.entierTriple();
        System.out.println("le res est : "+res);
        Assertions.assertTrue(excepted.equals(res));
    }

}
