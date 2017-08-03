package bean;
public class Student {
    String name;
    String studentId;
    String sex;
    int grade;
    
    public Student(String name,String studentId,String sex,int grade){
        this.name= name;
        this.studentId= studentId;
        this.sex = sex;
        this.grade = grade;    
    }
    
    public int getGrade(){
        return grade;
    }
    public String getName(){
        return name;
    }
    
    public String getSex(){
        return sex;
    }
    
    public void setGrade(int g){
        this.grade = g;
    }
    
    public String getStudentId(){
        return studentId;
    }
    
}