public class Teacher
{
    private String teacher$name;
    private String address;
    private String working$type;
    private String employment$status;
    private int teacher$id;
    private int working$hours;
    //a constructor is created which accepts 5 parameters
    public Teacher(int teacher$id,String teacher$name,String address,String working$type,String employment$status)
    {
        this.teacher$name=teacher$name;
        this.address=address;
        this.working$type=working$type;
        this.employment$status=employment$status;
        this.teacher$id=teacher$id;
    }
    //a getter method is created 
    public int getTeacher$id()
    {
        return this.teacher$id;//returns teacherid
    }
    public String getTeacher$name()
    {
        return this.teacher$name;//returns teachername
        
    }
    public String getAddress()
    {
        return this.address;//returns address
    }
    public String getEmployment$status()
    {
        return this.employment$status;//returns employmentstatus
    }
    public String getWorking$type()
    {
        return this.working$type;//returns workingtype
    }
    public int getWorking$hours()
    {
        return this.working$hours;//returns workinghours
    }
    //a setter method is created 
    public void setWorking$hours(int working$hours)
    {
        this.working$hours=working$hours;//assign workinghours
    }
    //a display method is created
    public void display()
    {
        System.out.println("the id of the teacher is="+teacher$id);//teacherid is printed
        System.out.println("the name of the teacher is="+teacher$name);//teachername is printed
        System.out.println("the address of the teacher is="+address);//address is printed
        System.out.println("the working$type of the teacher is="+working$type);//workingtype is printed
        System.out.println("the employment$status of the teacher is="+employment$status);//working status is printed
        if(working$hours ==0)
        
        {
          System.out.println("working$hours is not assigned");
        }
    
        
    }
    
}