package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
public static void main(String[] args) {
	

	//2. create an array of 5 robots.
Robot [] ro = new Robot[5];
	//3. use a for loop to initialize the robots.
for (int i = 0; i < ro.length; i++) {
	ro[i] = new Robot();
}
		//4. make each robot start at the bottom of the screen, side by side, facing up
int y = 75;
for (int i = 0; i < ro.length; i++) {
	y = y + 120;
	ro[i].setX(0 + y);
	ro[i].setY(500);
}
	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
Random ran = new Random();
ran.nextInt(50);
while(ro[i].getX() > 0) {
for (int i = 0; i < ro.length; i++) {
	ro[i].move((int) ran);
}
}
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
}
}
