package phase1.javaFSD;

public class StudentMarks {
	String name;
	int age;
	char section;
	char gender;
	int sub1;
	int sub2;
	int sub3;
	
	public StudentMarks(String s,int i,char sec,char gen,int P,int Q,int R) 
	{
		name=s;
		age=i;
		section=sec;
		gender=gen;
		sub1=P;
		sub2=Q;
	    sub3=R;

	}
	public StudentMarks(String s,int i,char sec,char gen,int Q,int R) 
	{
		name=s;
		age=i;
		section=sec;
		gender=gen;
		sub2=Q;
	    sub3=R;
	   
	}

	
    void dispaly() 
    {
    	int total=(sub1+sub2+sub3);
    	float percentage=(total/300f)*100;
		System.out.println(name+" "+age+" "+section+" "+gender+" "+sub1+" "+sub2+" "+sub3+" "+total+" "+percentage);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentMarks S1=new StudentMarks("Tarun",22,'A','M',95,80,99);
		StudentMarks S2=new StudentMarks("Pavani",21,'A','F',75,98);
		StudentMarks S3=new StudentMarks("Rahul",23,'A','M',81,92);
		StudentMarks S4=new StudentMarks("Jithendra",20,'A','M',93,89,95);
		S1.dispaly();
		S2.dispaly();
		S3.dispaly();
		S4.dispaly();

		

	}


}
