
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class test {
public static void main(String args[])throws Exception{
	File file =new File("B.txt");
	FileInputStream fis=new FileInputStream(file);

	
	FileReader in = new FileReader(file);
    FileWriter out = new FileWriter("A.txt");
	
	 try {
		 //��ѧ������Ϣ������ļ�
         student st = new student();
         char[] b = st.s().toCharArray();
         out.write(b);                  
         out.write("\n");

         char[] c = new char[(int) file.length()];

         in.read(c);
         
         //��ʫ�䰴�ո�ʽ������ļ�
         for (int i=7,x=0; i<=14*17;i+=7,x+=7) { 
             if (i % 2 == 0) {
                 for (int j = x; j < i; j++) {
                     out.write(c[j]);
                 }
                 out.write("��\n");
             } else {
                 for (int j = x; j < i; j++) {
                     out.write(c[j]);
                 }
                 out.write(",");
             }
         }
     }catch (IOException e){
         System.out.println("����");
     }finally {

             in.close();
             out.close();
     }

 }
}

