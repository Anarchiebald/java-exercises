import java.util.Random;

public class Dice {

	private int id;
	private int value;

	public Dice(int id) {
		this.id = id;
		rollTheDice();
	}

	public int getId() {
		return id;
	}

	public int getValue() {
		return value;
	}

	public void rollTheDice() {
		Random random = new Random();
		value = random.nextInt(6) + 1;
	}
}