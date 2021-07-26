package Concrete;

import Abstract.IGameSaleService;
import Entity.Campaign;
import Entity.Customer;
import Entity.Game;

public class GameSaleManager implements IGameSaleService{

	@Override
	public void saleGame(Customer customer, Game game, Campaign campaign) {
		double gamePrice=game.getPriceOfGame()-campaign.getCampaignDiscount();
		System.out.println(game.getGameName()+" game sold to "+customer.getFirstName()+" "+customer.getLastName() +" and price with discount is :"+gamePrice);
		
	}

}
