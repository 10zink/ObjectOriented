import java.util.*;
import java.io.*;

//This connects with RBIHTMLRptA

public class RBITextRpt extends HomeRunTextRpt{

    public RBITextRpt(String dataFile, String reportFile)
    {
        super(dataFile,reportFile);
    }
    
    
    @Override
    public List<DataPair> loadData() throws IOException 
    {
        List<DataPair> data = new ArrayList<DataPair>();

        FileReader fr = new FileReader(new File(m_dataFile));
        
        
        try(BufferedReader br = new BufferedReader(fr))
        {
            String sCurrentLine;
            DataPair dp;
            
            while ((sCurrentLine = br.readLine()) != null) 
            {
                //This splits the two line inputs
                String[] lines = sCurrentLine.split(",");
                
                if(lines.length != 3)
                    {dp = new DataPair(lines[0],0);} //set the default value at 0
                else
                    {dp = new DataPair(lines[0],Integer.parseInt(lines[2]));}
                
                data.add(dp);
			 
            }
        } catch (IOException e) {
			e.printStackTrace();
        }
        
        return data;
    }
}

