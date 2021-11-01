package teat;
class Cal_area
{
	int length;
	int width;
	int height;
	int radius;
	private double pi=3.14159;
	void setL(int l)
	{
		length=l;
	}
	void setW(int w)
	{
		width=w;
	}
	void setH(int h)
	{
		height=h;
	}
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
		System.out.println("半徑="+radius);
		System.out.println("球型體積="+pi*radius*radius*radius*4/3);
		System.out.println("長="+length+",寬="+width+",高="+height);
		System.out.println("立方體表面積="+length*width*4+length*height*2);
	}
}
public class class_01
{

	public static void main(String[] args)
	{
		Cal_area ca=new Cal_area();
		ca.setL(4);
		ca.setW(5);
		ca.setH(6);
		ca.setR(10);
		ca.show();
	}

}
