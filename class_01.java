package teat;
class Cal_area
{
	int length;
	int width;
	int height;
	int radius;
	private double pi=3.14159;
	void setR(int r)
	{
		radius=r;
	}
	void setCube(int l,int w,int h)
	{
		length=l;
		width=w;
		height=h;
	}
	void show()
	{
		System.out.println("�b�|="+radius);
		System.out.println("�y����n="+pi*radius*radius*radius*4/3);
		System.out.println("��="+length+",�e="+width+",��="+height);
		System.out.println("�ߤ�����n="+length*width*4+length*height*2);
	}
}
public class class_01
{

	public static void main(String[] args)
	{
		Cal_area ca=new Cal_area();
		ca.setCube(4,5,6);
		ca.setR(10);
		ca.show();
	}

}
