abstract class shape{
abstract void numberofsides();
}

class triangle extends shape{
	void numberofsides(){
	System.out.println("Number of sides of Triangle is 3.");
	}
}
class rectangle extends shape{ 
        void numberofsides(){ 
        System.out.println("Number of sides of Rectangle is 4."); 
        }
}
class hexagon extends shape{ 
        void numberofsides(){ 
        System.out.println("Number of sides of Hexagon is 6."); 
        }

}
class expt31{
public static void main(String[]args){
	triangle t = new triangle();
	t.numberofsides();
	rectangle r = new rectangle();
	r.numberofsides();
	hexagon h = new hexagon();
	h.numberofsides();
	}
}
