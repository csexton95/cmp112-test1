public class BodyDriver {
  public static void main(String[] args) {
	// This uses the first constructor, no parameters
	Body sun = new Body();
	// sun.idNum = Body.nextID++;
	sun.name = "Sol";
	sun.orbits = null; // Sun don't orbit nobody
	System.out.println(sun.toString("Hi mom"));
	//Uses the second constructor, two parameters
	Body jupiter = new Body();
	jupiter.orbits = sun'
	System.out.println(jupiter.toString());

	// Uses third constructor, one parameter
	Body jmoon = new Body("Io");
	jmoon.orbits = jupiter;
	System.out.println(jmoon.toString());

	// This uses the second constructor, two parameters
	Body earth = new Body(sun,"Earth");
	// earth.idNum = Body.nextID++;
	// earth.orbits = sun;
	System.out.println(earth.toString());
	
	// This uses the third constructor, one parameterr
	Body moon = new Body("Chuck");
	moon.orbits = earth;
	System.out.println(moon.toString());
	
	Body lance = new Body();
	lance.orbits = moon;
	lance.name = "Lance";

	System.out.println(lance.toString());
	
}

}
