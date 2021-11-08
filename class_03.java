package Java_test;
class Data
{
	private String name;
	private Test score;
	class Test
	{
		int english;
		int math;
		Test(int eng,int m)
		{
			english=eng;
			math=m;
		}
		public double avg(int eng,int m)
		{
			double avg=(eng+m)/2;
			return avg;
		}
		public void show()
		{
			System.out.println("name:"+name+" english:"+english+" math:"+math+" avg:"+avg(english,math));
		}
	}
}
public class class_03
{

	public static void main(String[] args)
	{
		Data dt1=new Data();
		dt1.show();
		Data dt2=new Data();
		dt2.show();
	}

}
