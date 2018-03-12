import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestBigDipper {
    private BigDipper ride1;
    private Customer boy;
    private Customer man;
    private ArrayList<Rider> zeroRiders;
    private ArrayList<Rider> manRiders;

    @Before
    public void before() {
    ride1 = new BigDipper("Up and over" , 10, 120, 999);
    boy = new Customer("Timmy", PersonType.YOUNG, 100, 10);
    man = new Customer("Ted", PersonType.ADULT, 185, 100);
    }

    @Test
    public void hasName() {
        assertEquals("Up and over", ride1.getName());
    }

    @Test
    public void hasPrice() {
        assertEquals(10, ride1.getPrice());
    }

    @Test
    public void hasMinHight() {
        assertEquals(120, ride1.getMinHeight());
    }

    @Test
    public void hasMaxHight() {
        assertEquals(999, ride1.getMaxHeight());
    }

    @Test
    public void canAddRider() {
        ride1.addRider(man);
        manRiders = new ArrayList<>();
        manRiders.add(man);
        assertEquals(manRiders, ride1.getRiders());
    }

    @Test
    public void restrictHieght() {
        ride1.addRider(boy);
        zeroRiders = new ArrayList<>();
        assertEquals(zeroRiders, ride1.getRiders());
    }

}
