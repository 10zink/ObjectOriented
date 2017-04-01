
public class CountAlg implements IDiffAlg
{
    private static CountAlg m_instance;
    public static CountAlg getInstance()
    {
        if (m_instance == null)
            m_instance = new CountAlg;
        return m_instance;
    }
    private CountAlg() {};
    
    
    
    public int difference(String seq1, String seq2)
    {
        
    }
    
}