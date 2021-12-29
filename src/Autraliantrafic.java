import demopack.centraltraffic;

public class Autraliantrafic implements centraltraffic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		centraltraffic a = new Autraliantrafic();
		a.greenGo();
		a.Falshyellow();
		a.redStop();
	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("green go implemented");
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("red stop implemented");
		
	}

	@Override
	public void Falshyellow() {
		// TODO Auto-generated method stub
		System.out.println("yellow flash implemented");
		
	}

}
