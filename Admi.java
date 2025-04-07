class Admi
{
	double UG=0;
	double PG=0;
		
	public void samp()
	{
		this.UG=0;
		this.PG=0;
	}
	public void samp(double UG, double PG)
	{
		this.UG=UG;
		this.PG=PG;
	}
}
class Ssion extends Admi
{
	public void UG()
	{
		if ( UG<=60 )
		{
			System.out.println("In valid for UG because of low score");
		}
		else
		{
			System.out.println("Student is eligible for UG");
		}
	}
	public void PG()
	{
		if ( PG<=70 )
		{
			System.out.println("In valid for PG because of low score");
		}
		else
		{
			System.out.println("Student is eligible for PG");
		}
	}
}
class Admission
{
	public static void main(String args[])
	{
		Ssion A = new Ssion();
		A.samp(69,79);
		A.UG();
		A.PG();
	}
}