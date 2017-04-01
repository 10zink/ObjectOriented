import java.util.*;

public class VowelMash implements ICrypto
{
    private static VowelMash m_instance;
    
    public static VowelMash getInstance()
    {
        if (m_instance == null)
            m_instance = new VowelMash();
        
        return m_instance;
    }
    
    private VowelMash() {};

    
    @Override
    public String encrypt(String message)
    {
        int l = Factory.getInstance().createParser(message).getCharCount();
        String newString = "";
      
        
        for(int i =0; i < l; i++)
        {
            char c = Factory.getInstance().createParser(message).getChar(i);
            
            if(c == 'A')
            {
                c = 'E';
            }
            else if(c == 'E')
            {
                c = 'I';
            }
            else if(c == 'I')
            {
                c = 'O';
            }
            else if(c == 'O')
            {
                c = 'U';
            }
            else if(c == 'U')
            {
                c = 'A';
            }
            
            newString += c;
           
        }
        return newString;
    }
    
    @Override
    public String decrypt(String message)
    {
        int l = Factory.getInstance().createParser(message).getCharCount();
        String newString = "";
      
        
        for(int i =0; i < l; i++)
        {
            char c = Factory.getInstance().createParser(message).getChar(i);
            
            if(c == 'E')
            {
                c = 'A';
            }
            else if(c == 'I')
            {
                c = 'E';
            }
            else if(c == 'O')
            {
                c = 'I';
            }
            else if(c == 'U')
            {
                c = 'O';
            }
            else if(c == 'A')
            {
                c = 'U';
            }
            
            newString += c;
           
        }
        return newString;
    }
    
}