package controller;

import view.StringView;
/**
 * StringController for the third project dealing with Strings in Java.
 * @author CJOman
 *
 */
public class StringController
{
//	Declaration Section
//	All needed models and view objects
	private StringView myView;
	
	/**
	 * Create a StringController object initializing all values.
	 */
	public StringController()
	{
		myView = new StringView();
	}
	
	/**
	 * Starts the view using the displayError method from StringView.
	 */
	public void start()
	{
//		myView.displayError();
//		String myResponse = myView.getResponse();
//		myView.showPassedValue(myResponse);
//		
//		myView.moreInteractive("CJ Oman", myResponse);
		myView.testStringMethods();
	}
}
