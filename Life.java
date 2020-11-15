public class Life implements ILife {
  
  boolean [][] raster = new boolean [5][5]; 

  public static void main(String[] args) {
    Life l = new Life(new String[] {  "     ",
                                      "     ",
                                      " *** ",
                                      "     ",
                                      "     " });
    l = (Life) l.nextGeneration();
  }

  public Life() {
    nukeAll();
  }

  public Life(String[] setup) {
    this();
    
    for (int y = 0; y < setup.length; y++)
      for (int x = 0; x < setup[y].length(); x++)
        if (setup[y].charAt(x) != ' ')
          setAlive(x, y);
  }


  public void nukeAll() {
    for (int i = 0; i< raster.length; i++){
      for (int j = 0; j < raster[i].length; j++){
        raster[i][j]= false;
      }
    }
  }

  public void setAlive(int x, int y) {
    raster[x][y] = true;
  }

  public void setDead(int x, int y) {
    raster[x][y] = false;
  }

  public boolean isAlive(int x, int y) {
    return raster[x][y];
  }

  public ILife nextGeneration() {
    // TODO Auto-generated method stub
    return null;
  }
}