public class Sauce implements Aliment {
  protected int kcal = 0;

  public void setKcal(int kcal) throws ExceptionCalRange {
    try {
      if (kcal < 0 || kcal > 1000) {
        throw new ExceptionCalRange();
      }

      this.kcal = kcal;

    } catch (ExceptionCalRange e) {
      e.printStackTrace();
    }
  }
}
