import java.util.Scanner;

public class student {
    String name;//����
    String major;//רҵ
    int stuNum;//ѧ��
    int age;//����
    public String s(){
    	Scanner sc=new Scanner(System.in);
    	
    	System.out.println("����������");
    	name=sc.next();
    	System.out.println("����רҵ��");
    	major=sc.next();
    	System.out.println("����ѧ�ţ�");
    	stuNum=sc.nextInt();
    	System.out.println("�������䣺");
    	age=sc.nextInt();
    	String stu="������"+name+",רҵ��"+major+",ѧ�ţ�"+stuNum+",���䣺"+age;
		return stu;
    }
}
