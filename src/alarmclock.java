public class alarmclock {
    public static String alarmClock(int day, boolean vacation) {
        if(vacation) {
            if(day == 0 || day == 6)
                return "off";
            else
                return "10:00";
        }

        if(day == 0 || day == 6)
            return "10:00";

        return "7:00";
    }
    public static void main(String args[])

    {
        String c =alarmClock(0, false);
        System.out.println(c);
    }
}
