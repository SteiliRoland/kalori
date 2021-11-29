import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
public class KaloriManTest {

    KaloriMan kaloriman;
    @BeforeEach
    void setUp() {
        this.kaloriman = new KaloriMan();
    }

    @Test
    void calckaloriTest() {
        double weight = 180;
        double height = 71.3;
        double age = 25;
        double expectedKalori = 50976.5725725;

        double actualKalori = this.kaloriman.calcKalori(weight,height,age);

        assertEquals(expectedKalori, actualKalori, 0.01);
    }

    @Test
    void calckaloriAnotherTest() {
        double weight = 175;
        double height = 65.3;
        double age = 18;
        double expectedKalori = 34398.936648200004 ;

        double actualKalori = this.kaloriman.calcKalori(weight,height,age);

        assertEquals(expectedKalori, actualKalori, 0.01);
    }

    @Test
    void calckaloriOneTest() {
        double weight = 160;
        double height = 41.3;
        double age = 13;
        double expectedKalori = 18625.758914;

        double actualKalori = this.kaloriman.calcKalori(weight,height,age);

        assertEquals(expectedKalori, actualKalori, 0.01);
    }

}
