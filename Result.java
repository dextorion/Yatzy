import java.util.*;

public class Result
{
    private int ettor;
    private int tvaor;
    private int treor;
    private int fyror;
    private int femmor;
    private int sexor;
    private int par;
    private int tvapar;
    private int triss;
    private int fyrtal;
    private int kak;
    private int LitenStege;
    private int StorStege;
    private int Chans;
    private int Yatzy;
    private int Total = 0;
    
    public Result()
    {
        ettor = 0;
        tvaor = 0;
        treor = 0;
        fyror = 0;
        femmor = 0;
        sexor = 0;
        par = 0;
        tvapar = 0;
        triss = 0;
        fyrtal = 0;
        kak = 0;
    }
     /**
     *En kontroll med inparameter 1-6. Kontrollera hur många, ex. tvåor tärningarna visar.
     *@param Vector
     **/       
    public int antalAv(Vector parsedDices, int num)
    {
        int antalAv = 0;
        
        for(int i = 0; i < 5; i++)
        {
            if(((Dice)parsedDices.get(i)).getDice() == num)
            {
                antalAv++;
                
            }
        }
        
        return antalAv;
    }
    /**
     *Kontroll av antalet Ettor, nedan följer antalet tvår, treor osv tom antalet sexor.
     *@param Vector
     **/     
    public void setEttor(Vector parsedDices)
    {
        int antalEttor = 0;
        for(int i = 0; i < 5;i++)
        {
            if(((Dice)parsedDices.get(i)).getDice() == 1)
            {
                antalEttor++;
            }
        }
        ettor = antalEttor * 1;
    }
    
    public void setTvaor(Vector parsedDices)
    {
        int antalTvaor = 0;
        for(int i = 0; i < 5;i++)
        {
            if(((Dice)parsedDices.get(i)).getDice() == 2)
            {
                antalTvaor++;
            }
        }
        tvaor = antalTvaor * 2;
    }
    
    public void setTreor(Vector parsedDices)
    {
        int antalTreor = 0;
        for(int i = 0; i < 5;i++)
        {
            if(((Dice)parsedDices.get(i)).getDice() == 3)
            {
                antalTreor++;
            }
        }
        treor = antalTreor * 3;
    }
    
    public void setFyror(Vector parsedDices)
    {
        int antalFyror = 0;
        for(int i = 0; i < 5;i++)
        {
            if(((Dice)parsedDices.get(i)).getDice() == 4)
            {
                antalFyror++;
            }
        }
        fyror = antalFyror * 4;
    }
    
    public void setFemmor(Vector parsedDices)
    {
        int antalFemmor = 0;
        for(int i = 0; i < 5;i++)
        {
            if(((Dice)parsedDices.get(i)).getDice() == 5)
            {
                antalFemmor++;
            }
        }
        femmor = antalFemmor * 5;
    }
    
    public void setSexor(Vector parsedDices)
    {
        int antalSexor = 0;
        for(int i = 0; i < 5;i++)
        {
            if(((Dice)parsedDices.get(i)).getDice() == 6)
            {
                antalSexor++;
            }
        }
        sexor = antalSexor * 6;
    }
    /**
     *Kontrollerar om tärningarna innehåller ett par. i går ner från 6 till 1 för att välja de högsta
     *paret först om tärningarna skulle innehåll mer än ett par.
     *@param Vector
     **/ 
    public void setPar(Vector parsedDices)
    {
        int highestPair = 0;
        
        
        for(int i = 6; i > 0;i--)
        {
            if(highestPair < 2)
            {
                if((antalAv(parsedDices, i)) >= 2)
                {
                    highestPair = i;
                }
            }
        }
        highestPair = highestPair * 2;
        par = highestPair;
        
    }
    /**
     *Kontrollerar om det finns 2 st par. ser även till så att tex 4 st femmor inte kan bilda 2 par.
     *@param Vector
     **/ 
    public void setTvapar(Vector parsedDices)
    {
        int firstPair = 0;
        int secondPair = 0;
        int sum = 0;
        
        for(int i = 6; i > 0;i--)
        {
            if(firstPair < 2)
            {
                if((antalAv(parsedDices, i)) >= 2)
                {
                    firstPair = i;
                }
            }
        }
        
        if(firstPair > 0)
        {
            for(int i = 6; i > 0;i--)
            {
                if(secondPair < 2)
                {
                    if(firstPair != i && antalAv(parsedDices, i) >=2)
                    {
                        secondPair = i;
                    }
                }
            }
        }
        if(firstPair > 0 && secondPair > 0)
        {
            sum = (firstPair * 2) + (secondPair * 2);
        }
        
        
        tvapar = sum;
    }
    /**
     *Kontrollerar så där finns 3 st av samma tärning, tex, 3 fyror.
     *@param Vector
     **/ 
    public void setTriss(Vector parsedDices)
    {
        int ifTriss = 0;
        
        for(int i = 6; i > 0;i--)
        {
            if(ifTriss < 3)
            {
                if((antalAv(parsedDices, i)) >=3)
                {
                    ifTriss = i;
                }
            }
        }
        triss = ifTriss * 3;
    }
    /**
     *Kontrollerar så där finns ett fyrtal
     *@param Vector
     **/ 
    public void setFyrtal(Vector parsedDices)
    {
        int ifFyrtal = 0;
        
        for(int i = 6; i > 0;i--)
        {
            if(ifFyrtal < 3)
            {
                if((antalAv(parsedDices, i)) >=4)
                {
                    ifFyrtal = i;
                }
            }
        }
        fyrtal = ifFyrtal * 4;
    }
    /**
     *Söker efter en Kåk. ser även till så att 5 treor inte kan bilda en kåk.,
     *@param Vector
     **/
    public void setKak(Vector parsedDices)
    {
        int firstPair = 0;
        int secondPair = 0;
        int sum = 0;
        
        for(int i = 6; i > 0;i--)
        {
            if(firstPair < 2)
            {
                if((antalAv(parsedDices, i)) == 2)
                {
                    firstPair = i;
                }
            }
        }
        
        if(firstPair > 0)
        {
            for(int i = 6; i > 0;i--)
            {
                if(secondPair < 2)
                {
                    if(firstPair != i && antalAv(parsedDices, i) == 3)
                    {
                        secondPair = i;
                    }
                }
            }
        }
        
        if(firstPair > 0 && secondPair > 0)
        {
            sum = (firstPair * 2) + (secondPair * 3);
        }
        
        
        kak = sum;
    }
     /**
     *Chansen bildar summan av samliga tärningar
     *@param Vector
     **/
    public void setChans(Vector parsedDices)

