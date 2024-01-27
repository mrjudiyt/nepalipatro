package np.com.nepalipatro.models;

import java.io.Serializable;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Locale;
import kotlin.jvm.internal.m;
import y9.b;

/* compiled from: BsDate.kt */
public final class BsDate implements Serializable {
    private int day;
    private String[][] dow_long = {new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"}, new String[]{"आइतबार", "सोमबार", "मंगलबार", "बुधबार", "बिहीबार", "शुक्रबार", "शनिबार"}};
    private String[][] dow_short = {new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"}, new String[]{"आइ", "सोम", "मंगल", "बुध", "बिही", "शुक्र", "शनि"}};
    private int month;
    private String[][] months = {new String[]{"Baishakh", "Jestha", "Asar", "Shrawan", "Bhadra", "Asoj", "Kartik", "Mangsir", "Poush", "Magh", "Falgun", "Chaitra"}, new String[]{"वैशाख", "जेठ", "असार", "साउन", "भदौ", "असोज", "कात्तिक", "मंसिर", "पुस", "माघ", "फागुन", "चैत"}};
    private int year;

    public BsDate(int i10, int i11, int i12) {
        this.year = i10;
        this.month = i11;
        this.day = i12;
    }

    public static /* synthetic */ String getDow_long$default(BsDate bsDate, String str, Calendar calendar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            calendar = null;
        }
        return bsDate.getDow_long(str, calendar);
    }

    public final int getActualDow() {
        return getAd().get(7);
    }

    public final Calendar getAd() {
        return new b().b(this);
    }

    public final int getDay() {
        return this.day;
    }

    public final String getDayNp() {
        NumberFormat instance = NumberFormat.getInstance(new Locale("ne"));
        instance.setGroupingUsed(false);
        String format = instance.format((long) this.day);
        m.e(format, "nf_us.format(this.day.toLong())");
        return format;
    }

    public final String getDow_Short() {
        return this.dow_short[0][new b().b(this).get(7) - 1];
    }

    public final String getDow_ShortNp() {
        return this.dow_short[1][new b().b(this).get(7) - 1];
    }

    public final String getDow_long(String str, Calendar calendar) {
        m.f(str, "locale");
        if (p.m(str, "ne", true)) {
            Calendar b10 = new b().b(this);
            if (calendar == null) {
                calendar = b10;
            }
            return this.dow_long[1][calendar.get(7) - 1];
        }
        Calendar b11 = new b().b(this);
        if (calendar == null) {
            calendar = b11;
        }
        return this.dow_long[0][calendar.get(7) - 1];
    }

    public final String[][] getDow_long$app_release() {
        return this.dow_long;
    }

    public final String[][] getDow_short$app_release() {
        return this.dow_short;
    }

    public final int getMonth() {
        return this.month;
    }

    public final String getMonthLong() {
        return this.months[0][this.month - 1];
    }

    public final String getMonthNpLong() {
        return this.months[1][this.month - 1];
    }

    public final String getMonthString(int i10) {
        return this.months[1][i10 - 1];
    }

    public final String[][] getMonths$app_release() {
        return this.months;
    }

    public final int getYear() {
        return this.year;
    }

    public final String getYearNp() {
        NumberFormat instance = NumberFormat.getInstance(new Locale("ne"));
        instance.setGroupingUsed(false);
        String format = instance.format((long) this.year);
        m.e(format, "nf_us.format(this.year.toLong())");
        return format;
    }

    public final BsDate previousMonth() {
        int i10;
        int i11 = this.month;
        int i12 = this.year;
        int i13 = this.day;
        if (i11 - 1 == 0) {
            i10 = 12;
            i12--;
        } else {
            i10 = i11 - 1;
        }
        int h10 = new b().h(i12, i10);
        if (i13 > h10) {
            i13 = h10;
        }
        return new BsDate(i12, i10, i13);
    }

    public final void setDay(int i10) {
        this.day = i10;
    }

    public final void setDow_long$app_release(String[][] strArr) {
        m.f(strArr, "<set-?>");
        this.dow_long = strArr;
    }

    public final void setDow_short$app_release(String[][] strArr) {
        m.f(strArr, "<set-?>");
        this.dow_short = strArr;
    }

    public final void setMonth(int i10) {
        this.month = i10;
    }

    public final void setMonths$app_release(String[][] strArr) {
        m.f(strArr, "<set-?>");
        this.months = strArr;
    }

    public final void setYear(int i10) {
        this.year = i10;
    }
}
