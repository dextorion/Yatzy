import java.util.*;
import javax.swing.*;

public class Yatzy extends JFrame
{
    private Player player1;
    private Player player2;
    private SumDices dices;
    Highscore highScore;
    
    /**
     *Calles on method initInsVariables().
     **/
    public Yatzy()
    {
        initInsVariables();
    }
    
    
    private void initInsVariables()
    {
        player1 = new Player();
        player2 = new Player();
        dices = new SumDices();
        highScore = new Highscore();
    }
    /**
     *Sets player one's name
     *@param parsedName String object that will be used as name for player one.
     **/
    public void setNameP1(String parsedName)
    {
        player1.setName(parsedName);
    }
     /**
     *Sets the second player's name
     *@param parsedName String object that will be used as name for player one.
     **/   
    public void setNameP2(String parsedName)
    {
        player2.setName(parsedName);
    }
     /**
     *Hämtar spelare 1:s namn
     **/    
    public String getNameP1()
    {
        return player1.getName();
    }
     /**
     *Hämtar spelare 2:s namn
     **/    
    public String getNameP2()
    {
        return player2.getName();
    }
     /**
     *Hämtar värdena på tärningarna samt stickar tillbaka det
	 *@param int i
     **/        
    public int getDiceValue(int i)
    {
        int sDice;
        sDice = dices.getDiceValue(i);
        return sDice;
    }
     /**
     *Kastar tärningarna
	 **/         
    public void tossDices()
    {
        dices.tossDices();
    }
     /**
     *Sparar tärningarna
	 *@param int pValue
	 **@param int pDice
     **/      
    public void keepDice(int pValue, int pDice)
    {
        dices.keepDice(pValue, pDice);
    }
    
	 /**
     *Nedan följer metoder för att kontrollera tärningarnas resultat (för både P1 och P2)
     **/   
    public void setEttorP1()
    {
        player1.setEttor(dices.getDices());
    }
    public void setTvaorP1()
    {
        player1.setTvaor(dices.getDices());
    }
    public void setTreorP1()
    {
        player1.setTreor(dices.getDices());
    }
    public void setFyrorP1()
    {
        player1.setFyror(dices.getDices());
    }
    public void setFemmorP1()
    {
        player1.setFemmor(dices.getDices());
    }
    public void setSexorP1()
    {
        player1.setSexor(dices.getDices());
    }
    public void setParP1()
    {
        player1.setPar(dices.getDices());
    }
    public void setTvaparP1()
    {
        player1.setTvapar(dices.getDices());
    }
    public void setTrissP1()
    {
        player1.setTriss(dices.getDices());
    }
    public void setFyrtalP1()
    {
        player1.setFyrtal(dices.getDices());
    }
    public void setKakP1()
    {
        player1.setKak(dices.getDices());
    }
    public void setLitenStegeP1()
    {
        player1.setLitenStege(dices.getDices());
    }
    public void setStorStegeP1()
    {
        player1.setStorStege(dices.getDices());
    }
    public void setChansP1()
    {
        player1.setChans(dices.getDices());
    }
    public void setYatzyP1()
    {
        player1.setYatzy(dices.getDices());
    }
    
    public void setEttorP2()
    {
        player2.setEttor(dices.getDices());
    }
    public void setTvaorP2()
    {
        player2.setTvaor(dices.getDices());
    }
    public void setTreorP2()
    {
        player2.setTreor(dices.getDices());
    }
    public void setFyrorP2()
    {
        player2.setFyror(dices.getDices());
    }
    public void setFemmorP2()
    {
        player2.setFemmor(dices.getDices());
    }
    public void setSexorP2()
    {
        player2.setSexor(dices.getDices());
    }
    public void setParP2()
    {
        player2.setPar(dices.getDices());
    }
    public void setTvaparP2()
    {
        player2.setTvapar(dices.getDices());
    }
    public void setTrissP2()
    {
        player2.setTriss(dices.getDices());
    }
    public void setFyrtalP2()
    {
        player2.setFyrtal(dices.getDices());
    }
    public void setKakP2()
    {
        player2.setKak(dices.getDices());
    }
    public void setLitenStegeP2()
    {
        player2.setLitenStege(dices.getDices());
    }
    public void setStorStegeP2()
    {
        player2.setStorStege(dices.getDices());
    }
    public void setChansP2()
    {
        player2.setChans(dices.getDices());
    }
    public void setYatzyP2()
    {
        player2.setYatzy(dices.getDices());
    }
    
    
    public int getEttorP1()
    {
        return player1.getEttor();
    }
    public int getTvaorP1()
    {
        return player1.getTvaor();
    }
    public int getTreorP1()
    {
        return player1.getTreor();
    }
    public int getFyrorP1()
    {
        return player1.getFyror();
    }
    public int getFemmorP1()
    {
        return player1.getFemmor();
    }
    public int getSexorP1()
    {
        return player1.getSexor();
    }
    public int getParP1()
    {
        return player1.getPar();
    }
    public int getTvaparP1()
    {
        return player1.getTvapar();
    }
    public int getTrissP1()
    {
        return player1.getTriss();
    }
    public int getFyrtalP1()
    {
        return player1.getFyrtal();
    }
    public int getKakP1()
    {
        return player1.getKak();
    }
    public int getLitenStegeP1()
    {
        return player1.getLitenStege();
    }
    public int getStorStegeP1()
    {
        return player1.getStorStege();
    }
    public int getChansP1()
    {
        return player1.getChans();
    }
    public int getYatzyP1()
    {
        return player1.getYatzy();
    }
    
    public int getEttorP2()
    {
        return player2.getEttor();
    }
    public int getTvaorP2()
    {
        return player2.getTvaor();
    }
    public int getTreorP2()
    {
        return player2.getTreor();
    }
    public int getFyrorP2()
    {
        return player2.getFyror();
    }
    public int getFemmorP2()
    {
        return player2.getFemmor();
    }
    public int getSexorP2()
    {
        return player2.getSexor();
    }
    public int getParP2()
    {
        return player2.getPar();
    }
    public int getTvaparP2()
    {
        return player2.getTvapar();
    }
    public int getTrissP2()
    {
        return player2.getTriss();
    }
    public int getFyrtalP2()
    {
        return player2.getFyrtal();
    }
    public int getKakP2()
    {
        return player2.getKak();
    }
    public int getLitenStegeP2()
    {
        return player2.getLitenStege();
    }
    public int getStorStegeP2()
    {
        return player2.getStorStege();
    }
    public int getChansP2()
    {
        return player2.getChans();
    }
    public int getYatzyP2()
    {
        return player2.getYatzy();
    }
    
    public void setScore(String pName, String pResult)
    {
        highScore.setScore(pName, pResult);
    }
    
    public Vector showScore()
    {
        return highScore.showScore();
    }
}