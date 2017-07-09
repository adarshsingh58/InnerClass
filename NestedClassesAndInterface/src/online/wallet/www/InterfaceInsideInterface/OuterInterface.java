package online.wallet.www.InterfaceInsideInterface;

public interface OuterInterface 
{
	public void printHello();

	interface InnerInterface{
		public void printNamaste();
	}
}
