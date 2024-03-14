/* Inside the class Inky creat a object called ponky. 
Create a local variable called pinky and its value is donky. 
Print variable pinky inside the constructor. 
Create another variable inside the main method as blinky its value is pinky. 
And there is aNOTHER VARIABLe called rinky and its value is monky. 
Pass all three variables to anthor constuctor by crating an object called ponky2. And create bellow statements, 
   01. pinkey donkey
   02. donkey monkey
   03. pinky donky monky 

ITBNM-2211-0124
Git Assignment */

public class Inky{

public Inky(String Z){
	System.out.println(Z);
}

public Inky(String X, String Y, String V){
	System.out.println(Y + " " + X);
	System.out.println(X + " " + V);
	System.out.println(Y + " " + X + " " + V);
}

public static void main(String args[]){
	String pinky = "donky";

	Inky ponky = new Inky(pinky);

	String blinky = "pinky";
	String rinky = "monky";

	Inky ponky02 = new Inky(pinky, blinky, rinky);

}
}