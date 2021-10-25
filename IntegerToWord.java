// Question no-19
package javaCore;
public class IntegerToWord 
{
	private static final String EMPTY = "";
    private static final String[] word =
            { EMPTY, "One ", "Two ", "Three ", "Four ", "Five ", "Six ","Seven ", "Eight ", "Nine ", "Ten ", "Eleven ","Twelve ",
                    "Thirteen ", "Fourteen ", "Fifteen ", "Sixteen ","Seventeen ", "Eighteen ", "Nineteen " };
    private static final String[] tens =
            { EMPTY, EMPTY, "Twenty ", "Thirty ", "Forty ", "Fifty ",
                    "Sixty ", "Seventy ", "Eighty ", "Ninety " };
    private static String convertToDigit(int n, String suffix)
    {
        if (n == 0) {
            return EMPTY;
        }
        if (n > 19) {
            return tens[n / 10] + word[n % 10] + suffix;
        }
        else {
            return word[n] + suffix;
        }
    }
    public static String convert(int n)
    {
        StringBuilder res = new StringBuilder();
        res.append(convertToDigit((n / 1000000000) % 100, "Billion, "));
        res.append(convertToDigit((n / 10000000) % 100, "Crore, "));
        res.append(convertToDigit(((n / 100000) % 100), "Lakh, "));
        res.append(convertToDigit(((n / 1000) % 100), "Thousand "));
        res.append(convertToDigit(((n / 100) % 10), "Hundred "));

        if ((n > 100) && (n % 100 != 0)) {
            res.append("and ");
        }
        res.append(convertToDigit((n % 100), ""));

        return res.toString();
    }
    public static void main(String[] args)
    {
        System.out.println(convert(1099009990));
        System.out.println(convert(1010));
    }
}

