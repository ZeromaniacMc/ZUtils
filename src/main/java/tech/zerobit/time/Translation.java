package tech.zerobit.time;

public enum Translation {
    MILLISECOND_SINGULAR("Translations.Millisecond.Singular", "millisecond"),
    MILLISECOND_PLURAL("Translations.Millisecond.Plural", "milliseconds"),
    SECOND_SINGULAR("Translations.Second.Singular", "second"),
    SECOND_PLURAL("Translations.Second.Plural", "seconds"),
    MINUTE_SINGULAR("Translations.Minute.Singular", "minute"),
    MINUTE_PLURAL("Translations.Minute.Plural", "minutes"),
    HOUR_SINGULAR("Translations.Hour.Singular", "hour"),
    HOUR_PLURAL("Translations.Hour.Plural", "hours"),
    DAY_SINGULAR("Translations.Day.Singular", "day"),
    DAY_PLURAL("Translations.Day.Plural", "days"),
    WEEK_SINGULAR("Translations.Week.Singular", "week"),
    WEEK_PLURAL("Translations.Week.Plural", "weeks"),
    MONTH_SINGULAR("Translations.Month.Singular", "month"),
    MONTH_PLURAL("Translations.Month.Plural", "months"),
    YEAR_SINGULAR("Translations.Year.Singular", "year"),
    YEAR_PLURAL("Translations.Year.Plural","years");


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
