package PPKWU_zad1_rev;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.lang.*;
@RestController
public class ReverseString {

	@RequestMapping(method = RequestMethod.GET)
	public String reverseString( @RequestParam("stringToBeReversed") String stringToBeReversed) {
		byte[] strAsByteArray = stringToBeReversed.getBytes();

		byte[] result = new byte[strAsByteArray.length];
		for (int i = 0; i < strAsByteArray.length; i++)
			result[i] = strAsByteArray[strAsByteArray.length - i - 1];

		return new String(result);
	}
}