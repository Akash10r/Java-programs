import java.util.*;
class tria
{
	public static void main(String[] args) 
	{
    int t = 286; // start with the next triangle number after 285
    int p = 166; // start with the next pentagonal number after 165
    int h = 144; // start with the next hexagonal number after 143
    long triangle, pentagonal, hexagonal;
    do 
	{
        triangle = t * (t + 1) / 2;
        pentagonal = p * (3 * p - 1) / 2;
        hexagonal = h * (2 * h - 1);
        if (triangle == pentagonal && pentagonal == hexagonal) 
		{
            System.out.println(triangle);
            break;
        }
        if (triangle <= pentagonal && triangle <= hexagonal) 
		{
            t++;
        } else if (pentagonal <= triangle && pentagonal <= hexagonal) 
		{
            p++;
        } else {
            h++;
        }
    } while (true);
	}
}
