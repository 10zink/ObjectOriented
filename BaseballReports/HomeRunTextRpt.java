import java.util.*;
import java.io.*;

public class HomeRunTextRpt
{
    protected String m_dataFile; // read
    protected String m_reportFile; //write
    
    
    public HomeRunTextRpt(String dataFile, String reportFile)
    {
        m_dataFile = dataFile;
        m_reportFile = reportFile;
    
    }
    
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
                    {dp = new DataPair(lines[0],0);} //set the defualt value at 0
                else
                    {dp = new DataPair(lines[0],Integer.parseInt(lines[1]));}
                
                data.add(dp);
			 
            }
        } catch (IOException e) {
			e.printStackTrace();
        }
        
        return data;
    }
    
    public void generateReport(List<DataPair> data) throws IOException
    {
        FileWriter fw = new FileWriter(new File(m_reportFile));
        
        
        try(BufferedWriter bw = new BufferedWriter(fw)){
            
            for(DataPair i : data){
                
                
                int numberOfSpaces = 30;
               
               //using string.format and \t (tabs) to get the alignment
                bw.write(String.format("%-20s \t\t %-10s \n", i.getName(), i.getStat()));
              
            }
            
        } catch (IOException e) {
			e.printStackTrace();
        }
        
        
    }
}
    
    
