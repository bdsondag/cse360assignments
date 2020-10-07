package cse360assignment02;

public class AddingMachine {
  private int total;
  private String change;
  
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
    change = "0"; // used as way of creating string for toString method
  }
  
  public int getTotal () {
    return total;
  }
  
  public void add (int value) {
	  total = total + value; // adds value to total 
	  change = change + " + " + value; // adds addition to change string
  }

  public void subtract (int value) {
	  total = total - value; // subtracts value from total 
	  change = change + " - " + value; // adds subtraction to change string
  }

  public String toString () {
	  return change; // return change string which has all operations done to total 
  }

  public void clear() {
	  total = 0; // reset total value
	  change = "0"; // reset change value
  }
}