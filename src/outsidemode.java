public class outsidemode {
    public static boolean range(int n, boolean outsideMode) {
        if(outsideMode){
            if(n <= 1 || n >= 10){
                return true;
            }
            return false;
        }
        if(n >= 1 && n <= 10){
            return true;
        }
        return false;
    }
    public static void main(String args[])

    {
        boolean c =range(0, false);
        System.out.println(c);
    }
}
