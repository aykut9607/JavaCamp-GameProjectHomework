package Entity;

public class Game {
	private int gameId;
	private String gameName;
	private double priceOfGame;
	
	public Game() {
		
	}

	public Game(int gameId, String gameName, double priceOfGame) {
		this.gameId = gameId;
		this.gameName = gameName;
		this.priceOfGame = priceOfGame;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public double getPriceOfGame() {
		return priceOfGame;
	}

	public void setPriceOfGame(double priceOfGame) {
		this.priceOfGame = priceOfGame;
	}
	
	
}
