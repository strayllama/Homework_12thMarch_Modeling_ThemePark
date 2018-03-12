import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCustomers {
    private Customer customer1;
    private Customer customer2;

    @Before
    public void before() {
        customer1 = new Customer("Bob", PersonType.ADULT, 185, 100);
        customer2 = new Customer("Adam", PersonType.YOUNG, 115, 20);
    }

    @Test
    public void hasWallet() {
        assertEquals(100, customer1.getWallet());
    }

    @Test
    public void canReduceWallet() {
        customer1.giveMoney(10);
        assertEquals(90, customer1.getWallet());

    }

    @Test
    public void hasName() {
        assertEquals("Adam", customer2.getName());
    }

    @Test
    public void hasType() {
        assertEquals(PersonType.YOUNG, customer2.getPersonType());
    }

    @Test
    public void hasHeight() {
        assertEquals(185, customer1.getHeight());
    }


//    @Test
//    public void a() {
//
//    }

//    @Test
//    public void a() {
//
//    }
//

}
