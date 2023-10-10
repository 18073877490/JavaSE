package Object_Middle.Class;

public class MyDate {
    protected int day;
    protected int month;
    protected int year;

    public MyDate() {
    }

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toDateString() {
        return getYear() + "年" + getMonth() + "月" + getDay() + "日";
    }

    public boolean equals(MyDate obj) {
        return (day == obj.getDay()) && (month == obj.getMonth()) && (year == obj.getYear());
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
