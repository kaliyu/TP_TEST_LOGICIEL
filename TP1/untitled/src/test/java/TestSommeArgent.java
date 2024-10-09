import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

public class TestSommeArgent {
    SommeArgent obj1;
    SommeArgent obj2;
    SommeArgent obj3;



    public void mesInitialisation(){
        obj1 = new SommeArgent(100,"$");
        obj2 = new SommeArgent(200, "£");
        obj3 = new SommeArgent(100, "£");
    }

    @Test
    public void testAddition(){
        SommeArgent newObj = obj2.add(obj3);
        Assertions.assertEquals(false, obj1);
    }

    @Test
    public void testEquivalence(){
        obj1 = new SommeArgent(100,"$");
        obj2 = new SommeArgent(100, "£");
        Assertions.assertEquals(true,obj1.equals(obj2));
    }
}
