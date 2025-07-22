 public class Tutor extends Teacher//a subclass of teacher is created
{
    //a constructor is created accepting five attributes
    private double salary;
    private String specialization;
    private String academic$qualifications;
    private int performance$index;
    private boolean iscertified;
    //a constructor is made with ten parameters
    public Tutor(int teacher$id,String teacher$name,String address,String working$type,String employment$status,int working$hours,double salary,String specialization,String academic$qualifications,int performance$index)
    {
        super( teacher$id, teacher$name,address,working$type, employment$status);
        setWorking$hours( working$hours);
        this.salary=salary;
        this.specialization=specialization;
        this.academic$qualifications=academic$qualifications;
        this.performance$index=performance$index;
        iscertified=false;
        
    }
    //making getter method for salary
    public double getSalary() 
    {
        return this.salary;//returns salary
    }
    public String getSpecialization()
    {
        return this.specialization;//returns specialization
    }
    public String getAcademic$qualifications()
    {
        return this.academic$qualifications;//returns academic qualifications
    }
    public int getPerformance$index()
    {
        return this.performance$index;//returns performance index
    }
    public boolean getIscertified()
    {
        return this.iscertified;//returns iscertified
    }
    //setter method is created for salary
    public void setSalary(double salary,int performance$index)
    {
        if(performance$index>5 && getWorking$hours()>20)
        {
            if(performance$index>=5 && performance$index<=7)
            {
               this.salary=salary+(0.05d*salary); 
            }
            else if(performance$index>=8 && performance$index<=9)
            {
               this.salary=salary+(0.1d*salary); 
            }
            else
            {
                this.salary=salary+(0.2d*salary);  
            }
            this.iscertified=true;
        }
        else
        {
            System.out.println("The salary is not approved.");
        }
    }
    // a method is created as remove tutor
    public void removeTutor()
    {
        if(iscertified==false)
        {
            this.salary=0;
            this.specialization=null;
            this.academic$qualifications=null;
            this.performance$index=0;
            this.iscertified=false;
            System.out.println("The tutor is not certified So SuccessFully removed.");
        }
        else
        {
           System.out.println("The tutor has  been certified .");
        }
    }
    //a method display is created
    public void display()
    {
        if(iscertified==false)
        {
         super.display();   
        }
        else
        {
          super.display();
          System.out.println("the salary of the tutor is" +salary);
          System.out.println("the specialization of the tutor is" +specialization);
          System.out.println("the academic$qualifications of the tutor is" +academic$qualifications);
          System.out.println("the performance$index of the tutor is" +performance$index);
        }
        
    }
}

