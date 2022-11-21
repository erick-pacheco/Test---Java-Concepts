import java.util.*;

class Main {

  public static void main(String[] args) {

    /* Section 3: part 1 */
    ArrayList<Bill> bills = new ArrayList<Bill>();

    /* Section 3: part 2 */
    Patient john = new Patient("John", bills);

    /* Section 3: part 3 */
    john.setPatientIllness("severe cold");

    /* Section 3: part 4 */
    System.out.print(john);

    /* Section 3: part 5 */
    Bill newBill = new Bill(99.95, "June 15 2021");
    john.addBill(newBill);

    /* Section 3: part 6 */
    john.printBills();
  }

}