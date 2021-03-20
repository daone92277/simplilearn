package composition_demo;

public class Player extends Person {
	
	private int score;
	private Team team;
		
	public Player(int id, String name, int score, Team team) {
		super(id, name);
		this.score = score;
		this.team = team;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}


	public  void printPlayer() {
		System.out.println("Printing Player Details");
		super.printPerson();
		System.out.println("Score = " + score);
		team.printTeam();
		
	}
	
}
