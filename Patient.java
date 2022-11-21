import java.util.*;

public class Patient {
  private String name;
  private String illness;
  private double total = 0;
  private ArrayList<Bill> bills = new ArrayList<Bill>();

  public Patient(String name, ArrayList<Bill> bills) {
    this.name = name;
    this.bills = bills;
  }

  public String getPatientName() {
    return this.name;
  }

  public void setPatientName(String name) {
    this.name = name;
  }

  public String getPatientIllness() {
    return this.illness;
  }

  public void setPatientIllness(String illness) {
    this.illness = illness;
  }

  public void addBill(Bill bill) {
    bills.add(bill);
  }

  @Override
  public String toString(){
    return "[Patient's name = " + name + ", Patient's illness = " + illness + "]";
  }
  
  public void printBills() {
    for (Bill bill : bills) {
      this.total += bill.getAmount();
      System.out.println(bill.toString());
    }
    System.out.println(this.total);
  }
}