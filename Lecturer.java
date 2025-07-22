public class Lecturer extends Teacher//creating subclass of teacher called lecture class
{
    private String department;
    private int yearsofexperience;
    private int gradedscore;
    private boolean hasgraded;
    //a constructor is created accepting seven parameters
    public Lecturer(int teacher$id,String teacher$name,String address,String working$type,String employment$status,String department,int yearsofexperience,int working$hours)
    {
        //super keyword is used to call the methods of parent class
        super( teacher$id, teacher$name,address, working$type, employment$status);
        this.department=department;
        this.yearsofexperience=yearsofexperience;
        this.gradedscore=0;
        setWorking$hours( working$hours);//a setter method is created
        this.hasgraded=false;
        
    }
    //a getter method is created
    public String getDepartment()
    {
        return this.department;//returns department
    }
    public int getYearsofexperience()
    {
        return this.yearsofexperience;//returns yearofexperience
    }
    public int getGradedscore()
    {
        return this.gradedscore;//returns gradedscore
    }
    public boolean getHasgraded()
    {
        return this.hasgraded;//returns hasgraded
    }
    //a setter method is created
    public void setGradedscore(int gradedscore)
    {
        this.gradedscore=gradedscore;//assign gradedscore
    }
    //a method gradessignmnet is created
    public void Gradeassignment(int gradedscore,String department,int yearsofexperience)
    {
        if(yearsofexperience>=5 && this.department .equals(department))
        {
            if(gradedscore>=70)
            {
               System.out.println("The grade is A");
            }
            else if(gradedscore>=60 && gradedscore<70)
            {
               System.out.println("The grade is B");
            }
            else if(gradedscore>=50 && gradedscore<60)
            {
                System.out.println("The grade is C");
            }
            else if(gradedscore>=40 && gradedscore<50)
            {
                System.out.println("The grade is D");
            }
            else 
            {
                System.out.println("The grade is E");
            }
            hasgraded=true;
            this.gradedscore=gradedscore;
        }
        else
        {
            System.out.println("The mark has not graded yet. ");
        }
    }
    //a display method is created
    public void display()
    {
      //super keyword is used to call the methods of parent class
      super.display();
      
        if(hasgraded==true)
        {
            System.out.println("Lecturer gradedscore is" +gradedscore);
            System.out.println("Lecturer department is"+department);
            System.out.println("Lecturer yearsofexperience is"+ yearsofexperience); 
        }
        else
        {
            System.out.println("The mark is not graded yet.");
        }
    }
}
    
