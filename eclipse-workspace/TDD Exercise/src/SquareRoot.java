
public class SquareRoot {
	public double squareRoot(double t)
	{
	   double r = t/2.0;
	   for (int k=0; k < 10; k++) {
		   r = (r + t/r)/2.0;
	   } 
	return r; 
	}
	

}
