package Arrays;

public class duplicate {
        public static void main(String[] args) {
            int[] numArray = {1,9,9,10,11,6,4,10};
            for(int i = 0; i < numArray.length; i++){
                for(int j = i + 1; j < numArray.length; j++){
                    if(numArray[i] == numArray[j]){
                        System.out.println("Duplicate element found " + numArray[j]);
                    }
                }
            }
        }
    }

