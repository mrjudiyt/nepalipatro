package u6;

import com.google.gson.JsonSyntaxException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import r6.f;
import r6.s;
import r6.t;
import t6.e;
import t6.j;
import y6.b;

/* compiled from: DateTypeAdapter */
public final class c extends s<Date> {

    /* renamed from: b  reason: collision with root package name */
    public static final t f16615b = new a();

    /* renamed from: a  reason: collision with root package name */
    private final List<DateFormat> f16616a;

    /* compiled from: DateTypeAdapter */
    static class a implements t {
        a() {
        }

        public <T> s<T> a(f fVar, x6.a<T> aVar) {
            if (aVar.c() == Date.class) {
                return new c();
            }
            return null;
        }
    }

    public c() {
        ArrayList arrayList = new ArrayList();
        this.f16616a = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (e.e()) {
            arrayList.add(j.c(2, 2));
        }
    }

    private synchronized Date e(String str) {
        for (DateFormat parse : this.f16616a) {
            try {
                return parse.parse(str);
            } catch (ParseException unused) {
            }
        }
        try {
            return v6.a.c(str, new ParsePosition(0));
        } catch (ParseException e10) {
            throw new JsonSyntaxException(str, e10);
        }
    }

    /* renamed from: f */
    public Date b(y6.a aVar) {
        if (aVar.I0() != b.NULL) {
            return e(aVar.w0());
        }
        aVar.s0();
        return null;
    }

    /* renamed from: g */
    public synchronized void d(y6.c cVar, Date date) {
        if (date == null) {
            cVar.g0();
        } else {
            cVar.M0(this.f16616a.get(0).format(date));
        }
    }
}
