
public class que_2 {

	public static void main(String[] args) 
	{
		patient rohan = new patient();
		rohan.patientName = "Rohan";
		rohan.height = 1.7 ;
		rohan.weight = 60.0;
		System.out.println(rohan.computeBMI());
		
	}

}

class patient
{
	static String patientName ;
	static Double height;
	static double weight;
	
	public double computeBMI()
	{
		return(weight/(height*height));
	}
}
