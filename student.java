import java.util.Scanner;

public class student {
    String name;//姓名
    String major;//专业
    int stuNum;//学号
    int age;//年龄
    public String s(){
    	Scanner sc=new Scanner(System.in);
    	
    	System.out.println("输入姓名：");
    	name=sc.next();
    	System.out.println("输入专业：");
    	major=sc.next();
    	System.out.println("输入学号：");
    	stuNum=sc.nextInt();
    	System.out.println("输入年龄：");
    	age=sc.nextInt();
    	String stu="姓名："+name+",专业："+major+",学号："+stuNum+",年龄："+age;
		return stu;
    }
}
