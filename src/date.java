public class date {
    public int dateFashion(int you, int date) {
        if (you <= 2 || date <= 2)
            return 0;
        if (you >= 8 || date >= 8)
            return 2;
        else
            return 1;
    }
    public static void main(String args[])
    {
        date partner = new date();

        System.out.println(partner.dateFashion(3,2));
    }
}
