import java.util.*;
import java.io.*;


//This connects with RBIHTMLRPTB

public class HomeRunHTMLRpt extends HomeRunTextRpt
{
    public HomeRunHTMLRpt(String dataFile, String reportFile)
    {
        super(dataFile, reportFile);
    }
    
    
    @Override 
    public void generateReport(List<DataPair> data) throws IOException 
    {
        FileWriter fw = new FileWriter(new File(m_reportFile));
        
        try(BufferedWriter bw = new BufferedWriter(fw)){
            
            //Creating the html tags before the data
            bw.write("<html>\n<body>\n<table>\n");
            
            for(DataPair i : data)
            {
                bw.write("<tr><td>" + i.getName() + "</td><td>" + i.getStat() + "</td></tr> \n");
              
            }
            
            //creating the closing tags
            bw.write("</table>\n</body>\n</html>");
            
        } catch (IOException e) {
			e.printStackTrace();
        }
    }
    
    
}