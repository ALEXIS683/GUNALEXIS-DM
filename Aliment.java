public interface Aliment {
  public boolean isVegan = false;
  public boolean isVegetarien = false;

  public void setKcal(int kcal) throws ExceptionCalRange;
}
