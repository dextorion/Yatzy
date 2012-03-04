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
     *H�mtar namnet
     **/
    public String getName()
    {
        return name;
    }
    
    //-- Set name --------------------------------
    /**
     *S�tter namnet
     *@param String parsedName
     **/
    public void setName(String parsedName)
    {
        name = parsedName;
    }
    /**
     *S�tter resultatet av "ettor"
     *@param Vector parsedDices
     **/    
    public void setEttor(Vector parsedDices)
    {
        pResult.setEttor(parsedDices);
    }
    /**
     *S�tter resultatet av "tv�or"
     *@param Vector parsedDices
     **/    
    public void setTvaor(Vector parsedDices)
    {
        pResult.setTvaor(parsedDices);
    }
    /**
     *S�tter resultatet av "treor"
     *@param Vector parsedDices
     **/    
    public void setTreor(Vector parsedDices)
    {
        pResult.setTreor(parsedDices);
    }
    /**
     *S�tter resultatet av "fyror"
     *@param Vector parsedDices
     **/        
    public void setFyror(Vector parsedDices)
    {
        pResult.setFyror(parsedDices);
    }
    /**
     *S�tter resultatet av "femmor"
     *@param Vector parsedDices
     **/    
    public void setFemmor(Vector parsedDices)
    {
        pResult.setFemmor(parsedDices);
    }
    /**
     *S�tter resultatet av "sexor"
     *@param Vector parsedDices
     **/    
    public void setSexor(Vector parsedDices)
    {
        pResult.setSexor(parsedDices);
    }
    /**
     *S�tter resultatet av paret
     *@param Vector parsedDices
     **/    
    public void setPar(Vector parsedDices)
    {
        pResult.setPar(parsedDices);
    }
    /**
     *S�tter resultatet av tv�paret
     *@param Vector parsedDices
     **/ 
    public void setTvapar(Vector parsedDices)
    {
        pResult.setTvapar(parsedDices);
    }
    /**
     *S�tter resultatet av trissen
     *@param Vector parsedDices
     **/ 
    public void setTriss(Vector parsedDices)
    {
        pResult.setTriss(parsedDices);
    }
    /**
     *S�tter resultatet av fyrtalet
     *@param Vector parsedDices
     **/ 
    public void setFyrtal(Vector parsedDices)
    {
        pResult.setFyrtal(parsedDices);
    }
    /**
     *S�tter resultatet av k�ken
     *@param Vector parsedDices
     **/ 
    public void setKak(Vector parsedDices)
    {
        pResult.setKak(parsedDices);
    }
    /**
     *S�tter resultatet av lillan
     *@param Vector parsedDices
     **/ 
    public void setLitenStege(Vector parsedDices)
    {
        pResult.setLitenStege(parsedDices);
    }
    /**
    *S�tter resultatet av storan
    *@param Vector parsedDices
    **/ 
    public void setStorStege(Vector parsedDices)
    {
        pResult.setStorStege(parsedDices);
    }
    /**
    *S�tter resultatet av chansen
    *@param Vector parsedDices
    **/ 
    public void setChans(Vector parsedDices)
    {
        pResult.setChans(parsedDices);
    }
    /**
     *S�tter resultatet av yatzyn
     *@param Vector parsedDices
     **/ 
    public void setYatzy(Vector parsedDices)
    {
        pResult.setYatzy(parsedDices);
    }
    
    /**
     *H�mtar resultatet av ettor
     **/     
    public int getEttor()
    {
        return pResult.getEttor();
    }
    
    /**
     *H�mtar resultatet av tv�orna
     **/
    public int getTvaor()
    {
        return pResult.getTvaor();
    }
    
    /**
     *H�mtar resultatet av treorna
     **/
    public int getTreor()
    {
        return pResult.getTreor();
    }
    
    /**
     *H�mtar resultatet av fyrorna
     **/
    public int getFyror()
    {
        return pResult.getFyror();
    }
    
    /**
     *H�mtar resultatet av femmorna
     **/
    public int getFemmor()
    {
        return pResult.getFemmor();
    }
    
    /**
     *H�mtar resultatet av sexorna
     **/
    public int getSexor()
    {
        return pResult.getSexor();
    }
    
    /**
     *H�mtar resultatet av paret
     **/
    public int getPar()
    {
        return pResult.getPar();
    }
    
    /**
     *H�mtar resultatet av tv�paret
     **/
    public int getTvapar()
    {
        return pResult.getTvapar();
    }
    
    /**
     *H�mtar resultatet av trissen
     **/
    public int getTriss()
    {
        return pResult.getTriss();
    }
    
    /**
     *H�mtar resultatet av fyrtalet
     **/
    public int getFyrtal()
    {
        return pResult.getFyrtal();
    }
    
    /**
     *H�mtar resultatet av k�ken
     **/
    public int getKak()
    {
        return pResult.getKak();
    }
    
    /**
     *H�mtar resultatet av lillan
     **/
    public int getLitenStege()
    {
        return pResult.getLitenStege();
    }
    
    /**
     *H�mtar resultatet av storan
     **/
    public int getStorStege()
    {
        return pResult.getStorStege();
    }
    
    /**
     *H�mtar resultatet av Chansen
     **/
    public int getChans()
    {
        return pResult.getChans();
    }
    
    /**
     *H�mtar resultatet av Yatzyn
     **/
    public int getYatzy()
    {
        return pResult.getYatzy();
    }
}