/*--------------------------------------------------------------------------------------*/
/*  template.java  -  Description                                                       */
/*                                                                                      */
/*--------------------------------------------------------------------------------------*/
/*  Author:                                                                             */
/*  Date:                                                                               */
/*--------------------------------------------------------------------------------------*/
/*  Input:                                                                              */
/*  Output:                                                                             */
/*--------------------------------------------------------------------------------------*/

import java.io.*;
import java.util.*;
import java.text.*;

public class javajpeg_review1
{

    public static void numbers (double one, double two, double three, double m, double mm)
    {

	double checkYourPrivligez = 0;

	m = (one + two + three) / 3;

	if (one > two || one > three)
	{
	    checkYourPrivligez = one;
	}

	if (two > one || two > three)
	{
	    checkYourPrivligez = two;
	}

	if (three > two || three > one)
	{
	    checkYourPrivligez = three;
	}

	mm = checkYourPrivligez;

	System.out.println ("mean:" + m + " Maximum:" + mm);


    }


    public static void main (String str[]) throws IOException
    {
	BufferedReader stdin = new BufferedReader (new InputStreamReader (System.in));
	DecimalFormat df = new DecimalFormat ("#");

	double one = 0;
	double two = 0;
	double three = 0;
	double mean = 0;
	double maximum = 0;

	System.out.println ("Put in the one numbers please.");
	one = Double.parseDouble (stdin.readLine ());
	System.out.println ("Put in the one numbers please.");
	two = Double.parseDouble (stdin.readLine ());
	System.out.println ("Put in the one numbers please.");
	three = Double.parseDouble (stdin.readLine ());



	numbers (one, two, three, mean, maximum);


    }
}


