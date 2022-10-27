import java.util.ArrayList;

public class DiceCup {

  public void rollTheDices(ArrayList<Dice> dices) {
    for (int i = 0; i < dices.size(); i++) {
      Dice dice = dices.get(i);
      dice.rollTheDice();
      System.out.println(dice.getId() + " - " + dice.getValue());
    }
  }

  public void rollTheDices(Dice[] dices) {
    for (int i = 0; i < dices.length; i++) {
      Dice dice = dices[i];
      dice.rollTheDice();
      System.out.println(dice.getId() + " - " + dice.getValue());
    }
  }
}