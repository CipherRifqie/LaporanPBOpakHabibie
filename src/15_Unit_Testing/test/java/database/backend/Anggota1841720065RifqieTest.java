package backend;

import junit.framework.TestCase;
import org.junit.*;

import java.util.ArrayList;

public class Anggota1841720065RifqieTest extends TestCase {
    Anggota1841720065Rifqie instance;

    public Anggota1841720065RifqieTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        instance = new Anggota1841720065Rifqie("Rifqie", "Malang", "619");
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
        ArrayList<Anggota1841720065Rifqie> expResult = instance.getByNamaAlamatAndTeleponRifqie(instance.getmNamaRifqie(), instance.getmAlamatRifqie(), instance.getmTeleponRifqie());
        assertTrue(expResult.size() > 0);
    }


    @Test
    public void testSearchRifqie() {
        System.out.println("search test");
        String keyword = "Rifqie";
        ArrayList<Anggota1841720065Rifqie> result = instance.searchRifqie(keyword);
        ArrayList<Anggota1841720065Rifqie> expResult = instance.getByNamaAlamatAndTeleponRifqie(keyword, "", "");
        assertEquals(expResult.size(), result.size());
    }
}