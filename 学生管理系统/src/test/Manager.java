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
        System.out.println("*����һ����ͨ��ѧ������ϵͳ *");
        System.out.println("*1������С���                 *");
        System.out.println("*2��ɾ��С���                 *");
        System.out.println("*3���޸ĳɼ�                    *");
        System.out.println("*4����ѯ�ɼ�                    *");
        System.out.println("***************");   
        System.out.println("�����ɶ��");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();        
        switch(choice){
        case 1:
            System.out.print("������С����������");
            Scanner Sname = new Scanner(System.in);
            String name = Sname.nextLine();
            System.out.print("������С�����Ա�");
            Scanner Ssex = new Scanner(System.in);
            String sex = Ssex.nextLine();
            System.out.print("������С����ѧ�ţ�");
            Scanner SId = new Scanner(System.in);
            String studentId = SId.nextLine();
            System.out.print("������С���ĳɼ���");
            Scanner Sgrade = new Scanner(System.in);
            int grade = Sgrade.nextInt();
            StudentList.add(new Student(name,studentId,sex,grade));
            System.out.println("��ӳɹ�");
            select(StudentList);
            break;
        case 2:
            System.out.print("���������Ҫɾ���Ŀ����޵�ѧ�ţ�");
            Scanner Sid = new Scanner(System.in);
            String SstudentId = Sid.nextLine();
            boolean isfindDelete = false;
            for (int i = 0; i < StudentList.size(); i++) {
                if(SstudentId.equals(StudentList.get(i).getStudentId())){
                    System.out.println("����ɾ��");
                    StudentList.remove(i);
                    System.out.println("ɾ���ɹ�");
                    isfindDelete =true;
                }
            }
            if(!isfindDelete){
                System.out.println("���٣�û����");
            }
            select(StudentList);
            break;
        case 3:
            System.out.print("���������Ҫ�޸ĳɼ�С����ѧ�ţ�");
            Scanner GId = new Scanner(System.in);
            String GstudentId = GId.nextLine();
            boolean isfindChange = false;
            for (int j = 0; j < StudentList.size(); j++) {
                if(GstudentId.equals(StudentList.get(j).getStudentId())){
                    System.out.println("�����޸�");
                    System.out.println("С���ԭ�ɼ�Ϊ"+StudentList.get(j).getGrade());
                    System.out.print("�������޸ĺ�С���ĳɼ���");
                    Scanner Ggrade = new Scanner(System.in);
                    int grade2 = Ggrade.nextInt();
                    StudentList.get(j).setGrade(grade2);
                    System.out.println("�޸ĳɹ�");
                    isfindChange =true;
                }else{
                    
                }
            }
            if(!isfindChange){
                System.out.println("���٣�û����");
            }
            select(StudentList);
            break;
        case 4:
            System.out.print("���������Ҫ��ѯС����ѧ�ţ�");
            Scanner CId = new Scanner(System.in);
            String CstudentId = CId.nextLine();
            boolean isfindData = false;
            for (int i = 0; i < StudentList.size(); i++) {
                if(CstudentId.equals(StudentList.get(i).getStudentId())){
                    System.out.println("����:"+StudentList.get(i).getName());
                    System.out.println("�Ա�:"+StudentList.get(i).getSex());
                    System.out.println("ѧ��:"+StudentList.get(i).getStudentId());
                    System.out.println("�ɼ�:"+StudentList.get(i).getGrade());
                    isfindData = true;
                
                }
            }
            if(!isfindData){
            System.out.println("���٣�û����");
            }
            select(StudentList);
            break;
        default:
            System.out.println("����������������������룺");
            break;
        }
        
    }
}