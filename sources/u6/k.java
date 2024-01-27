package u6;

import com.google.gson.JsonSyntaxException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import r6.f;
import r6.s;
import r6.t;
import y6.b;
import y6.c;

/* compiled from: TimeTypeAdapter */
public final class k extends s<Time> {

    /* renamed from: b  reason: collision with root package name */
    public static final t f16654b = new a();

    /* renamed from: a  reason: collision with root package name */
    private final DateFormat f16655a = new SimpleDateFormat("hh:mm:ss a");

    /* compiled from: TimeTypeAdapter */
    static class a implements t {
        a() {
        }

        public <T> s<T> a(f fVar, x6.a<T> aVar) {
            if (aVar.c() == Time.class) {
                return new k();
            }
            return null;
        }
    }

    /* renamed from: e */
    public synchronized Time b(y6.a aVar) {
        if (aVar.I0() == b.NULL) {
            aVar.s0();
            return null;
        }
        try {
            return new Time(this.f16655a.parse(aVar.w0()).getTime());
        } catch (ParseException e10) {
            throw new JsonSyntaxException((Throwable) e10);
        }
    }

    /* renamed from: f */
    public synchronized void d(c cVar, Time time) {
        cVar.M0(time == null ? null : this.f16655a.format(time));
    }
}
