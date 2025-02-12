import java.util.Arrays;

public class ArrayAverages{
  
  int[][] ray;

  public ArrayAverages(int[][] rayray){
    ray = rayray;
  }

  public void rowAverages(){
    for (int row=0;row<ray.length;row++)
    {
    for (int col=0; col<ray[row].length; col++)
    {
      ray[row][col]=0;
    }
    }
  }

  public void columnAverages()
  {
    //Column major order
    //  Take each column and go through all of the rows
    //  Top down and Left to Right
    int colAvg =0;
    for(int col=0; col<ray.length; col++)
    {
    for(int row=0; row<ray[col].length; row++)
    {
      colAvg += col/row;
    }
    }

  }

  public void arrayAverage(){
    for (int row =0; row<ray.length; row++)
    for (int col=0; col<ray[row].length; col++)

    {
      ray[row][col] =(int)(Math.random()*11+ 0);
    }

    System.out.println("");

    for (int row =0; row<ray.length; row++)
    {
      System.out.println(Arrays.toString(ray[row]));
    }

  }

  public String toString(){
    for(int row=0; row<ray.length; row++)
    {
      System.out.println(Arrays.toString(ray[row]));
    }
    return "";
  }
}
