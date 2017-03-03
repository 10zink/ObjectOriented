import java.util.*;

public class Decision implements IDecision
{
    private String m_question;
    private IDecision m_yes;
    private IDecision m_no;
    private String m_yesTerminal;
    private String m_noTerminal;
    
    
    public void setYes(IDecision yes)
    {
        m_yes = yes;
    }
    
    public void setNo(IDecision no)
    {
        m_no = no;
    }
    
    public void setYesTerminal(String terminal)
    {
        m_yesTerminal = terminal;
    }
    
    public void setNoTerminal(String terminal)
    {
        m_noTerminal = terminal;
    }
    
    public Decision(String question)
    {
        m_question = question;
    }
 
    public IDecision ask()
    {
    // ask the user the current question...

	// if the user answers yes 
	// and there is a decision object set for a yes answer
	// return the yes decision object
	// otherwise print the yes terminal string and return null

	// if the user answers no 
	// and there is a decision object set for a no answer
	// return the no decision object
	// otherwise print the no terminal string and return null
	    
	    //prints initial Question
	    System.out.println(m_question);
        Scanner userInput = new Scanner(System.in);
        String check = userInput.next();
        
        //if statements to work with builder. 
        if(check.equals("y") && m_yes != null)
        {
            return m_yes;
        }else if(check.equals("n") && m_no != null)
        {
            return m_no;
        }
        else if(check.equals("y") && m_yes == null)
        {
            System.out.println(m_yesTerminal);
            return null;
        }
        else if(check.equals("n") && m_no == null)
        {
            System.out.println(m_noTerminal);
            return null;
        }
        else
            return null;

    }
    
    
    
}

    