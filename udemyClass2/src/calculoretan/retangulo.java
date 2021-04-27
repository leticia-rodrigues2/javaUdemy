package calculoretan;

public class retangulo {

	public double altura ;
	public double largura;



public double area() {
	
	return altura*largura;
}	
	
	public double perime() {
		
		return (altura*2)+(largura*2);
		
		
	}
	
public double diagonal() {
		double calculo = (altura*altura)+(largura*largura);
		
		return Math.sqrt(calculo);
		
		
	}
	
	
}



