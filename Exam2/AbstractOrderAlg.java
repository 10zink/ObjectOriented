
public abstract class AbstractOrderAlg implements IDiffAlg
{
    private String m_seq1;
    private String m_seq2;
    
    
    public int difference(String seq1, String seq2)
    {
        int  diff = 0;
        for (int i = 0; i < seq1.length(); i++)
        {
            char c = seq1.charAt(i); 
            char d = seq2.charAt(i);
        
            if(c != d)
            {
                diff = diff + 1;
            }
            else{diff = diff;}
        }
        
        return diff;
        
    }
    
    abstract protected int getPenalty(char ch1)
    {
        
        
        
        
        
        
        return getPenalty;
    }
    
}