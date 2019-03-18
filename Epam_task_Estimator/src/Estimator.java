
public class Estimator {
  int houseEstimator(String a,int b,String c)
  {
	  int d=0;
	  if(a.equals("Below standard"))
		  d=1200;
	  else if(a.equals("Above standard"))
		  d=1500;
	  else if(a.equals("High standard") && c.equals("YES"))
		  d=2500;
	  else if(a.equals("High standard"))
		  d=1800;
	  return (d*b); 
  }
}
