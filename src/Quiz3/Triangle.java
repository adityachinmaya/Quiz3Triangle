package Quiz3;

public abstract class Triangle extends GeometricObject {

	double side1;
	double side2;
	double side3;
	
	/*this no arg constructor creates a default triangle
	 * with 1.0 as the default value. */
	public Triangle(){
		side1 = 1.0;
		side2 = 1.0;
		side3 = 1.0;
	}
	
	public Triangle(double Newside1, double Newside2, double Newside3){
		side1 = Newside1;
		side2 = Newside2;
		side3 = Newside3;
	}

	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}

	public double getPerimeter(){
		double Perimeter = side1 + side2 + side3;
		return Perimeter;
	}
	
	//Since the triangle can be equilateral, Herons formula is used
	//so all triangles will be satisfied	
	public double getArea(){
		double SemiP = (side1 + side2 + side3)/2;
		double Area = Math.sqrt( SemiP*(SemiP-side1)*(SemiP-side2)*(SemiP-side3));
		return Area;
	}
	
	@Override
	public String toString(){
		String Area = Double.toString(this.getArea());
		String Perimeter = Double.toString(this.getPerimeter());
		String side1 = Double.toString(this.getSide1());
		String Side2 = Double.toString(this.getSide2());
		String Side3 = Double.toString(this.getSide3());
		
		String description = ("area: " + Area + "\n" + "perimeter: " + Perimeter
				+ "\n" + "side1: " + side1 + "\n" + "side2: " + Side2 + "\n" + 
				"side3: " + Side3);
		
		return description;
	}
	
	
	
}
