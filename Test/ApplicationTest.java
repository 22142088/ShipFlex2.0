import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ApplicationTest {
    @Test
    public void testAlleOptiesInzienSpeedboot() {
        // Arrange
        OptieLijst.initialiseOptieLijst();
        TestIO io = new TestIO();
        String testString = "";
        // Act
        io.addNextIntInputs(3); // opties inzien
        io.addNextIntInputs(1); // alle opties inzien
        io.addNextIntInputs(1); // speedboot
        io.addNextIntInputs(1); // terug
        io.addNextIntInputs(4); // exit
        new HoofdMenu().createMenu(io);
        // Assert
        for (String string : io.getOutputs()) {
            if (string.contains("carbon fiber")) {
                testString = string;
                break;
            }
        }
        assertEquals("carbon fiber                  | voor de luxe afwerking van het schip                                  | €300   | materiaal\n", testString);
    }
}
