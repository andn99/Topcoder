/**
 * Created by NgocAnDo on 3/4/17.
 */
public class SpecialDay {
    private static final String[] WEEK_DAYS = {"MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY","FRIDAY","SATURDAY","SUNDAY"};
    public int howMany(String weekday, int which, String month, int day){
        int count = 0;
        for (int year = 2000; year <= 2100; year++){
            int numToYear = numDateToYear(year);
            int numToMonth = numDateToMonth(year, month);
            String firstDay = getDay(numToYear + numToMonth + 1);
            int firsDayIdx = 0;
            int weekDayIdx = 0;
            for (int i = 0; i < WEEK_DAYS.length; i++){
                if(WEEK_DAYS[i].equals(firstDay))
                    firsDayIdx = i;
                if(WEEK_DAYS[i].equals(weekday))
                    weekDayIdx = i;
            }

            int dayOfMonth = 0;
            if(weekDayIdx >= firsDayIdx)
                dayOfMonth = (weekDayIdx - firsDayIdx + 1) + (which-1)*7;
            else
                dayOfMonth = (7 - (firsDayIdx - weekDayIdx) + 1) + (which-1)*7;

            if(day == dayOfMonth && dayOfMonth <= getNumDayOfMonth(year, month)) {
                System.out.println(year);
                count++;
            }
        }
        return count;
    }

    private Boolean isLeap(int year){
        return ((year % 4 == 0 && year %100 != 0) || year % 400 == 0);
    }

    public int getNumDayOfMonth(int year, String month){
        int m = 0;
        if(month.equals("JANUARY"))
            m = 1;
        else if(month.equals("FEBRUARY"))
            m = 2;
        else if(month.equals("MARCH"))
            m = 3;
        else if(month.equals("APRIL"))
            m = 4;
        else if(month.equals("MAY"))
            m = 5;
        else if(month.equals("JUNE"))
            m = 6;
        else if(month.equals("JULY"))
            m = 7;
        else if(month.equals("AUGUST"))
            m = 8;
        else if(month.equals("SEPTEMBER"))
            m = 9;
        else if(month.equals("OCTOBER"))
            m = 10;
        else if(month.equals("NOVEMBER"))
            m = 11;
        else if(month.equals("DECEMBER"))
            m = 12;


            switch (m){
                case 2:
                    if(isLeap(year))
                        return  29;
                    else
                        return  28;

                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    return 31;

                case 4:
                case 6:
                case 9:
                case 11:
                    return 30;
            }

        return 0;
    }
    private String getDay(int day){
        int d = (day - 1) % 7;
        switch (d){
            case 0:
                return "SATURDAY";
            case 1:
                return "SUNDAY";
            case 2:
                return "MONDAY";
            case 3:
                return "TUESDAY";
            case 4:
                return "WEDNESDAY";
            case 5:
                return "THURSDAY";
            case 6:
                return "FRIDAY";
        }
        return "";
    }
    private int numDateToMonth(int year, String month){
        int m = 0;
        if(month.equals("JANUARY"))
            m = 1;
        else if(month.equals("FEBRUARY"))
            m = 2;
        else if(month.equals("MARCH"))
            m = 3;
        else if(month.equals("APRIL"))
            m = 4;
        else if(month.equals("MAY"))
            m = 5;
        else if(month.equals("JUNE"))
            m = 6;
        else if(month.equals("JULY"))
            m = 7;
        else if(month.equals("AUGUST"))
            m = 8;
        else if(month.equals("SEPTEMBER"))
            m = 9;
        else if(month.equals("OCTOBER"))
            m = 10;
        else if(month.equals("NOVEMBER"))
            m = 11;
        else if(month.equals("DECEMBER"))
            m = 12;

        int dayOfYear = 0;
        for (int i = 1; i <= m-1; i++){
            switch (i){
                case 2:
                    if(isLeap(year))
                        dayOfYear += 29;
                    else
                        dayOfYear += 28;
                    break;
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    dayOfYear += 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    dayOfYear += 30;
                    break;
            }
        }
        return dayOfYear;
    }
    private int numDateToYear(int year){
        int num = 0;
        for (int i = 2000; i < year; i++){
            if(isLeap(i))
                num += 366;
            else
                num += 365;
        }
        return num;
    }
}
