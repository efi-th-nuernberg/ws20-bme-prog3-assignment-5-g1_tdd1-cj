import org.junit.Test;
import static org.junit.Assert.*;

public class LifeTest {
    
    @Test
    public void createNewCell() {
        
        //Arrange: drei lebende Zellen
        Life l = new Life();
        l.setAlive(0, 0);
        l.setAlive(0, 1);
        l.setAlive(0, 2);

        //Act: Berechnung der Folgegeneration
        ILife nextGen = l.nextGeneration();

        //Assert: Rasterpunkt mit drei Nachbarn sollte jetzt leben
        assertTrue(nextGen.isAlive(1, 1));
    }

    @Test
    public void destroyLonelyCell() {
        //Arrange: drei lebende Zellen
        Life l = new Life();
        l.setAlive(0, 0);
        l.setAlive(0, 1);
        l.setAlive(0, 2);

        //Act: Berechnung der Folgegeneration
        ILife nextGen = l.nextGeneration();

        // Assert: Rasterpunkt mit weniger als einem Nachbar stirbt //an Einsamkeit
        assertFalse(nextGen.isAlive(0, 0));
        assertFalse(nextGen.isAlive(0, 2));
    }

    @Test
    public void keepAliveCell2() {
        //Arrange: drei lebende Zellen
        Life l = new Life();
        l.setAlive(0, 0);
        l.setAlive(0, 1);
        l.setAlive(0, 2);

        //Act: Berechnung der Folgegeneration
        ILife nextGen = l.nextGeneration();

        //Assert: Zelle mit 2 Nachbarn bleibt in der Folgegeneration 
        //am Leben
        assertTrue(nextGen.isAlive(0, 1));
    }

      @Test
    public void keepAliveCell3() {
        //Arrange: vier lebende Zellen
        Life l = new Life();
        l.setAlive(0, 0);
        l.setAlive(0, 1);
        l.setAlive(0, 2);
        l.setAlive(1,1);

        //Act: Berechnung der Folgegeneration
        ILife nextGen = l.nextGeneration();

        //Assert: Zelle mit 2 oder 3 Nachbarn bleibt in der Folgegeneration am Leben
        assertTrue(nextGen.isAlive(0, 0));
        assertTrue(nextGen.isAlive(0, 1));
        assertTrue(nextGen.isAlive(0, 2));
        assertTrue(nextGen.isAlive(1, 1));
    }

    @Test
    public void destroyCrowdedCell() {
        // Arrange: drei lebende Zellen
        Life l = new Life();
        l.setAlive(0, 0);
        l.setAlive(0, 1);
        l.setAlive(0, 2);
        l.setAlive(1, 0);
        l.setAlive(1, 1);
        l.setAlive(1, 2);

        // Act: Berechnung der Folgegeneration
        ILife nextGen = l.nextGeneration();

        // Assert: Rasterpunkt mit mehr als 3 Nachbarn sterben in der 
        //Folgegeneration
        assertFalse(nextGen.isAlive(0, 1));
        assertFalse(nextGen.isAlive(1, 1));
    }

}
