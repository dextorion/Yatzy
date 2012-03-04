import java.util.*;

public class Player
{
    //--- Instance variables -------------------
    /**
     *Instance variables
     **/
    private String name;
    private Result pResult = new Result();
    
    //--- Default constructor ----===============
    /**
     *Default constructor
     **/
    public Player()
    {
        name = "JohnDoe";
    }
    
    //-- Get name -------------------------------
    /**
     *Hämtar namnet
     **/
    public String getName()
    {
        return name;
    }
    
    //-- Set name --------------------------------
    /**
     *Sätter namnet
     *@param String parsedName
     **/
    public void setName(String parsedName)
    {
        name = parsedName;
    }
    /**
     *Sätter resultatet av "ettor"
     *@param Vector parsedDices
     **/    
    public void setEttor(Vector parsedDices)
    {
        pResult.setEttor(parsedDices);
    }
    /**
     *Sätter resultatet av "tvåor"
     *@param Vector parsedDices
     **/    
    public void setTvaor(Vector parsedDices)
    {
        pResult.setTvaor(parsedDices);
    }
    /**
     *Sätter resultatet av "treor"
     *@param Vector parsedDices
     **/    
    public void setTreor(Vector parsedDices)
    {
        pResult.setTreor(parsedDices);
    }
    /**
     *Sätter resultatet av "fyror"
     *@param Vector parsedDices
     **/        
    public void setFyror(Vector parsedDices)
    {
        pResult.setFyror(parsedDices);
    }
    /**
     *Sätter resultatet av "femmor"
     *@param Vector parsedDices
     **/    
    public void setFemmor(Vector parsedDices)
    {
        pResult.setFemmor(parsedDices);
    }
    /**
     *Sätter resultatet av "sexor"
     *@param Vector parsedDices
     **/    
    public void setSexor(Vector parsedDices)
    {
        pResult.setSexor(parsedDices);
    }
    /**
     *Sätter resultatet av paret
     *@param Vector parsedDices
     **/    
    public void setPar(Vector parsedDices)
    {
        pResult.setPar(parsedDices);
    }
    /**
     *Sätter resultatet av tvåparet
     *@param Vector parsedDices
     **/ 
    public void setTvapar(Vector parsedDices)
    {
        pResult.setTvapar(parsedDices);
    }
    /**
     *Sätter resultatet av trissen
     *@param Vector parsedDices
     **/ 
    public void setTriss(Vector parsedDices)
    {
        pResult.setTriss(parsedDices);
    }
    /**
     *Sätter resultatet av fyrtalet
     *@param Vector parsedDices
     **/ 
    public void setFyrtal(Vector parsedDices)
    {
        pResult.setFyrtal(parsedDices);
    }
    /**
     *Sätter resultatet av kåken
     *@param Vector parsedDices
     **/ 
    public void setKak(Vector parsedDices)
    {
        pResult.setKak(parsedDices);
    }
    /**
     *Sätter resultatet av lillan
     *@param Vector parsedDices
     **/ 
    public void setLitenStege(Vector parsedDices)
    {
        pResult.setLitenStege(parsedDices);
    }
    /**
    *Sätter resultatet av storan
    *@param Vector parsedDices
    **/ 
    public void setStorStege(Vector parsedDices)
    {
        pResult.setStorStege(parsedDices);
    }
    /**
    *Sätter resultatet av chansen
    *@param Vector parsedDices
    **/ 
    public void setChans(Vector parsedDices)
    {
        pResult.setChans(parsedDices);
    }
    /**
     *Sätter resultatet av yatzyn
     *@param Vector parsedDices
     **/ 
    public void setYatzy(Vector parsedDices)
    {
        pResult.setYatzy(parsedDices);
    }
    
    /**
     *Hämtar resultatet av ettor
     **/     
    public int getEttor()
    {
        return pResult.getEttor();
    }
    
    /**
     *Hämtar resultatet av tvåorna
     **/
    public int getTvaor()
    {
        return pResult.getTvaor();
    }
    
    /**
     *Hämtar resultatet av treorna
     **/
    public int getTreor()
    {
        return pResult.getTreor();
    }
    
    /**
     *Hämtar resultatet av fyrorna
     **/
    public int getFyror()
    {
        return pResult.getFyror();
    }
    
    /**
     *Hämtar resultatet av femmorna
     **/
    public int getFemmor()
    {
        return pResult.getFemmor();
    }
    
    /**
     *Hämtar resultatet av sexorna
     **/
    public int getSexor()
    {
        return pResult.getSexor();
    }
    
    /**
     *Hämtar resultatet av paret
     **/
    public int getPar()
    {
        return pResult.getPar();
    }
    
    /**
     *Hämtar resultatet av tvåparet
     **/
    public int getTvapar()
    {
        return pResult.getTvapar();
    }
    
    /**
     *Hämtar resultatet av trissen
     **/
    public int getTriss()
    {
        return pResult.getTriss();
    }
    
    /**
     *Hämtar resultatet av fyrtalet
     **/
    public int getFyrtal()
    {
        return pResult.getFyrtal();
    }
    
    /**
     *Hämtar resultatet av kåken
     **/
    public int getKak()
    {
        return pResult.getKak();
    }
    
    /**
     *Hämtar resultatet av lillan
     **/
    public int getLitenStege()
    {
        return pResult.getLitenStege();
    }
    
    /**
     *Hämtar resultatet av storan
     **/
    public int getStorStege()
    {
        return pResult.getStorStege();
    }
    
    /**
     *Hämtar resultatet av Chansen
     **/
    public int getChans()
    {
        return pResult.getChans();
    }
    
    /**
     *Hämtar resultatet av Yatzyn
     **/
    public int getYatzy()
    {
        return pResult.getYatzy();
    }
}