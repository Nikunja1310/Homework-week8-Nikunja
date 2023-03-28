package encapsulation26;

/**
 * public class Encapsulate {
 *  // private variables declared these can only be
 * accessed by public methods of class
 *  private String name;
 *  private int rollNo;
 *  private int age;
 *  // get method for name to access private variable
 * name
 *  public String getName() {
 *  return name;
 *  }
 *  // set method for name to access private variable
 * name
 *  public void setName(String name) {
 *  this.name = name;
 *  }
 *  // get method for roll to access private variable
 * rollNo
 *  public int getRollNo() {
 *  return rollNo;
 *  }
 *  // set method for roll to access private variable
 * rollNo
 *  public void setRollNo(int rollNo) {
 *  this.rollNo = rollNo;
 *  }
 *  // get method for age to access private variable age
 *  public int getAge() {
 *  return age;
 *  }
 *  // set method for age to access private variable age
 *  public void setAge(int age) {
 *  this.age = age;
 */
public class Encapsulate {

    // Private method declared these can only be accessed by public methods of class

    private String name ;
    private int rollno;
    private int age;


    //get method for name to access private variable name

    public String getName(){
        return name;
    }

    //set Method for name to access private variable name

    public void setName(String name){
        this.name = name;
    }

    //get Method for roll to access private variable rollno

    public int getRollNo(){
        return rollno;
    }

    // //set Method for roll to access private variable roll no

    public void setRollNo(int rollno){
        this.rollno =rollno;
    }

    //get Method for age to access private variable age

    public int getAge(){
        return age;
    }

    //set Method for age to access private variable age

    public void setAge(int age){
        this.age =age;
    }


}
