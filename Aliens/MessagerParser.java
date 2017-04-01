import java.util.*;

public class MessagerParser implements IMessagerParser
{
    private List<String> m_words;
    private String m_msg="";
    private char[] m_chars;
    
    
    
    public MessagerParser(String msg)
    {
        m_msg = msg;
        m_chars = msg.toCharArray();
        m_words = Arrays.asList(msg.split("\\s*,\\s*"));
    }
    
    @Override
    public int getCharCount()
    {
        return m_chars.length;
    }
    
    @Override
    public int getWordCount()
    {
        return m_words.size();
    }
    
    @Override
    public char getChar(int i)
    {
        return m_chars[i];
    }
    
    @Override
    public String getWord(int i)
    {
        return m_words.get(i);
    }
    
}