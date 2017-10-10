package zeroSumSubsequence;

import java.util.List;

public class ZeroSumSubsequence {
	
	public static int getMaximumLength(List<Integer> sequence) {
	    // assuming that there is at least on integer in sequence
		int subsetBinaryRep = (int) Math.pow(2, sequence.size()) - 1; // 11111....
		int initialExtractor = 1 << (sequence.size() - 1); // 10000....

        int currentExtractor;
        int sumOfElementsInSubsets  = 0;
        int currentLength = 0;
        int maxLength = 0; // no subsequence

        // no integers
        if(sequence.size() == 0){
            System.out.println("No integer is found");
            return 0;
        }


        // didn't consider empty subset and traverse through all subsets
        while (subsetBinaryRep > 0){
            // start the subset from 11111...
            currentExtractor = initialExtractor;
            for(int elementIndex = sequence.size() - 1; elementIndex >= 0; elementIndex--){
                if((subsetBinaryRep & currentExtractor) != 0){
                    sumOfElementsInSubsets += sequence.get(elementIndex);
                    currentLength++;
                }
                currentExtractor = currentExtractor >> 1; // look at the next element
            }

            // see if the sum of elements in the subset is zero and replace maxLength appropriately
            if(sumOfElementsInSubsets == 0 && currentLength > maxLength){
                maxLength = currentLength;
            }

            currentLength = 0; // reset the current length
            sumOfElementsInSubsets = 0; // reset the sum
            subsetBinaryRep --; // next subset
        }

        return maxLength;
        


	}
	
}
