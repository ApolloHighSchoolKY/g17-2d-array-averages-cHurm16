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
    ray[1][0] = 8;
    ray[1][1] = 9;
    ray[1][2] = 10;
    ray[1][3] = 11;
    ray[1][4] = 12;
    ray[1][5] = 13;
    ray[1][6] = 14;
    ray[2][0] = 15;
    ray[2][1] = 16;
    ray[2][2] = 17;
    ray[2][3] = 18;
    ray[2][4] = 19;
    ray[2][5] = 20;
    ray[2][6] = 21;
    ray[3][0] = 22;
    ray[3][1] = 23;
    ray[3][2] = 24;
    ray[3][3] = 25;
    ray[3][4] = 26;
    ray[3][5] = 27;
    ray[3][6] =28;

    
    
    ArrayAverages twoDee = new TwoDee();

    twoDee.rowAverages();
    twoDee.columnAverages();
    twoDee.arrayAverage();
  }
}
