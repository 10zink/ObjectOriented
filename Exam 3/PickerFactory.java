import java.util.Random;

public class PickerFactory
{
    private static PickerFactory m_instance;
    public static PickerFactory getInstance()
    {
        if (m_instance == null)
            m_instance = new PickerFactory();
        return m_instance;
    }
    
    private PickerFactory() {}
    
    public IWordPicker makePicker()
    {
        Random num =  new Random();
        int x = num.nextInt(2)+1;
        if(x == 1)
        { 
            return new LengthPicker();
        }
        else
        {
            return new ConsonantPicker();
        }
    }



}