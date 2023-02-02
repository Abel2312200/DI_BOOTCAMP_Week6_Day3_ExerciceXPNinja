public class WarNumbers {

    public static int WarOfNumbers(int[] args) {
        // declaration global variables
        int sumEven = 0 , sumOdd = 0, currentNumber, response;

        // compute sum of eden and olden separately
        for (int i = 0; i < args.length; i++) {
            currentNumber = args[i];
            if(currentNumber%2 == 0)
                sumEven += currentNumber;
            else
                sumOdd += currentNumber;
        }

        // compute the response
        if(sumEven > sumOdd)
            response = sumEven - sumOdd;
        else
            response = sumOdd - sumEven;

        return response;
    }
}