    {
        int ifChans = 0;
        
        ifChans = ((Dice)parsedDices.get(0)).getDice() +
                ((Dice)parsedDices.get(1)).getDice() +
                ((Dice)parsedDices.get(2)).getDice() +
                ((Dice)parsedDices.get(3)).getDice() +
                ((Dice)parsedDices.get(4)).getDice();
        Chans = ifChans;
    }
     /**
     *5 av samma typ bildar en yatzy
     *@param Vector
     **/ 
    public void setYatzy(Vector parsedDices)
    {
        int ifYatzy = 0;
        
        for(int i = 6; i > 0;i--)
        {
            if((antalAv(parsedDices, i)) == 5)
            {
                ifYatzy = 50;
            }
        }
        
        Yatzy = ifYatzy;
    }
    /**
     *Söker efter tärningsföljden 1, 2, 3, 4, 5.
     *@param Vector
     **/ 
    public void setLitenStege(Vector parsedDices)
    {
        int ifLitenStege = 0;
        if((antalAv(parsedDices, 1)) == 1 &&
                (antalAv(parsedDices, 2)) == 1 &&
                (antalAv(parsedDices, 3)) == 1 &&
                (antalAv(parsedDices, 4)) == 1 &&
                (antalAv(parsedDices, 5)) == 1)
        {
            ifLitenStege = 15;
        }
        LitenStege = ifLitenStege;
    }
    /**
     *Söker efter tärningsföljden 2, 3, 4, 5, 6
     *@param Vector
     **/ 
    public void setStorStege(Vector parsedDices)
    {
        int ifStorStege = 0;
        if((antalAv(parsedDices, 2)) == 1 &&
                (antalAv(parsedDices, 3)) == 1 &&
                (antalAv(parsedDices, 4)) == 1 &&
                (antalAv(parsedDices, 5)) == 1 &&
                (antalAv(parsedDices, 6)) == 1)
        {
            ifStorStege = 20;
        }
        StorStege = ifStorStege;
    }
    
    public int getEttor()
    {
        return ettor;
        
    }
    public int getTvaor()
    {
        return tvaor;
    }
    public int getTreor()
    {
        return treor;
    }
    public int getFyror()
    {
        return fyror;
    }
    public int getFemmor()
    {
        return femmor;
    }
    public int getSexor()
    {
        return sexor;
    }
    public int getPar()
    {
        return par;
    }
    public int getTvapar()
    {
        return tvapar;
    }
    public int getTriss()
    {
        return triss;
    }
    public int getFyrtal()
    {
        return fyrtal;
    }
    public int getKak()
    {
        return kak;
    }
    public int getLitenStege()
    {
        return LitenStege;
    }
    public int getStorStege()
    {
        return StorStege;
    }
    public int getChans()
    {
        return Chans;
    }
    public int getYatzy()
    {
        return Yatzy;
    }
}