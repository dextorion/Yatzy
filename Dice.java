//import java.util.*;

public class Dice
{
    
    private int diceValue;
    
     /**
     *S�tter t�rningarnas v�rde till 0 efter avslutad kastomg�ng
     **/
    public Dice()
    {
        diceValue = 0;
    }

     /**
     *Randomiserar t�rningarna
     **/
    public void toss()
    {
        diceValue = (int)(Math.random() * 6) +1;
    }
    
     /**
     *Retunerar v�rdet p� t�rningen
     **/
    public int getDice()
    {
        return diceValue;
    }
}