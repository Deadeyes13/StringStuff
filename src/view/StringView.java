package view;

import javax.swing.JOptionPane;
/**
 * View object for StringView
 * @author CJOman
 *
 */
public class StringView
{
	
/**
 * Shows the error when a non integer is typed into the JOptionPane input field.
 */
	public void displayError()
	{
		int test;
		String temp;
		
		JOptionPane.showMessageDialog(null, "Let's watch the program crash");
		temp = JOptionPane.showInputDialog("Type your favorite number");
		test = Integer.parseInt(temp);
		JOptionPane.showMessageDialog(null, "Your favorite is " + test);
	}
	
	public String getResponse()
	{
		/*
		 * must have a value assigned to a variable in a method or it cannot be used and will cause an error.
		 */
		String response = null;
		JOptionPane.showMessageDialog(null, "Say something fun");
		response = JOptionPane.showInputDialog("Say the funny thing now!!");
		return response;
	}
	
	
	public void showPassedValue(String currentValue)
	{
		JOptionPane.showMessageDialog(null, currentValue + " is supposed to be funny...");
	}
	
	public void moreInteractive(String first, String second)
	{
		JOptionPane.showMessageDialog(null, "Hey " + first + "\n" + "says: " + "\n" + second);
	}
	
	public void testStringMethods()
	{
		testSubString(10);
		testConcat(" I need out!");
		testReplace('a', 'e');
		testReplaceAll("o", "CJ");
	}
		
	private void testSubString(int startPosition)
	{
		String testString = "supercalifragilisticexpialidocious";
		JOptionPane.showMessageDialog(null,"The substring method test!");
		JOptionPane.showMessageDialog(null, "We are going to go from the" + startPosition + "'th letter in the test string");
		JOptionPane.showMessageDialog(null, "The test string is: " + "\n" + testString);
		JOptionPane.showMessageDialog(null, "The testString.substring(startPosition) call gives us: " + "\n" + testString.substring(startPosition));
	}
	
	private void testConcat(String addedString)
	{
		String testString = "help me";
		JOptionPane.showMessageDialog(null,"The concat method test!");
		JOptionPane.showMessageDialog(null, "We are going to add" + addedString + " to the test string");
		JOptionPane.showMessageDialog(null, "The test string is: " + "\n" + testString);
		JOptionPane.showMessageDialog(null, "The testString.concat(addedString) call gives us: " + " \n " + testString.concat(addedString));
	}
	
	private void testReplace(char oldLetter, char newLetter)
	{
		String testString = "You are amazing.";
		JOptionPane.showMessageDialog(null,"The replace method test!");
		JOptionPane.showMessageDialog(null, "We are going to replace " + oldLetter + " with "+ newLetter);
		JOptionPane.showMessageDialog(null, "The test string is: " + "\n" + testString);
		JOptionPane.showMessageDialog(null, "The testString.replace(char oldLetter, char newLetter) call gives us: " + " \n " + testString.replace( oldLetter, newLetter));	
	}
	
	private void testReplaceAll(String regex, String replacement)
	{
		String testString = "You are amazing.";
		JOptionPane.showMessageDialog(null,"The replaceAll method test!");
		JOptionPane.showMessageDialog(null, "We are going to replace " + regex + " with "+ replacement);
		JOptionPane.showMessageDialog(null, "The test string is: " + "\n" + testString);
		JOptionPane.showMessageDialog(null, "The testString.replace(String regex, String replacement) call gives us: " + " \n " + testString.replaceAll( regex, replacement));	
	}
	
	
}
