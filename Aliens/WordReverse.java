import java.util.*;

public class WordReverse implements ICrypto
{
    private static WordReverse m_instance;
    
    public static WordReverse getInstance()
    {
        if (m_instance == null)
            m_instance = new WordReverse();
        
        return m_instance;
    }
    
    private WordReverse() {};
    
    @Override
    public String encrypt(String message)
    {
        String[] ary = message.split(" ");
        String newMsg = "";
        
        for(String w: ary)
        {
            String test = new StringBuilder(w).reverse().toString();
            newMsg += test;
            newMsg += " ";
        }
        return newMsg;
    }
    
    @Override
    public String decrypt(String message)
    {
        String[] ary = message.split(" ");
        String newMsg = "";
        
        for(String w: ary)
        {
            String test = new StringBuilder(w).reverse().toString();
            newMsg += test;
            newMsg += " ";
        }
        return newMsg;
    }
    
}