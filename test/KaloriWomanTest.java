import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
public class KaloriWomanTest {

    KaloriWoman kaloriwoman;
    @BeforeEach
    void setUp() {
        this.kaloriwoman = new KaloriWoman();
    }

    @Test
    void calckaloriTest() {
        double weight = 170;
        double height = 60.5;
        double age = 20;
        double expectedKalori = 18250.934400000002;

        double actualKalori = this.kaloriwoman.calcKalori(weight,height,age);

        assertEquals(expectedKalori, actualKalori, 0.01);
    }

    @Test
    void calckaloriAnotherTest() {
        double weight = 160;
        double height = 51.3;
        double age = 17;
        double expectedKalori = 13625.758914;

        double actualKalori = this.kaloriwoman.calcKalori(weight,height,age);

        assertEquals(expectedKalori, actualKalori, 0.01);
    }

    @Test
    void calckaloriOneTest() {
        double weight = 150;
        double height = 39.3;
        double age = 13;
        double expectedKalori = 18625.758914;

        double actualKalori = this.kaloriwoman.calcKalori(weight,height,age);

        assertEquals(expectedKalori, actualKalori, 0.01);
    }

}
