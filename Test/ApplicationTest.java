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

    @Test
    public void testPrijsIndicatie(){
        //arrange
        OptieLijst.initialiseOptieLijst();
        TestIO io = new TestIO();
        String verwachtePrijs = "De totaal prijs is: €1800";
        String testString = "";

        //act
        io.addNextIntInputs(3);//opties inzien
        io.addNextIntInputs(2);//prijs indicatie
        io.addNextIntInputs(1);//speedboat
        io.addNextIntInputs(1);//standaard motor
        io.addNextIntInputs(5);//standaard verf
        io.addNextIntInputs(7);//gerecycled hout
        io.addNextIntInputs(12);//basic cockpit
        io.addNextIntInputs(1);//terug
        io.addNextIntInputs(4);//exit
        new HoofdMenu().createMenu(io);
        //assert
        for (String string : io.getOutputs()) {
            if (string.contains("De totaal prijs is:")) {
                testString = string;
                break;
            }
        }
        assertEquals(verwachtePrijs,testString);
    }

    @Test
    public void testKlantAddAndRemove() {
        // arrange
        OptieLijst.initialiseOptieLijst();
        TestIO io = new TestIO();
        String expected = "Klant verwijderd!";
        String result = "";
        // act
        io.addNextIntInputs(2); // klanten management
        io.addNextIntInputs(2); // nieuwe klant toevoegen
        io.addNextStringInputs("TestKlant"); // klant naam
        io.addNextIntInputs(69); // kortingspercentage
        io.addNextIntInputs(4); // verwijder klant
        io.addNextStringInputs("TestKlant"); // klant naam
        io.addNextIntInputs(5); // terug
        io.addNextIntInputs(4); // exit
        new HoofdMenu().createMenu(io);
        // assert
        for (String string : io.getOutputs()) {
            if (string.contains("Klant verwijderd!")) {
                result = string;
                break;
            }
        }
        assertEquals(expected, result);
    }
}

