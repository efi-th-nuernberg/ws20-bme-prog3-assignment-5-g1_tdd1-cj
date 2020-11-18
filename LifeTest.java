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
<<<<<<< HEAD
        //Arrange: drei lebende Zellen
=======
        // Arrange: drei lebende Zellen
>>>>>>> ca7ecb748aac96aa5f21fbe431a5d89029866e5c
        Life l = new Life();
        l.setAlive(0, 0);
        l.setAlive(0, 1);
        l.setAlive(0, 2);

<<<<<<< HEAD
        //Act: Berechnung der Folgegeneration
        ILife nextGen = l.nextGeneration();

        // Assert: Rasterpunkt mit weniger als einem Nachbar stirbt //an Einsamkeit
=======
        // Act: Berechnung der Folgegeneration
        ILife nextGen = l.nextGeneration();

        // Assert: Rasterpunkt mit drei Nachbarn sollte jetzt leben
>>>>>>> ca7ecb748aac96aa5f21fbe431a5d89029866e5c
        assertFalse(nextGen.isAlive(0, 0));
        assertFalse(nextGen.isAlive(0, 2));
    }


    @Test
<<<<<<< HEAD
    public void keepAliveCell2() {
        //Arrange: drei lebende Zellen
=======
    public void keepAliveCell() {
              // Arrange: drei lebende Zellen
>>>>>>> ca7ecb748aac96aa5f21fbe431a5d89029866e5c
        Life l = new Life();
        l.setAlive(0, 0);
        l.setAlive(0, 1);
        l.setAlive(0, 2);

<<<<<<< HEAD
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
=======
        // Act: Berechnung der Folgegeneration
        ILife nextGen = l.nextGeneration();

        // Assert: Rasterpunkt mit drei Nachbarn sollte jetzt leben
        assertTrue(nextGen.isAlive(0, 1));
>>>>>>> ca7ecb748aac96aa5f21fbe431a5d89029866e5c
    }


    @Test
    public void destroyCrowdedCell() {
<<<<<<< HEAD
        // Arrange: drei lebende Zellen
=======
                    // Arrange: drei lebende Zellen
>>>>>>> ca7ecb748aac96aa5f21fbe431a5d89029866e5c
        Life l = new Life();
        l.setAlive(0, 0);
        l.setAlive(0, 1);
        l.setAlive(0, 2);
        l.setAlive(1, 0);
        l.setAlive(1, 1);
        l.setAlive(1, 2);

        // Act: Berechnung der Folgegeneration
        ILife nextGen = l.nextGeneration();

<<<<<<< HEAD
        // Assert: Rasterpunkt mit mehr als 3 Nachbarn sterben in der 
        //Folgegeneration
=======
        // Assert: Rasterpunkt mit drei Nachbarn sollte jetzt leben
>>>>>>> ca7ecb748aac96aa5f21fbe431a5d89029866e5c
        assertFalse(nextGen.isAlive(0, 1));
        assertFalse(nextGen.isAlive(1, 1));
    }


}
