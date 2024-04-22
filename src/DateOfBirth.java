import java.util.Calendar;

public class DateOfBirth {
    private int day;
    private int month;
    private int year;

    public DateOfBirth(int day, int month, int year) {
        Calendar birthCal = Calendar.getInstance();
        Calendar curCal = Calendar.getInstance();
        try {
            birthCal.set(year, month - 1, day);
            if (birthCal.get(Calendar.DAY_OF_MONTH) != day || birthCal.get(Calendar.MONTH) != (month - 1) || birthCal.get(Calendar.YEAR) != year)
                throw new IllegalArgumentException("Invalid date of birth");
            if (curCal.before(birthCal))
                throw new IllegalArgumentException("Invalid date of birth ");
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Invalid date of birth");
        }
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }


    public String toString() {
        return String.format("%d-%02d-%02d", year, month, day); // Adding 1 to month because Calendar.MONTH starts from 0
    }
}


