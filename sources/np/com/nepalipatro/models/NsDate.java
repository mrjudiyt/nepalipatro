package np.com.nepalipatro.models;

import java.util.ArrayList;
import kotlin.jvm.internal.m;
import np.com.nepalipatro.helpers.e;

/* compiled from: NsDate.kt */
public final class NsDate {
    private String month;
    private int tithi;
    private int year;

    public NsDate(int i10, String str, int i11) {
        m.f(str, "month");
        this.year = i10;
        this.month = str;
        this.tithi = i11;
    }

    public final String getMonth() {
        return this.month;
    }

    public final int getTithi() {
        return this.tithi;
    }

    public final String getTithiLong(String str) {
        m.f(str, "locale");
        try {
            int i10 = this.tithi;
            if (i10 <= -1) {
                return "";
            }
            if (i10 == 30) {
                i10 = 16;
            }
            this.tithi = i10;
            if (p.m(str, "ne", true)) {
                ArrayList<String> d02 = e.f15961a.d0();
                int i11 = this.tithi;
                if (i11 > 0) {
                    i11--;
                }
                String str2 = d02.get(i11);
                m.e(str2, "tithi_array_ne[if (tithi… 0) tithi - 1 else tithi]");
                return str2;
            }
            ArrayList<String> c02 = e.f15961a.c0();
            int i12 = this.tithi;
            if (i12 > 0) {
                i12--;
            }
            String str3 = c02.get(i12);
            m.e(str3, "tithi_array_en[if (tithi… 0) tithi - 1 else tithi]");
            return str3;
        } catch (Exception unused) {
            return "";
        }
    }

    public final int getYear() {
        return this.year;
    }

    public final void setMonth(String str) {
        m.f(str, "<set-?>");
        this.month = str;
    }

    public final void setTithi(int i10) {
        this.tithi = i10;
    }

    public final void setYear(int i10) {
        this.year = i10;
    }
}
