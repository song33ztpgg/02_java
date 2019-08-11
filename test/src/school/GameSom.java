package school;

public class GameSom extends GameManager implements GameDamage {

	int damage; 
	
	@Override
	public void Damage() {
		String.format("데미지  %d", super.toString() , damage);
		
		 
	}

}
