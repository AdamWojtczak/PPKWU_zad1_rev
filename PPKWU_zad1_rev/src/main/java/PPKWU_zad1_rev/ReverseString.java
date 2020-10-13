package PPKWU_zad1_rev;
// Java program to ReverseString using ByteArray.
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.lang.*;
import java.io.*;
import java.util.*;

// Class of ReverseString
@RestController
public class ReverseString {

	@RequestMapping(method = RequestMethod.GET)
	public String reverseString(String input) {
		// getBytes() method to convert string
		// into bytes[].
		input  = "aAabBb";
		byte[] strAsByteArray = input.getBytes();

		byte[] result = new byte[strAsByteArray.length];

		// Store result in reverse order into the
		// result byte[]
		for (int i = 0; i < strAsByteArray.length; i++)
			result[i] = strAsByteArray[strAsByteArray.length - i - 1];

		System.out.println(new String(result));
		return new String(result);
	}
}