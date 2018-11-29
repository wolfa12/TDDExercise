
public class SquareRoot {
	public double squareRoot(double t)
	{
		if(t == 0.0 || t == -0.0)
		{
			return 0;
		}
		if( t < 0.0)
		{
			throw new IllegalArgumentException("Cant take square root of negative numbers");
		}
	   double r = t/2.0;
	   for (int k=0; k < 10; k++) {
		   r = (r + t/r)/2.0;
	   } 
	return r; 
	}
	

}
