package test.model;

/*
public class HackingTest {
    @Test
    public void calculatemainnumber() throws Exception {

    }

}
*/

import main.java.model.Hacking;
import org.junit.Before;

import static org.junit.Assert.assertEquals;



public class HackingTest {

    private Hacking object;

    public HackingTest() {
    }

    @Before
    public void setUp() {
        this.object = new Hacking();
        //Hacking h = new Hacking();
    }

    /**
     * Test of calculatemainnumber method, of class .
     */
    @org.junit.Test
    public void testAdd() {
        long Result = this.object.calculatemainnumber(1, 2, "+");
        assertEquals(3, Result);

        Result = this.object.calculatemainnumber(0, 2, "+");
        assertEquals(2, Result);

        Result = this.object.calculatemainnumber(0, 0, "+");
        assertEquals(0, Result);

        Result = this.object.calculatemainnumber(200000, 200000, "+");
        assertEquals(400000, Result);
    }


    @org.junit.Test
    public void testSub() {
        long Result = this.object.calculatemainnumber(1, 2, "-");
        assertEquals(-1, Result);

        Result = this.object.calculatemainnumber(0, 2, "-");
        assertEquals(-2, Result);

        Result = this.object.calculatemainnumber(0, 0, "-");
        assertEquals(0, Result);

        Result = this.object.calculatemainnumber(121221, 21213, "-");
        assertEquals(100008, Result);
    }

    @org.junit.Test
    public void testMulti() {
        long Result = this.object.calculatemainnumber(1, 1, "*");
        assertEquals(1, Result);

        Result = this.object.calculatemainnumber(2, 2, "*");
        assertEquals(4, Result);

        Result = this.object.calculatemainnumber(99, 6, "*");
        assertEquals(594, Result);

        Result = this.object.calculatemainnumber(9, 2, "*");
        assertEquals(18, Result);
    }

    @org.junit.Test
    public void testDeck() {
        long Result = this.object.calculatemainnumber(6, 2, "/");
        assertEquals(3, Result);

        Result = this.object.calculatemainnumber(2, 2, "/");
        assertEquals(1, Result);

        Result = this.object.calculatemainnumber(100, 10, "/");
        assertEquals(10, Result);

        Result = this.object.calculatemainnumber(15759, 309, "/");
        assertEquals(51, Result);
    }


}