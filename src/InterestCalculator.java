
public class InterestCalculator {
	double principle;
	int time;
	double intRate;
	InterestCalculator(double principle,int time)
	{
		this.principle=principle;
		this.time= time;
		if(time>=5)
		{
			this.intRate=10;
		}
		else
			this.intRate=12;
	}
		public double getInterest()
		{
			return (principle*time*intRate)/100;
		}
	
	public static void main(String[] args) {
		
		InterestCalculator i=new InterestCalculator(10000,6);
		double res=i.getInterest();
		System.out.println(res);
	
	}

}
