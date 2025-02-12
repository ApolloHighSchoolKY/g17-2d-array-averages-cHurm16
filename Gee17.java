public class Gee17{
  public static void main(String[] args){

    int[][] ray = new int[7][7];

    ray[0][0] = 1;
    ray[0][1] = 2;
    ray[0][2] = 3;
    ray[0][3] = 4;
    ray[0][4] = 5;
    ray[0][5] = 6;
    ray[0][6] = 7;
    ray[1][0] = 2;
    ray[1][1] = 3;
    ray[1][2] = 4;
    ray[1][3] = 5;
    ray[1][4] = 6;
    ray[1][5] = 7;
    
    
    ArrayAverages twoDee = new TwoDee();

    twoDee.rowAverages();
    twoDee.columnAverages();
    twoDee.arrayAverage();
  }
}
