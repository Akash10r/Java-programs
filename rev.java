import java.util.*;
class rev
{
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
        System.out.print("Sentence: ");
        String sentence = scanner.nextLine();
        String[] words = sentence.split(" ");
		
		StringBuilder reverse = new StringBuilder();
        for (String word : words) 
		{
            reverse.insert(0, word + " ");
        }
		System.out.println("Reversed order: "+reverse);
	}
}

   