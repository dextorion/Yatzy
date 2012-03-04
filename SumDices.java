import java.util.*;

public class SumDices
{
    
    private Vector allDices;
    
    private Dice d1;
    private Dice d2;
    private Dice d3;
    private Dice d4;
    private Dice d5;
    
    private int keepDices[] = {0,0,0,0,0};
    
     /**
     *Default Constructor. Initierar vektorn allDices med 5 dice objekt
     **/
    public SumDices()
    {
        allDices = new Vector(5);
        allDices.add(d1 = new Dice());
        allDices.add(d2 = new Dice());
        allDices.add(d3 = new Dice());
        allDices.add(d4 = new Dice());
        allDices.add(d5 = new Dice());
    }
    
     /**
     *Sparar tärningar
     *@param int pValue
     *@param int pDice
     **/
    public void keepDice(int pValue, int pDice)
    {
        keepDices[pDice] = pValue;
    }
    
     /**
     *kastar tärningar
     **/    
    public void tossDices()
    {
        
        for(int i = 0;i < 5;i++)
        {
            if(keepDices[i] == 0)
            {
                ((Dice)allDices.get(i)).toss();
            }
        }
    }
     /**
     *Hämtar tärningarnas värde
     *@param int i
     **/
    public int getDiceValue(int i)
    {
        int diceNr = i;
        int sDice;
        sDice = ((Dice)allDices.get(diceNr)).getDice();
        return sDice;
    }
     /**
     *Vägleder förfrågan efter tärningarna
     **/    
    public Vector getDices()
    {
        return allDices;
    }
}