public class Life implements ILife {
  
  public boolean [][] raster = new boolean [5][5]; 

  public static void main(String[] args) {
    Life l = new Life(new String[] {  "***  ",
                                      "     ",
                                      "     ",
                                      "     ",
                                      "     " });
    l = (Life) l.nextGeneration();
  }

  public Life() {
    nukeAll();
  }

  public Life(String[] setup) {
    this();
    
    for (int x = 0; x < setup.length; x++)
      for (int y = 0; y < setup[x].length();y++)
        if (setup[x].charAt(y) != ' ')
          setAlive(x, y);

    //print(raster);
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
  // Verhindern von null Pointer Exception
  if (x >= 0 && x < raster.length){
    if (y >= 0 && y < raster[x].length){
      return raster[x][y];
    }
  }
    //Außerhalb des Rasters = tot
    return false;
  }

  public ILife nextGeneration() {
    Life l = new Life();
    for (int i = 0; i< raster.length; i++){
      for (int j = 0; j< raster[i].length; j++){
        int neighbours = checkNeighbours(i,j);
        if (neighbours < 2 || neighbours > 3){
          l.setDead(i,j);
        } else {
          l.setAlive(i,j);
          if (neighbours == 3){
            l.setAlive(i,j);
          } else {
            boolean lastGeneration = isAlive(i,j);
            if (lastGeneration){
              l.setAlive(i,j);
            } else {
              l.setDead(i,j);
            }
          }
        }
      }
    }
    return l;
  }

  public void print(boolean [][] r)
  {
    for (int i = 0; i< r.length; i++){
      for (int j = 0; j< r[i].length; j++){
        System.out.println(""+r[i][j]);
      }
    }
  }

  public int checkNeighbours(int i, int j) {
    int neighbours = 0;

    //oben
    if (isAlive(i-1,j)) neighbours++;
    //unten
    if (isAlive(i+1,j)) neighbours++;
    // rechts
    if (isAlive(i,j+1)) neighbours++;
    // links
    if (isAlive(i,j-1)) neighbours++;
    // links oben
    if (isAlive(i-1,j-1)) neighbours++;
    // links unten
    if (isAlive(i+1,j-1)) neighbours++;
    // rechts oben
    if (isAlive(i-1,j+1)) neighbours++;
    // rechts unten
    if (isAlive(i+1,j+1)) neighbours++;
    return neighbours;
  }
}