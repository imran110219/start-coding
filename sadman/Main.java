package sadman;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        int[] myNumbers = {1, 2, 3};
        int n = 5;
        if(n >= myNumbers.length)
            throw new IndexOutOfBoundsException("Index out of bounds");
        myNumbers[n] = 4;

    }
}
