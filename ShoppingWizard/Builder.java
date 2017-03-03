public class Builder
{
    private static Builder m_instance;
    
    public static Builder getInstance()
    {
        if (m_instance == null)
        {
            m_instance = new Builder();
            return m_instance;
            
        }else{
            
            return m_instance;
        }
    }
    
    private Builder() {};
    
  
    public IDecision buildWizard()
    {
        //snowboard
        IDecision questionOne = new Decision("Do you want to buy a snowboard?");
        
        IDecision questionTwo = new Decision("Have you snowboarded before?");
      
        IDecision questionThree = new Decision("Are you an expert?");

        IDecision questionFour = new Decision("Do you like to go fast?");
        
        
        //Skis
        IDecision questionFive = new Decision("Do you want to buy downhill skis?");

        IDecision questionSix = new Decision("Have you gone skiing before?");
       
        IDecision questionSeven = new Decision("Are you an expert?");
    
        IDecision questionEight = new Decision("Do you like to jump?");
      
       
       
        //Snowboard set methods:
        questionOne.setYes(questionTwo);
        questionOne.setNo(questionFive);
     
        questionTwo.setYes(questionThree);
        questionTwo.setNoTerminal("Buy the XG100 model.");
        
        questionThree.setYes(questionFour);
        questionThree.setNoTerminal("Buy the XG200 model.");
        
        questionFour.setYesTerminal("Buy the XG300 model.");
        questionFour.setNoTerminal("Buy the XG200 model.");
        
        
        //Ski set methods:
        questionFive.setYes(questionSix);
        questionFive.setNoTerminal("Recomand you try skiing.");
        
        questionSix.setYes(questionSeven);
        questionSix.setNoTerminal("Buy the ZR100 model.");
        
        questionSeven.setYes(questionEight);
        questionSeven.setNoTerminal("Buy the ZR200 model.");
        
        questionEight.setYesTerminal("Buy the ZR300 model.");
        questionEight.setNoTerminal("Buy the ZR200 model. ");
        
        
        return questionOne;
    }
      
        
        
}
    
    