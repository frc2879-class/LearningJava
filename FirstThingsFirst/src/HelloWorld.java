/*
    The traditional first program.
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
 * It's tradition that the first program a person writes in a new language
 * prints "Hello world!" to the console.  That's what this class will do.
 *
 * @author eric
 *
 */
public class HelloWorld {
	
	/**
	 * This may look like gibberish, but it marks what is supposed to happen
	 * when the program starts.  Don't worry to much about what it means; we'll
	 * get to that in due course.
	 * 
	 * @param args The command line parameters.
	 */
	public static void main( String[] args ) {
		System.out.println( "Hello world!" );
		byte[] buffer = new buffer[255];
		System.out.print("What's your name? ");
		System.in.read(buffer);
		String name = new String(buffer);
		System.out.println("Hello, " + name);
	}
}
