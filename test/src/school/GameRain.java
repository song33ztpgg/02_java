package school;

public class GameRain extends GameManager implements GameDamage, GameShelf {

	int damage; 
	int sheld;
	
	public GameRain(String name , int hp) {
		super(name, hp);
	} 
	
	public GameRain(String name , int hp,int damage) {
		this(name,hp);
		this.damage = damage;
	} 
	
	@Override
	public void Defance() {
		String.format("%s", damage);
		super.toString();
	}

	@Override
	public void Damage() {
		print(); 		
	}

}
