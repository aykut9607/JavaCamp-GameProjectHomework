package Concrete;

import Abstract.IGameService;
import Entity.Game;

public class GameManager implements IGameService{

	@Override
	public void add(Game game) {
		System.out.println(game.getGameName()+" saved to database");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getGameName()+" deleted");
		
	}

	
	@Override
	public void update(Game game, Game game2) {
		System.out.println(game.getGameName()+" updated as "+ game2.getGameName());
		
	}

}
