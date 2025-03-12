package practica4;

public class figGeometricas {
	double area (float radio) {

		return Math.PI*radio* radio;//circulo

		}

	double area (double b, double a) 
	{
		return b*a;//rectagulo
		}


	double area (float bas, float alt) 
	{ 
		double a;
		a=bas*alt;
		return a/2;//triangulo rectangulo
		}

	double area (float base1, float base2, float altura) 
	{ 
		return ((base1+base2)/2)*altura;//trapecio
		}

	double area (int perim, int apotema) 
	{
		double h;
		h=(perim* apotema)/2;
		return h;//hexagono

		}

	public static void main(String[] args) {
		
		figGeometricas f1=new figGeometricas();
		figGeometricas f2=new figGeometricas();
		figGeometricas f3=new figGeometricas();
		figGeometricas f4=new figGeometricas();
		figGeometricas f5=new figGeometricas();
		
		System.out.println("circulo: "+f1.area(2));
		System.out.println("Rectangulo: "+f2.area(4.2,2.5));
		System.out.println("Triangulo Rectangulo: "+f3.area(5,7));
		System.out.println("Trapecio: "+f4.area(6,8,4));
		System.out.println("hexagono: "+f5.area(36,5));
	}

}
