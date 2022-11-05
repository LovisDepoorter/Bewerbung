import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ArrayExperimente_MLTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ArrayExperimente_MLTest
{
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testistEnthalten()
    {
        int[] testArray = new int[] {1, -43, 1000, 1000, 3, 4, 13, 1000, 70, -41};
        assertTrue(ArrayExperimente_ML.istEnthalten(1000, testArray));
        assertTrue(ArrayExperimente_ML.istEnthalten(-41, testArray));
        assertTrue(ArrayExperimente_ML.istEnthalten(1, testArray));
        assertFalse(ArrayExperimente_ML.istEnthalten(77, testArray));

        testArray = new int[] {66};
        assertTrue(ArrayExperimente_ML.istEnthalten(66, testArray));
        assertFalse(ArrayExperimente_ML.istEnthalten(77, testArray));

        testArray = new int[] {};
        assertFalse(ArrayExperimente_ML.istEnthalten(77, testArray));
    }

    @Test
    public void testindexVon()
    {
        int[] testArray = new int[] {1, -43, 1000, 1000, 3, 4, 13, 1000, 70, -41};
        assertEquals(0, ArrayExperimente_ML.indexVon(1, testArray));
        assertEquals(1, ArrayExperimente_ML.indexVon(-43, testArray));
        assertEquals(9, ArrayExperimente_ML.indexVon(-41, testArray));
        assertEquals(-1, ArrayExperimente_ML.indexVon(1231, testArray));

        testArray = new int[] {66};
        assertEquals(-1, ArrayExperimente_ML.indexVon(1231, testArray));
        assertEquals(0, ArrayExperimente_ML.indexVon(66, testArray));

        testArray = new int[] {};
        assertEquals(-1, ArrayExperimente_ML.indexVon(1231, testArray));

    }

    @Test
    public void testmaxWert()
    {
        int[] testArray = new int[] {1, -43, 1000, 1000, 3, 4, 13, 1000, 70, -41};
        assertEquals(1000, ArrayExperimente_ML.maxWert(testArray));

        testArray = new int[] {0, -43, -41};
        assertEquals(0, ArrayExperimente_ML.maxWert(testArray));

        testArray = new int[] {-43, -41};
        assertEquals(-41, ArrayExperimente_ML.maxWert(testArray));

        testArray = new int[] {66};
        assertEquals(66, ArrayExperimente_ML.maxWert(testArray));
    }

    @Test
    public void testmaxIndex()
    {
        int[] testArray = new int[] {1, -43, 1000, 3, 4, 13, 70, -41};
        assertEquals(2, ArrayExperimente_ML.maxIndex(testArray));

        testArray = new int[] {1, -43, 1000, 3, 4, 13, 70, -41, 5367};
        assertEquals(8, ArrayExperimente_ML.maxIndex(testArray));

        testArray = new int[] {0, -43, -41};
        assertEquals(0, ArrayExperimente_ML.maxIndex(testArray));

        testArray = new int[] {-43, -41};
        assertEquals(1, ArrayExperimente_ML.maxIndex(testArray));

        testArray = new int[] {-41};
        assertEquals(0, ArrayExperimente_ML.maxIndex(testArray));
    }

    @Test
    public void testquersumme()
    {
        int[] testArray = new int[] {1, -43, 3, 4, 13, 70, -41};
        assertEquals(7, ArrayExperimente_ML.querSumme(testArray));

        testArray = new int[] {0, -43, -41};
        assertEquals(-84, ArrayExperimente_ML.querSumme(testArray));

        // einelementiges Array:
        testArray = new int[] {51};
        assertEquals(51, ArrayExperimente_ML.querSumme(testArray));
    }

    @Test
    public void testaddiereJeweilsD()
    {
        int[] arrayVorher = new int[] {1, -43, 3, 4, 13, 70, -41};
        int[] testArray   = new int[] {1, -43, 3, 4, 13, 70, -41};

        int dazu = 1;
        ArrayExperimente_ML.addiereJeweilsD(testArray, dazu);

        int idx = 0;
        while(idx < testArray.length)
        {
            if( testArray[idx] != arrayVorher[idx] + dazu )
            {
                fail("Arrays unterscheiden sich an der Position " + idx + "!");
            }
            idx ++ ;
        }
    }

    @Test
    public void testvektorsumme()
    {
        int[] a   = new int[] { 1, -43, 3, 4, 13, 70, -41 };
        int[] b   = new int[] { 5, -4,  8, 4, 11, 7,    5 };
        int[] summe = ArrayExperimente_ML.vektorsumme(a, b);
        assertNotNull(summe);

        int idx = 0;
        while(idx < a.length)
        {
            if( summe[idx] != a[idx] + b[idx] )
            {
                fail("Summe falsch an der Position " + idx + "!");
            }
            idx ++ ;
        }
    }

    @Test
    public void testarrayUmdrehen()
    {
        // Array mit ungerader Laenge:
        int[] drehmich = new int[] { 1, -43, 3, 4, 13, 70, -41 };
        int[] rumgedreht = ArrayExperimente_ML.arrayUmdrehen(drehmich);
        assertEquals(drehmich.length, rumgedreht.length);

        int idx = 0;
        while(idx < drehmich.length) {
            if( rumgedreht[idx] != drehmich[ rumgedreht.length - 1 - idx ] ) {
                fail("Ergebnisarray falsch bei Index " + idx + "!");
            }
            idx ++ ;
        }

        // Array mit gerader Laenge:
        drehmich = new int[] { 1, -43, 3, 4, 70, -41 };
        rumgedreht = ArrayExperimente_ML.arrayUmdrehen(drehmich);
        assertEquals(drehmich.length, rumgedreht.length);

        idx = 0;
        while(idx < drehmich.length) {
            if( rumgedreht[idx] != drehmich[ rumgedreht.length - 1 - idx ] ) {
                fail("Ergebnisarray falsch bei Index " + idx + "!");
            }
            idx ++ ;
        }

        // Array mit Laenge 1:
        drehmich = new int[] { 1 };
        rumgedreht = ArrayExperimente_ML.arrayUmdrehen(drehmich);
        assertEquals(drehmich.length, rumgedreht.length);

        idx = 0;
        while(idx < drehmich.length) {
            if( rumgedreht[idx] != drehmich[ rumgedreht.length - 1 - idx ] ) {
                fail("Ergebnisarray falsch bei Index " + idx + "!");
            }
            idx ++ ;
        }
    }
}