package basicjava;

public class PersonAge {

    private int age;

    public Person(int initialAge) {
	  // Add some more code to run some checks on initialAge
	if (initialAge < 0) {
	    this.age = 0;
	    System.out.println( "Age is not valid, setting age to 0.");
	}
	else {
	    this.age = initialAge;
	}
    }

    public void amIOld() {
	// Write code determining if this person's age is old and print the correct
        String result = "";
        if(age >= 18){
            result = "You are old.";
        }
        else if(age >=13){
            result = "You are a teenager.";
        }
        else{
            result = "You are young.";
        }
        System.out.println(result);
    }

    public void yearPasses() {
	// Increment this person's age.
	this.age++;
    }

    public static void main(String[] args) {
	// TODO Auto-generated method stub

    }

}
