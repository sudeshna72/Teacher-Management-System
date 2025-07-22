import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JOptionPane;
import java.awt.Color;

public class TeacherGUI extends JFrame implements ActionListener
{
    JFrame frame1;
    JLabel teacherIdLabel,teacherNameLabel,addressLabel,workingTypeLabel,employmentStatusLabel,workingHoursLabel,departmentLabel,yearsOfExperienceLabel,gradedScoreLabel;
    JLabel teacherIdLabel2,teacherNameLabel2,addressLabel2,workingTypeLabel2,employmentStatusLabel2,workingHoursLabel2,salaryLabel,specializationLabel,academicQualificationsLabel,performanceIndexLabel;
    
    JTextField teacherIdField,teacherNameField,addressField,workingTypeField,employmentStatusField,departmentField,yearsOfExperienceField,workingHoursField,gradedScoreField;
    JTextField teacherIdField2,teacherNameField2,addressField2,workingTypeField2,employmentStatusField2,workingHoursField2,salaryField,specializationField,academicQualificationsField,performanceIndexField;
    
    JButton lecturerButton,gradeButton,displayButton,clearButton,displayButton1,clearButton1,tutorButton,setSalaryButton,removeTutorButton;
    ArrayList<Teacher> al1;
    public TeacherGUI() 
    {
        al1=new ArrayList<Teacher>();
        // Create the JTabbedPane
        JTabbedPane tabbedPane = new JTabbedPane();
        

        // Create the Lecturer tab
        JPanel lecturerPanel = new JPanel();
        lecturerPanel.setBackground(new Color(230, 156, 147));
        teacherIdLabel = new JLabel("Teacher ID:");
        teacherNameLabel = new JLabel("Teacher Name:");
        addressLabel = new JLabel("Address:");
        workingTypeLabel = new JLabel("Working Type:");
        employmentStatusLabel = new JLabel("Employment Status:");
        workingHoursLabel = new JLabel("Working Hours:");
        departmentLabel = new JLabel("Department:");
        yearsOfExperienceLabel = new JLabel("Years of Experience:");
        gradedScoreLabel=new JLabel("Graded Score:");
        
        // Create the Tutor tab
        JPanel tutorPanel = new JPanel();
        tutorPanel.setBackground(new Color( 158, 220, 202 ));
        teacherIdLabel2 = new JLabel("Teacher ID:");
        JLabel teacherNameLabel2 = new JLabel("Teacher Name:");
        JLabel addressLabel2 = new JLabel("Address:");
        JLabel workingTypeLabel2 = new JLabel("Working Type:");
        JLabel employmentStatusLabel2 = new JLabel("Employment Status:");
        JLabel workingHoursLabel2 = new JLabel("Working Hours:");
        JLabel salaryLabel = new JLabel("Salary:");
        JLabel specializationLabel = new JLabel("Specialization:");
        JLabel academicQualificationsLabel = new JLabel("Academic Qualifications:");
        JLabel performanceIndexLabel = new JLabel("Performance Index:");
        
        
        //declaring JButtons for lecturer
        lecturerButton = new JButton("Lecturer");
        gradeButton = new JButton("Grade");
        displayButton = new JButton("Display");
        clearButton = new JButton("Clear");
        
        //declaring JButtons for tutor
        tutorButton = new JButton("Tutor");
        setSalaryButton = new JButton("Set Salary");
        removeTutorButton = new JButton("Remove Tutor");
        displayButton1=new JButton("Display");
        clearButton1 = new JButton("Clear");
        
        
        
        
        
        //declaring textfields for lecturer tab
        teacherIdField = new JTextField();
        teacherNameField = new JTextField();
        addressField = new JTextField();
        workingTypeField = new JTextField();
        employmentStatusField = new JTextField();
        workingHoursField = new JTextField();
        departmentField = new JTextField();
        yearsOfExperienceField = new JTextField();
        gradedScoreField=new JTextField();
         
        //declaring textfields for tutor tab
        teacherIdField2 = new JTextField();
        teacherNameField2 = new JTextField();
        addressField2 = new JTextField();
        workingTypeField2 = new JTextField();
        employmentStatusField2 = new JTextField();
        workingHoursField2 = new JTextField();
        salaryField = new JTextField();
        specializationField = new JTextField();
        academicQualificationsField = new JTextField();
        performanceIndexField = new JTextField();
        
        
        
        
        //setting setBounds for textfields of lecturer
        teacherIdField.setBounds(140, 10, 150, 25);
        teacherNameField.setBounds(140, 40, 150, 25);
        addressField.setBounds(140, 70, 150, 25);
        workingTypeField.setBounds(140, 100, 150, 25);
        employmentStatusField.setBounds(140, 130, 150, 25);
        workingHoursField.setBounds(140, 160, 150, 25);
        departmentField.setBounds(140, 190, 150, 25);
        yearsOfExperienceField.setBounds(140, 220, 150, 25);
        gradedScoreField.setBounds(140,250,150,25);
        
        
        //setting setbounds for textfields of tutor
        teacherIdField2.setBounds(160, 10, 150, 25);
        teacherNameField2.setBounds(160, 40, 150, 25);
        addressField2.setBounds(160, 70, 150, 25);
        workingTypeField2.setBounds(160, 100, 150, 25);
        employmentStatusField2.setBounds(160, 130, 150, 25);
        workingHoursField2.setBounds(160, 160, 150, 25);
        salaryField.setBounds(160, 190, 150, 25);
        specializationField.setBounds(160, 220, 150, 25);
        academicQualificationsField.setBounds(160, 250, 150, 25);
        performanceIndexField.setBounds(160, 280, 150, 25);
        
    
        //setting setbounds for JLabels of lecturer
        teacherIdLabel.setBounds(10, 10, 100, 25);
        teacherNameLabel.setBounds(10, 45, 100, 25);
        addressLabel.setBounds(10, 70, 100, 25);
        workingTypeLabel.setBounds(10, 100, 100, 25);
        employmentStatusLabel.setBounds(10, 130, 120, 25);
        workingHoursLabel.setBounds(10, 160, 100, 25);
        departmentLabel.setBounds(10, 190, 100, 25);
        yearsOfExperienceLabel.setBounds(10, 220, 130, 25);
        gradedScoreLabel.setBounds(10,250,100,25);
        
        
        //setting SetBounds fro JLabels of tutor
        teacherIdLabel2.setBounds(10, 10, 100, 25);
        teacherNameLabel2.setBounds(10, 40, 100, 25);
        addressLabel2.setBounds(10, 70, 100, 25);
        workingTypeLabel2.setBounds(10, 100, 100, 25);
        employmentStatusLabel2.setBounds(10, 130, 120, 25);
        workingHoursLabel2.setBounds(10, 160, 100, 25);
        salaryLabel.setBounds(10, 190, 100, 25);
        specializationLabel.setBounds(10, 220, 100, 25);
        academicQualificationsLabel.setBounds(10, 250, 150, 25);
        performanceIndexLabel.setBounds(10, 280, 120, 25);

        
        //setting setbounds for buttons of lecturer
        lecturerButton.setBounds(10, 320, 100, 25);
        gradeButton.setBounds(120, 290, 100, 25);
        displayButton.setBounds(230, 320, 100, 25);
        clearButton.setBounds(340, 290, 90, 25);
        
        //setting setBounds for buttons of tutor
        tutorButton.setBounds(20, 320, 100, 25);
        setSalaryButton.setBounds(150, 330, 100, 25);
        removeTutorButton.setBounds(280, 320, 120, 25);
        displayButton1.setBounds(200,360,100,25);
        clearButton1.setBounds(100,360,100,25);
        
        
        //adding labels to lecturerpanel
        lecturerPanel.add(teacherIdLabel);
        lecturerPanel.add(teacherNameLabel);
        lecturerPanel.add(addressLabel);
        lecturerPanel.add(workingTypeLabel);
        lecturerPanel.add(employmentStatusLabel);
        lecturerPanel.add(workingHoursLabel);
        lecturerPanel.add(departmentLabel);
        lecturerPanel.add(yearsOfExperienceLabel);
        lecturerPanel.add(gradedScoreLabel);
        
        //adding labels to tutor panel
        tutorPanel.add(teacherIdLabel2);
        tutorPanel.add(teacherNameLabel2);
        tutorPanel.add(addressLabel2);
        tutorPanel.add(workingTypeLabel2);
        tutorPanel.add(employmentStatusLabel2);
        tutorPanel.add(salaryLabel);
        tutorPanel.add(workingHoursLabel2);
        tutorPanel.add(specializationLabel);
        tutorPanel.add(academicQualificationsLabel);
        tutorPanel.add(performanceIndexLabel);
        
        //adding textfields to lecturerpanel
        lecturerPanel.add(teacherIdField);
        lecturerPanel.add(teacherNameField);
        lecturerPanel.add(addressField);
        lecturerPanel.add(workingTypeField);
        lecturerPanel.add(employmentStatusField);
        lecturerPanel.add(workingHoursField);
        lecturerPanel.add(departmentField);
        lecturerPanel.add(yearsOfExperienceField);
        lecturerPanel.add(gradedScoreField);
        
        //adding textfields to tutor panel
        tutorPanel.add(teacherIdField2);
        tutorPanel.add(teacherNameField2);
        tutorPanel.add(addressField2);
        tutorPanel.add(workingTypeField2);
        tutorPanel.add(employmentStatusField2);
        tutorPanel.add(workingHoursField2);
        tutorPanel.add(salaryField);
        tutorPanel.add(specializationField);
        tutorPanel.add(academicQualificationsField);
        tutorPanel.add(performanceIndexField);
        
        //adding buttons for lecturer panel
        lecturerPanel.add(lecturerButton);
        lecturerPanel.add(gradeButton);
        lecturerPanel.add(displayButton);
        lecturerPanel.add(clearButton);
        tabbedPane.addTab("Lecturer", lecturerPanel);
        
        //adding buttons for tutor panel
        tutorPanel.add(tutorButton);
        tutorPanel.add(setSalaryButton);
        tutorPanel.add(removeTutorButton);
        tutorPanel.add(displayButton1);
        tutorPanel.add(clearButton1);
        tabbedPane.addTab("Tutor", tutorPanel);
        add(tabbedPane);//adding JTabbedpane to Jframe
        
        lecturerButton.addActionListener(this);
        tutorButton.addActionListener(this);
        gradeButton.addActionListener(this);
        setSalaryButton.addActionListener(this);
        removeTutorButton.addActionListener(this);
        displayButton.addActionListener(this);
        clearButton.addActionListener(this);
        clearButton1.addActionListener(this);
        displayButton1.addActionListener(this);
        
        
        tutorPanel.setLayout(null);
        lecturerPanel.setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,500);

    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==lecturerButton)//creating Lecture Button
        {
            //checking whther the testfields are empty or not
            if(teacherIdField.getText().isEmpty()||teacherNameField.getText().isEmpty()||addressField.getText().isEmpty()||workingTypeField.getText().isEmpty()||employmentStatusField.getText().isEmpty()||workingHoursField.getText().isEmpty()||departmentField.getText().isEmpty()||yearsOfExperienceField.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(frame1,"Empty TextField Found","Error Please fill up the given Info",JOptionPane.WARNING_MESSAGE);
            }
            else
            {
                try
                {
                    int teacherId = Integer.parseInt(teacherIdField.getText());
                    String teacherName = teacherNameField.getText();
                    String address = addressField.getText();
                    String workingType = workingTypeField.getText();
                    String employmentStatus = employmentStatusField.getText();
                    int workingHours  =Integer.parseInt(workingHoursField.getText());
                    String department= departmentField.getText();
                    int yearsOfExperience = Integer.parseInt(yearsOfExperienceField.getText());
                    Lecturer lecturerobj= new Lecturer(teacherId,teacherName, address,workingType,employmentStatus,department,yearsOfExperience ,workingHours);
                    if(al1.isEmpty())
                    {
                        al1.add(lecturerobj);
                        JOptionPane.showMessageDialog(frame1,"Lecturer is added.");
                    }
                    else
                    {
                        boolean add= true;
                        for (Teacher Tobj:al1)
                        {
                            if(Tobj instanceof Lecturer)
                            {
                                if(teacherId==Tobj.getTeacher$id())
                                {
                                    JOptionPane.showMessageDialog(frame1,"This id has already been used.");
                                    add = false;
                                    break;                            
                                }
                            }
                        }
                        if (add==true)
                        {
                            al1.add(lecturerobj);
                            JOptionPane.showMessageDialog(frame1,"The id is added.");
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(frame1,"Teacher id already exist.");
                        }
                    }
                }
                catch(NumberFormatException n)
                {
                    JOptionPane.showMessageDialog(frame1,"ERROR_MESSAGE","Invalid input format for numeric field.", JOptionPane.ERROR_MESSAGE);
                }
            }
        }   
        else if(e.getSource()==tutorButton)//creating tutor button
        {
            try{
                int teacherId = Integer.parseInt(teacherIdField2.getText());
                String teacherName = teacherNameField2.getText();
                String address = addressField2.getText();
                String workingType = workingTypeField2.getText();
                String employmentStatus = employmentStatusField2.getText();
                int workingHours  =Integer.parseInt(workingHoursField2.getText());
                double salary=Double.parseDouble(salaryField.getText());
                String specialization=specializationField.getText();
                String academicQualifications= academicQualificationsField.getText();
                int performanceIndex= Integer.parseInt(performanceIndexField.getText());
                Tutor Tutorobj= new Tutor(teacherId,teacherName, address,workingType,employmentStatus,workingHours,salary,specialization,academicQualifications,performanceIndex);
                if(al1.isEmpty())
                {
                    al1.add(Tutorobj);
                    JOptionPane.showMessageDialog(frame1,"Tutor is added.");
                }
                else
                {
                    boolean add= true;
                    for (Teacher Tobj:al1)
                    {
                        if(Tobj instanceof Tutor)
                        {
                            if(teacherId==Tobj.getTeacher$id())
                            {
                                add = false;
                                JOptionPane.showMessageDialog(frame1,"This id is already used.");
                                break;
                            }
                        }
                    }
                    if (add==true)
                    {
                        al1.add(Tutorobj);
                        JOptionPane.showMessageDialog(frame1,"Tutor is added.");//pop up feature
                    }
                }
            }
            catch(NumberFormatException n)
            {
                JOptionPane.showMessageDialog(frame1,"ERROR_MESSAGE","ERROR",JOptionPane.ERROR_MESSAGE);
            }
        }
        else if(e.getSource()==gradeButton)//creating grade button
        {
            if(teacherIdField.getText().isEmpty()||gradedScoreField.getText().isEmpty()||departmentField.getText().isEmpty()||yearsOfExperienceField.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(frame1,"Empty TextField Found","Error Please fill up the given Info",JOptionPane.WARNING_MESSAGE);
            }
            else
            {
                int teacherId=Integer.parseInt(teacherIdField.getText());
                String department= departmentField.getText();
                int yearsOfExperience = Integer.parseInt(yearsOfExperienceField.getText());
                int gradedScore=Integer.parseInt(gradedScoreField.getText());
                for(Teacher Tobj:al1)
                {
                    if(Tobj instanceof Lecturer)
                    {
                        if(teacherId== Tobj.getTeacher$id())
                        {
                            Lecturer L=(Lecturer)Tobj;
                            L.Gradeassignment(gradedScore,department,yearsOfExperience);
                            JOptionPane.showMessageDialog(frame1,"The assignment has been graded.");
                            break;
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null,"Teacher id is not a tutor.");
                        }
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"Teacher id is not found.");
                    }
                }
            }
        }
        
        else if(e.getSource()==setSalaryButton)//creating salary button
        {
            if(teacherIdField2.getText().isEmpty()||salaryField.getText().isEmpty()||performanceIndexField.getText().isEmpty())
            {
              JOptionPane.showMessageDialog(frame1,"Empty TextField Found","Error Please fill up the given Info",JOptionPane.WARNING_MESSAGE);
            }
            else
            {
                int teacherId2=Integer.parseInt(teacherIdField2.getText());
                double salary=Double.parseDouble(salaryField.getText());
                int performanceIndex=Integer.parseInt(performanceIndexField.getText());
                for (Teacher Tobj:al1)
                {
                    if( teacherId2==Tobj.getTeacher$id())
                    {
                        if(Tobj instanceof Tutor)
                        {
                            Tutor T=(Tutor)Tobj;
                            T.setSalary(salary,performanceIndex);
                            JOptionPane.showMessageDialog(frame1,"The  new salary has been assigned.");
                            break;
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null,"Teacher id is not a tutor.");
                        }
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"Teacher id is not found.");
                    }
                }
            }
        }   
        else if(e.getSource()==removeTutorButton)//creating removetutor button
        {
            int teacherId2=Integer.parseInt(teacherIdField2.getText());
            if(teacherId2==0)
            {
                JOptionPane.showMessageDialog(frame1,"Empty TextField Found","Error Please fill up the given Info",JOptionPane.WARNING_MESSAGE);
            }
            else
            {
                Teacher tutorToRemove = null;
                boolean teacherfound = false;
                for(Teacher Tobj:al1)
                {
                    if(Tobj.getTeacher$id()==teacherId2){
                        if(Tobj instanceof Tutor)
                        {
                            Tutor tutor=(Tutor) Tobj;
                            if(tutor.getIscertified())
                            {
                                JOptionPane.showMessageDialog(null,"Certified tutors cannot be removed.");
                                return;
                            }
                            else
                            {
                                tutorToRemove = tutor;
                                teacherfound = true;
                                break;
                            }
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null,"Teacher id is not a tutor.");
                        }
                    }
                }
                if(teacherfound)
                {  
                    ((Tutor) tutorToRemove).removeTutor();
                    al1.remove(tutorToRemove);
                    JOptionPane.showMessageDialog(null,"Tutor has been removed.");
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Teacher id is not found!!");
                }
            }
        }
        else if(e.getSource()==displayButton)//creating display button for lecturer
        {
            if(teacherIdField.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(frame1,"Empty TextField Found","Error Please fill up the given Info",JOptionPane.WARNING_MESSAGE);
            }
            else
            {
                try
                {
                    int teacherId = Integer.parseInt(teacherIdField.getText());
                    if (teacherId==0)
                    {
                        JOptionPane.showMessageDialog(frame1,"Empty TextField Found","Error Please fill up the given Info",JOptionPane.WARNING_MESSAGE);
                    }
                    for(Teacher Tobj:al1)
                    {
                        if(Tobj instanceof Lecturer)
                        {
                            Lecturer L=(Lecturer) Tobj;
                            if(teacherId==Tobj.getTeacher$id())
                            {
                                JOptionPane.showMessageDialog(frame1,"Teacher ID:"+Tobj.getTeacher$id()+"\nTeacher Name:"+Tobj.getTeacher$name()+"\nAddress:"+Tobj.getAddress()+"\nWorking Type:"+Tobj.getWorking$type()+"\nEmployment Status:"+Tobj.getEmployment$status()+"\nWorking Hours:"+Tobj.getWorking$hours()+"\nDepartment:"+L.getDepartment()+"\nYears of Experience:"+L.getYearsofexperience()+"\nGraded Score:"+L.getGradedscore());
                                break;
                            }
                        }
                    }
                }
                catch(NumberFormatException n)
                {
                    JOptionPane.showMessageDialog(frame1,"ERROR_MESSAGE","ERROR",JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        else if(e.getSource() == displayButton1)//creating display button for tutor 
        {
            int teacherId2=Integer.parseInt(teacherIdField2.getText());
            if(teacherId2==0)
            {
                JOptionPane.showMessageDialog(frame1,"Empty TextField Found","Error Please fill up the given Info",JOptionPane.WARNING_MESSAGE);
            }
            else
            {
                for(Teacher Tobj:al1)
                {
                    if(Tobj instanceof Tutor)
                    {
                        Tutor T=(Tutor) Tobj;
                        if(teacherId2==Tobj.getTeacher$id())
                        {
                            JOptionPane.showMessageDialog(frame1,"Teacher ID:"+Tobj.getTeacher$id()+"\nTeacher Name:"+Tobj.getTeacher$name()+"\nAddress:"+Tobj.getAddress()+"\nWorking Type:"+Tobj.getWorking$type()+"\nEmployment Status:"+Tobj.getEmployment$status()+"\nWorking Hours:"+Tobj.getWorking$hours()+"\nSalary:"+T.getSalary()+"\nSpecialization:"+T.getSpecialization()+"\nAcademic Qualifications:"+T.getAcademic$qualifications()+"\nPerformance Index:"+T.getPerformance$index());
                            break;
                        }
                    }
                }
            }
        }
        else if(e.getSource()==clearButton)//clear button for lecturer
        {
            teacherIdField.setText("");
            teacherNameField.setText("");
            addressField.setText("");
            workingTypeField.setText("");
            employmentStatusField.setText("");
            departmentField.setText("");
            yearsOfExperienceField.setText("");
            workingHoursField.setText("");
            gradedScoreField.setText("");
        }
        else if(e.getSource()==clearButton1)//clear button for tutor
        {
            teacherIdField2.setText("");
            teacherNameField2.setText("");
            addressField2.setText("");
            workingTypeField2.setText("");
            employmentStatusField2.setText("");
            workingHoursField2.setText("");
            salaryField.setText("");
            specializationField.setText("");
            academicQualificationsField.setText("");
            performanceIndexField.setText("");
        }
    }

    public static void main(String[] args) {
        new TeacherGUI();
    }
}
    


    
        