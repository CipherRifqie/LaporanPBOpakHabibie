package backend;

import junit.framework.TestCase;
import org.junit.*;

import java.util.ArrayList;

public class Kategori1841720065RifqieTest extends TestCase {
    Kategori1841720065Rifqie instance;

    public Kategori1841720065RifqieTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        instance = new Kategori1841720065Rifqie("Comics", "Comic is combination words and pictures");
        System.out.format("Start Testing : %s \n", instance.getmNamaRifqie());
    }

    @After
    public void tearDown() {
        System.out.format("Finish Test %s\n", instance.getmNamaRifqie());
    }

    @Test
    public void testSaveRifqie() {
        System.out.println("save test");
        instance.saveRifqie();
        ArrayList<Kategori1841720065Rifqie> expResult = instance.getByNamaAndKeteranganRifqie(instance.getmNamaRifqie(), instance.getmKeteranganRifqie());
        assertTrue(expResult.size() > 0);
//        Assert.fail("The test case is a prototype.");
    }

    @Test
    public void testSearchRifqie() {
        System.out.println("search test");
        String keyword = "Comics";
        ArrayList<Kategori1841720065Rifqie> result = instance.searchRifqie(keyword);
        ArrayList<Kategori1841720065Rifqie> expResult = instance.getByNamaAndKeteranganRifqie(keyword, "");
        assertEquals(expResult.size(), result.size());
    }
}