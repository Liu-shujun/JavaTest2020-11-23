# JavaTest2020-11-23
姓名：刘淑君 班级：计G202 学号：2020322093

## 实验目的

1.掌握字符串String及其方法的使用

2.掌握文件的读取/写入方法

3.掌握异常处理结构

## 实验要求

1.设计一个学生信息，将学生的基本信息存在文本文件A中

2.采用交互式方式实例化某学生

3.输入的文本来源于文本文件B读取，处理的结果写入文本文件A中

4.处理结果的要求：7个汉字加一个标点符号，奇数时加“，”，偶数时加“。”

5.考虑操作中出现的异常，在程序中设计异常处理程序

## 实验过程
1.编写student类

(1)属性：name(姓名)，major(专业)，stuNum(学号)，age(年龄)

(2)通过Scanner类实例化学生信息，将学生信息输入进去

2.编写test(测试)类

(1)通过Fileinputstream读取文本文件B

(2)将学生信息转化成字符数组存入文本文件A中

(3)使用for循环，if-else语句将诗句按照规定的格式存入文本文件B中

(4)try-catch语句进行异常处理

## 核心代码

代码一

```
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
```

代码二

```
   File file =new File("B.txt");
	FileInputStream fis=new FileInputStream(file);
	
	FileReader in = new FileReader(file);
    FileWriter out = new FileWriter("A.txt");
```

代码三

```
//将学生的信息输出到文件
         student st = new student();
         char[] b = st.s().toCharArray();
         out.write(b);                  
         out.write("\n");

         char[] c = new char[(int) file.length()];

         in.read(c);
```

代码四

```
 //将诗句按照格式输出到文件
         for (int i=7,x=0; i<=14*17;i+=7,x+=7) { 
             if (i % 2 == 0) {
                 for (int j = x; j < i; j++) {
                     out.write(c[j]);
                 }
                 out.write("。\n");
             } else {
                 for (int j = x; j < i; j++) {
                     out.write(c[j]);
                 }
                 out.write(",");
             }
```

## 系统运行截图

![](https://github.com/Liu-shujun/JavaTest2020-11-23/blob/main/%E6%8D%95%E8%8E%B75.PNG)


![](https://github.com/Liu-shujun/JavaTest2020-11-23/blob/main/%E6%8D%95%E8%8E%B76.PNG)

## 编程感想

  在本次实验中，虽然遇到了许多困难，但通过与同学交流，询问老师解决了各种难题。学会了使用输入/输出流，写入/读取数据；充分掌握了字符串String的使用；对于try-catch的异常处理使用的更加得心应手。自己动手去实践，学习到了许多知识，受益匪浅。



















