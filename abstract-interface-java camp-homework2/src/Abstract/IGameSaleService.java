package Abstract;

import Entity.Customer;
import Entity.Campaign;
import Entity.Game;
public interface IGameSaleService {
	void saleGame(Customer customer, Game game, Campaign campaign);
}
