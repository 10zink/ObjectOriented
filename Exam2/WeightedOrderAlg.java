
public class WeightedOrderAlg extends AbstractOrderAlg
{
    private static WeightedOrderAlg m_instance;
    public static WeightedOrderAlg getInstance()
    {
        if (m_instance == null)
            m_instance = new WeightedOrderAlg();
        return m_instance;
    }
    private WeightedOrderAlg() {};
    
    protected int getPenalty(char ch1)
    {
        
    }
}