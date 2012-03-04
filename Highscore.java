import java.util.*;
import java.io.*;

public class Highscore
{
    private Vector results = new Vector(10);
 
    public Highscore()
    {
        
    }

    /**
     *Sets the new score
     *@param String parsedName
     *@param String parsedResult
     **/    
    public void setScore(String parsedName, String parsedResult)
    {
        Vector results = new Vector(10);
        int resSet = 0;
        
        String name = parsedName;
        String result = parsedResult;
        PrintWriter oStream = null;
        
        
        try
        {
            BufferedReader iStream = new BufferedReader(new FileReader("highscore"));
            
            for(int i = 0;i < 10; i++) //SLLUUURRRRP!!!!
            {
                results.add(iStream.readLine());
            }
            for(int i = 0;i<10;i++)
            {
                String tmpS = (String)results.get(i);
                StringTokenizer st = new StringTokenizer(tmpS, "#");
                String tmp1 = st.nextToken();
                String tmp2 = st.nextToken();
                
                if(Integer.parseInt(tmp2) < Integer.parseInt(result) && resSet == 0)
                {
                    String fRes = name + "#" + result;
                    results.add(i,fRes);
                    resSet = 1;
                }
            }
            iStream.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        
        try
        {
            oStream = new PrintWriter(new FileOutputStream("highscore"));
            
            for(int i = 0;i < 10; i++)
            {
                oStream.println(results.get(i));
            }
            
            oStream.close();
            
        }
        
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    /**
     *Shows the score
     **/
    public Vector showScore()
    {
        Vector results = new Vector(10);
        try
        {
            BufferedReader iStream = new BufferedReader(new FileReader("highscore"));
            
            for(int i = 0;i < 10; i++) //SLLUUURRRRP!!!!
            {
                results.add(iStream.readLine());
            }
            iStream.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return results;
    }
}