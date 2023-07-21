import java.util.Scanner;
public class bomb 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); 
        for (int i = 0; i < T; i++) 
		{
            String s = sc.next();
            int b = s.length() - s.replace("B", "").length(); 
            int w = s.length() - b; 
            int destroyedWalls = b * 2; 
            System.out.println(destroyedWalls);
        }
    }
}














import turtle
wn = turtle.Screen()
wn.setup(width=400, height=400)
red = turtle.Turtle() # Assigning "Red" as name of the turtle

def curve(): # Method to draw curve
    for i in range(200): # To draw the curve step by step
        red.right(1)
        red.forward(1)

def heart():  # Method to draw full Heart
    red.fillcolor('red')
    red.begin_fill()
    red.left(140)
    red.forward(113)
    curve() # Left Curve
    red.left(120)
    curve() # Right Curve
    red.forward(112)
    red.end_fill()

heart()
red.ht() # Hiding Turtle
turtle.done()