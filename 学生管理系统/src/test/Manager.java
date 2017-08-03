package test;
import java.util.*;

import bean.Student;
public class Manager {
    
    static List<Student> StudentList = new LinkedList<Student>();
    public static void main(String[] agrs){
        
        
        select(StudentList);        
                
    }
    private static void select(List<Student> StudentList ){
        System.out.println("***************");
        System.out.println("*这是一个普通的学生管理系统 *");
        System.out.println("*1：增加小伙伴                 *");
        System.out.println("*2：删除小伙伴                 *");
        System.out.println("*3：修改成绩                    *");
        System.out.println("*4：查询成绩                    *");
        System.out.println("***************");   
        System.out.println("你想干啥：");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();        
        switch(choice){
        case 1:
            System.out.print("请输入小伙伴的姓名：");
            Scanner Sname = new Scanner(System.in);
            String name = Sname.nextLine();
            System.out.print("请输入小伙伴的性别：");
            Scanner Ssex = new Scanner(System.in);
            String sex = Ssex.nextLine();
            System.out.print("请输入小伙伴的学号：");
            Scanner SId = new Scanner(System.in);
            String studentId = SId.nextLine();
            System.out.print("请输入小伙伴的成绩：");
            Scanner Sgrade = new Scanner(System.in);
            int grade = Sgrade.nextInt();
            StudentList.add(new Student(name,studentId,sex,grade));
            System.out.println("添加成功");
            select(StudentList);
            break;
        case 2:
            System.out.print("请告诉我需要删除的可怜娃的学号：");
            Scanner Sid = new Scanner(System.in);
            String SstudentId = Sid.nextLine();
            boolean isfindDelete = false;
            for (int i = 0; i < StudentList.size(); i++) {
                if(SstudentId.equals(StudentList.get(i).getStudentId())){
                    System.out.println("正在删除");
                    StudentList.remove(i);
                    System.out.println("删除成功");
                    isfindDelete =true;
                }
            }
            if(!isfindDelete){
                System.out.println("诶嘿，没找着");
            }
            select(StudentList);
            break;
        case 3:
            System.out.print("请告诉我需要修改成绩小伙伴的学号：");
            Scanner GId = new Scanner(System.in);
            String GstudentId = GId.nextLine();
            boolean isfindChange = false;
            for (int j = 0; j < StudentList.size(); j++) {
                if(GstudentId.equals(StudentList.get(j).getStudentId())){
                    System.out.println("正在修改");
                    System.out.println("小伙伴原成绩为"+StudentList.get(j).getGrade());
                    System.out.print("请输入修改后小伙伴的成绩：");
                    Scanner Ggrade = new Scanner(System.in);
                    int grade2 = Ggrade.nextInt();
                    StudentList.get(j).setGrade(grade2);
                    System.out.println("修改成功");
                    isfindChange =true;
                }else{
                    
                }
            }
            if(!isfindChange){
                System.out.println("诶嘿，没找着");
            }
            select(StudentList);
            break;
        case 4:
            System.out.print("请告诉我需要查询小伙伴的学号：");
            Scanner CId = new Scanner(System.in);
            String CstudentId = CId.nextLine();
            boolean isfindData = false;
            for (int i = 0; i < StudentList.size(); i++) {
                if(CstudentId.equals(StudentList.get(i).getStudentId())){
                    System.out.println("名字:"+StudentList.get(i).getName());
                    System.out.println("性别:"+StudentList.get(i).getSex());
                    System.out.println("学号:"+StudentList.get(i).getStudentId());
                    System.out.println("成绩:"+StudentList.get(i).getGrade());
                    isfindData = true;
                
                }
            }
            if(!isfindData){
            System.out.println("诶嘿，没找着");
            }
            select(StudentList);
            break;
        default:
            System.out.println("输入的数字有误，请重新输入：");
            break;
        }
        
    }
}