package com.campusdual.classroom;

public class FuelTank {

  private int actualFuel = 10;

  public int getActualFuel() {
    return this.actualFuel;
  }
  public void setActualFuel(int fuel) {
    if (fuel < 0) {
      System.out.println("Error: No se puede establecer un valor negativo de combustible.");
    } else {
      this.actualFuel = fuel;
    }
  }
  public void showDetails() {
    System.out.println("La capacidad actual es de " + this.getActualFuel() + " litros.");
  }
}
