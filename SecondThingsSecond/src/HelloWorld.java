import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

/*
    The traditional second program.
    Copyright (C) 2015  Eric Deiman

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.

 */

/**
 * It's tradition that the second program a person writes in a new language
 * plays a game with the user on the console. That's what we'll expand this
 * class to do.
 *
 * @author eric
 *
 */
public class HelloWorld {

	/**
	 * This may still look like gibberish, but it marks what is supposed to
	 * happen when the program starts. Don't worry too much about what it means;
	 * we'll get to that in due course.
	 * 
	 * @param args
	 *            The command line parameters.
	 * @throws IOException
	 */
	public static void main( String[] args ) throws IOException {
		System.out.println( "Hello world!" );

		// Putting empty line around portions of your code can make it easier
		// for a human reader to see what's going on. So, grouping lines of code
		// that work together is a good idea.
		byte[] buffer = new byte[ 255 ];
		System.out.print( "What's your name? " );
		System.in.read( buffer );
		String name = new String( buffer ).trim();
		System.out.println( "Hello there, " + name + "!" );

		// The above code all works together to read a persons name and display
		// it on the console, so it has empty line before the group and after
		// the group. The lines below are all related to playing the game.
		System.out.print( "Shall we play a game? " );
		System.in.read( buffer );
		if ( buffer[ 0 ] == 'Y' || buffer[ 0 ] == 'y' ) {
			// I put the code to play the game in what's called a method. You
			// can find it lower down in this file. Look for the phrase
			// "playGame" to
			// find it.
			playGame();
		}
	}

	/**
	 * This is called a method. In Java, when you have several lines of code
	 * that work together and that do something that you'll want to do more than
	 * once (or that deserve their own name), you make a method out of it.
	 * 
	 * This is a computerized version of the number guessing game. A pair of
	 * younger kids play a where one picks a number and the other tries to guess
	 * it. In this version of the game, the computer will guess a number and the
	 * user tries to guess it.
	 * 
	 * @throws IOException
	 */
	public static void playGame() throws IOException {
		// What is the biggest number the computer might pick?
		int upperBound = 10;
		// Computers can do things that are (kind of) random.
		Random randomNumberMaker = new Random();
		int guess = randomNumberMaker.nextInt( upperBound );

		// This is weird, so I wrote more about it in the wiki page for this
		// lesson.
		guess = guess + 1;

		// In the code we wrote above, we got keyboard input by using
		// System.in.read( buffer ), but that was kind of tedious because we had
		// to make the buffer just store the keys the user typed. So, one of the
		// people who make Java created a less tedious way to get the stuff a user types
		// on the keyboard.  Introducing, Scanner:
		Scanner keyboard = new Scanner( System.in );
	}
}
