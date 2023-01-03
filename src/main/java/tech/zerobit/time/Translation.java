package tech.zerobit.time;

public enum Translation {
    MILLISECOND_SINGULAR("TimeUnit.Millisecond.Singular", "millisecond"),
    MILLISECOND_PLURAL("TimeUnit.Millisecond.Plural", "milliseconds"),
    SECOND_SINGULAR("TimeUnit.Second.Singular", "second"),
    SECOND_PLURAL("TimeUnit.Second.Plural", "seconds"),
    MINUTE_SINGULAR("TimeUnit.Minute.Singular", "minute"),
    MINUTE_PLURAL("TimeUnit.Minute.Plural", "minutes"),
    HOUR_SINGULAR("TimeUnit.Hour.Singular", "hour"),
    HOUR_PLURAL("TimeUnit.Hour.Plural", "hours"),
    DAY_SINGULAR("TimeUnit.Day.Singular", "day"),
    DAY_PLURAL("TimeUnit.Day.Plural", "days"),
    WEEK_SINGULAR("TimeUnit.Week.Singular", "week"),
    WEEK_PLURAL("TimeUnit.Week.Plural", "weeks"),
    MONTH_SINGULAR("TimeUnit.Month.Singular", "month"),
    MONTH_PLURAL("TimeUnit.Month.Plural", "months"),
    YEAR_SINGULAR("TimeUnit.Year.Singular", "year"),
    YEAR_PLURAL("TimeUnit.Year.Plural","years");


    public String path;
    public String fallback;

    Translation(String path, String fallback) {
        this.path = path;
        this.fallback = fallback;
    }

    public String getPath(){
        return path;
    }
    public Object getFallback(){
        return fallback;
    }
}
