public class Mean implements IGrader
{
    protected IFilter m_grades;
    protected int[] m_filter;
    
    public Mean(int[] grades,IFilter filter)
    {
        m_grades = grades;
        m_filter = filter;
        
    }
    
    @Override
    public double grade()
    {
        return average();
    }
    
    protected double average()
    {
        double sum = 0.0;
        for (int i : m_grades)
            sum += i;
        return sum/m_grades.length;
    }
}