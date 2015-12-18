
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class RadarTest.
 *
 * @author  Joe Hacker
 * @version 12/17/15
 */
public class RadarTest
{

    /**
     * Default constructor for test class RadarTest
     */
    public RadarTest()
    {
    }

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

    /**
     * tests example 1
     **/
    @Test
    public void test1()
    {
        Radar radar = new Radar(200,200);
        radar.setMonsterLocation(120,41);
        int scans = 0;
        int ROW = 120;
        int COL = 41;

        for(int i = 0; i < 200; i++)
        {
            radar.scan();
        }

        for (int i = 0; i < 200; i++)
        {
            for (int j = 0; j < 200; j++)
            {
                if (radar.getAccumulatedDetection(i,j) > scans)
                {
                    scans = radar.getAccumulatedDetection(i,j);
                    ROW = i;
                    COL = j;
                }
            }
        }
        assertEquals(ROW,120);
        assertEquals(COL,41);
    }

    /**
     * tests example 2
     **/
    @Test
    public void test2()
    {
        Radar radar = new Radar(150,200);
        radar.setMonsterLocation(110,43);
        int scans = 0;
        int ROW = 110;
        int COL = 43;

        for(int i = 0; i < 200; i++)
        {
            radar.scan();
        }

        for (int i = 0; i < 150; i++)
        {
            for (int j = 0; j < 200; j++)
            {
                if (radar.getAccumulatedDetection(i,j) > scans)
                {
                    scans = radar.getAccumulatedDetection(i,j);
                    ROW = i;
                    COL = j;
                }
            }
        }
        assertEquals(ROW,110);
        assertEquals(COL,43);
    }
}