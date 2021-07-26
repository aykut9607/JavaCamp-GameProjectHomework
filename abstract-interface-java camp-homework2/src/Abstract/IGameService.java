package Abstract;

import Entity.Game;

public interface IGameService {
	void add(Game game);
	void delete(Game game);
	void update(Game game,Game game2);
}
