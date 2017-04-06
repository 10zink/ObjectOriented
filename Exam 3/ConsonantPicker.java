import java.util.*;

public class ConsonantPicker implements IWordPicker
{
    @Override
    public boolean approveWord(String word)
    {
       char[] array = word.toCharArray();
       int count = 0;
       
       for(char c : array)
       {
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y')
        {
            count ++;
        }
       }
       
       if(count >= ((word.length()/3) * 2))
       {
           return true;
       }
       else 
       {
           return false;
       }
    }
}