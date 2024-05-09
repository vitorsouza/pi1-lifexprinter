package br.ufes.inf.labes;

import java.util.Comparator;

public class LifexData {
  private String country;
  
  private int year;
  
  private double lifexMale;
  
  private double lifexFemale;

  public LifexData(String country, int year, double lifexMale, double lifexFemale) {
    this.country = country;
    this.year = year;
    this.lifexMale = lifexMale;
    this.lifexFemale = lifexFemale;
  }

  public String getCountry() {
    return country;
  }

  public int getYear() {
    return year;
  }

  public double getLifexMale() {
    return lifexMale;
  }

  public double getLifexFemale() {
    return lifexFemale;
  }

  @Override
  public String toString() {
    return country + " (" + year + "): " + lifexMale + " / " + lifexFemale;
  }

  public static final class LifexDataComparatorByMaleDesc implements Comparator<LifexData> {
    @Override
    public int compare(LifexData o1, LifexData o2) {
      if (o1.lifexMale < o2.lifexMale) return 1;
      if (o1.lifexMale > o2.lifexMale) return -1;
      return 0;
    }
  }

  public static final class LifexDataComparatorByFemaleDesc implements Comparator<LifexData> {
    @Override
    public int compare(LifexData o1, LifexData o2) {
      if (o1.lifexFemale < o2.lifexFemale) return 1;
      if (o1.lifexFemale > o2.lifexFemale) return -1;
      return 0;
    }
  }
}