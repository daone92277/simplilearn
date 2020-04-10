package object_override_demo;

public class Player {
	private int id;
	private String name;
	
	
	public Player(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + "]";
	}


	public boolean equals(Object o) {
		return false;
		
	}
	
	
}
