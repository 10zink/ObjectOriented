import java.util.*;

public class DiffCalculator
{
    private List <IDiffAlg> m_diffAlgs;
    
  
     
    public static void main(String[] args)throws IOException
    {
        File text = new File("Sequences.txt");
      
        //Creating Scanner instnace to read File in Java
        Scanner scnr = new Scanner(text);
        Scanner inSS = null;
      
        //Reading each line of file using Scanner class
        int lineNumber = 1;
        while(scnr.hasNextLine())
        {
            String line = scnr.nextLine();
            
            if(line.contains(","))
                    {
                        userinput = line.replace(",","\n");
                        inSS = new Scanner (userinput);
                        firsthalf = inSS.nextLine();
                        secondhalf= inSS.nextLine();
                        
                        
            lineNumber++;
                    }
        }
        

        
        
        
    }
    
}