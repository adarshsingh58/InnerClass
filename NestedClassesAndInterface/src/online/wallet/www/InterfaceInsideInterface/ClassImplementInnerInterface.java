package online.wallet.www.InterfaceInsideInterface;

public class ClassImplementInnerInterface implements OuterInterface.InnerInterface {

	@Override
	public void printNamaste() {
		System.out.println("Namste");
	}

}
