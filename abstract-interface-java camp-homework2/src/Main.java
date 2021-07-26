import java.rmi.RemoteException;
import Adapter.MernisServiceAdapter;
import Entity.Customer;
import Entity.Campaign;
import Entity.Game;
import Concrete.GameSaleManager;
import Concrete.CustomerManager;
public class Main {

	public static void main(String[] args) {
		Customer customer=new Customer(1,"Aykut","aykut",1995,"30301886188");
		Customer customer2=new Customer(1,"Aykut","Demir",1995,"30301886188");
		Game game=new Game(2,"chess",5);
		
		Campaign campaign=new Campaign(3,"new campaign",3);
		
		CustomerManager customerManager=new CustomerManager(new MernisServiceAdapter());

		customerManager.update(customer, customer2);
		customerManager.delete(customer);
		customerManager.add(customer2);
		
		GameSaleManager gameSaleManager=new GameSaleManager();
		if(customerManager.isCheckPlayer()) {
			gameSaleManager.saleGame(customer2, game, campaign);
		}
		

	}

}
