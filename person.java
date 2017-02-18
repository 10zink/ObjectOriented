public class Person
{
    
    //State 
    private String m_name;
    private int m_age;
    private Dog m_dog;//the has-a
    
    //behavior
    public Person(String name, int age, String dogName) //constructor
    {
        m_name = name;
        m_age = age;
        m_dog = new Dog(dogName); //set the dog to new dog, with dogName
    }
    
    public String getName() 
    {
        return m_name;
    }
    
    //what?
    public void getOlder()  //get older
    //how?
    { m_age = m_age + 1;} // This line
    
    public int getAge()
    { return m_age; }
    
    public Dog getDog()
    { return m_dog; }
    
}