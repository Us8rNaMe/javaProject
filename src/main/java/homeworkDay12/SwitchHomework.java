package homeworkDay12;

import java.util.Scanner;

public class SwitchHomework {
    /*
! => exclamation mark
? => question mark
% => modulus
# => hash
* => star
@ => at
$ => dollar sign
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter symbol");
        String symbol = scanner.nextLine();
        switch (symbol){
            case "!": symbol = "! => exclamation mark";
            break;
            case "?": symbol = "? => question mark";
            break;
            case "%": symbol = "% => modulus";
            break;
            case "#": symbol = "# => hash";
            break;
            case "*": symbol = "* => star";
            break;
            case "@": symbol = "@ => at";
            break;
            case "$": symbol = "$ => dollar sign";
            break;

        }System.out.println(symbol);
    }
}
