public class Bricks

{
    public boolean makeBricks(int small, int big, int goal) {
    if (goal > small + big * 5)
        return false;
    else if (goal % 5 == 0)
        return goal / 5 <= big;
    else
        return goal % 5 <= small;
    }

    public static void main(String args[])

    {
        Bricks myBricks = new Bricks();

        System.out.println(myBricks.makeBricks(3,2,10));
    }
}
