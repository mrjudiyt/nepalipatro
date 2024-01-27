package o7;

import com.facebook.appevents.AppEventsConstants;
import com.facebook.internal.security.CertificateUtil;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Calendar;
import java.util.TimeZone;
import n7.b;

/* compiled from: SolarEventCalculator */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final p7.a f16171a;

    /* renamed from: b  reason: collision with root package name */
    private final TimeZone f16172b;

    public a(p7.a aVar, String str) {
        this.f16171a = aVar;
        this.f16172b = TimeZone.getTimeZone(str);
    }

    private BigDecimal a(BigDecimal bigDecimal, Calendar calendar) {
        if (this.f16172b.inDaylightTime(calendar.getTime())) {
            bigDecimal = bigDecimal.add(BigDecimal.ONE);
        }
        return bigDecimal.doubleValue() > 24.0d ? bigDecimal.subtract(BigDecimal.valueOf(24)) : bigDecimal;
    }

    private BigDecimal b(b bVar, Calendar calendar, boolean z10) {
        calendar.setTimeZone(this.f16172b);
        BigDecimal p10 = p(calendar, Boolean.valueOf(z10));
        BigDecimal u10 = u(q(p10));
        BigDecimal k10 = k(u10, bVar);
        if (k10.doubleValue() < -1.0d || k10.doubleValue() > 1.0d) {
            return null;
        }
        return n(m(u10, p10, t(k10, Boolean.valueOf(z10))), calendar);
    }

    private BigDecimal e(BigDecimal bigDecimal) {
        return w(bigDecimal, BigDecimal.valueOf(0.017453292519943295d));
    }

    private BigDecimal f(BigDecimal bigDecimal) {
        return w(bigDecimal, new BigDecimal(57.29577951308232d));
    }

    private BigDecimal g(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        return bigDecimal.divide(bigDecimal2, 4, RoundingMode.HALF_EVEN);
    }

    private BigDecimal h(BigDecimal bigDecimal) {
        return x(BigDecimal.valueOf(Math.acos(bigDecimal.doubleValue())));
    }

    private BigDecimal i() {
        return g(this.f16171a.b(), BigDecimal.valueOf(15));
    }

    private BigDecimal j(BigDecimal bigDecimal) {
        return x(BigDecimal.valueOf(Math.cos(BigDecimal.valueOf(Math.asin(bigDecimal.doubleValue())).doubleValue())));
    }

    private BigDecimal k(BigDecimal bigDecimal, b bVar) {
        BigDecimal s10 = s(bigDecimal);
        BigDecimal j10 = j(s10);
        return x(g(BigDecimal.valueOf(Math.cos(e(bVar.a()).doubleValue())).subtract(s10.multiply(BigDecimal.valueOf(Math.sin(e(this.f16171a.a()).doubleValue())))), j10.multiply(BigDecimal.valueOf(Math.cos(e(this.f16171a.a()).doubleValue())))));
    }

    private BigDecimal l(Calendar calendar) {
        return new BigDecimal(calendar.get(6));
    }

    private BigDecimal m(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3) {
        BigDecimal r10 = r(bigDecimal);
        BigDecimal subtract = bigDecimal3.add(r10).subtract(bigDecimal2.multiply(new BigDecimal("0.06571"))).subtract(new BigDecimal("6.622"));
        if (subtract.doubleValue() < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            subtract = subtract.add(BigDecimal.valueOf(24));
        } else if (subtract.doubleValue() > 24.0d) {
            subtract = subtract.subtract(BigDecimal.valueOf(24));
        }
        return x(subtract);
    }

    private BigDecimal n(BigDecimal bigDecimal, Calendar calendar) {
        return a(bigDecimal.subtract(i()).add(v(calendar)), calendar);
    }

    private String o(BigDecimal bigDecimal) {
        String str;
        String str2;
        if (bigDecimal == null) {
            return "99:99";
        }
        if (bigDecimal.compareTo(BigDecimal.ZERO) == -1) {
            bigDecimal = bigDecimal.add(BigDecimal.valueOf(24.0d));
        }
        String[] split = bigDecimal.toPlainString().split("\\.");
        int i10 = 0;
        int parseInt = Integer.parseInt(split[0]);
        BigDecimal scale = new BigDecimal("0." + split[1]).multiply(BigDecimal.valueOf(60)).setScale(0, RoundingMode.HALF_EVEN);
        if (scale.intValue() == 60) {
            scale = BigDecimal.ZERO;
            parseInt++;
        }
        if (parseInt != 24) {
            i10 = parseInt;
        }
        if (scale.intValue() < 10) {
            str = AppEventsConstants.EVENT_PARAM_VALUE_NO + scale.toPlainString();
        } else {
            str = scale.toPlainString();
        }
        if (i10 < 10) {
            str2 = AppEventsConstants.EVENT_PARAM_VALUE_NO + String.valueOf(i10);
        } else {
            str2 = String.valueOf(i10);
        }
        return str2 + CertificateUtil.DELIMITER + str;
    }

    private BigDecimal p(Calendar calendar, Boolean bool) {
        return x(l(calendar).add(g(BigDecimal.valueOf((long) (bool.booleanValue() ? 6 : 18)).subtract(i()), BigDecimal.valueOf(24))));
    }

    private BigDecimal q(BigDecimal bigDecimal) {
        return x(w(new BigDecimal("0.9856"), bigDecimal).subtract(new BigDecimal("3.289")));
    }

    private BigDecimal r(BigDecimal bigDecimal) {
        BigDecimal x10 = x(f(new BigDecimal(Math.atan(e(w(f(new BigDecimal(Math.tan(e(bigDecimal).doubleValue()))), new BigDecimal("0.91764"))).doubleValue()))));
        if (x10.doubleValue() < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            x10 = x10.add(BigDecimal.valueOf(360));
        } else if (x10.doubleValue() > 360.0d) {
            x10 = x10.subtract(BigDecimal.valueOf(360));
        }
        BigDecimal valueOf = BigDecimal.valueOf(90);
        return g(x10.add(bigDecimal.divide(valueOf, 0, RoundingMode.FLOOR).multiply(valueOf).subtract(x10.divide(valueOf, 0, RoundingMode.FLOOR).multiply(valueOf))), BigDecimal.valueOf(15));
    }

    private BigDecimal s(BigDecimal bigDecimal) {
        return x(BigDecimal.valueOf(Math.sin(e(bigDecimal).doubleValue())).multiply(new BigDecimal("0.39782")));
    }

    private BigDecimal t(BigDecimal bigDecimal, Boolean bool) {
        BigDecimal f10 = f(h(bigDecimal));
        if (bool.booleanValue()) {
            f10 = BigDecimal.valueOf(360).subtract(f10);
        }
        return g(f10, BigDecimal.valueOf(15));
    }

    private BigDecimal u(BigDecimal bigDecimal) {
        BigDecimal add = bigDecimal.add(w(new BigDecimal(Math.sin(e(bigDecimal).doubleValue())), new BigDecimal("1.916"))).add(w(new BigDecimal(Math.sin(w(e(bigDecimal), BigDecimal.valueOf(2)).doubleValue())), new BigDecimal("0.020")).add(new BigDecimal("282.634")));
        if (add.doubleValue() > 360.0d) {
            add = add.subtract(BigDecimal.valueOf(360));
        }
        return x(add);
    }

    private BigDecimal v(Calendar calendar) {
        return new BigDecimal(calendar.get(15)).divide(new BigDecimal(3600000), new MathContext(2));
    }

    private BigDecimal w(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        return x(bigDecimal.multiply(bigDecimal2));
    }

    private BigDecimal x(BigDecimal bigDecimal) {
        return bigDecimal.setScale(4, RoundingMode.HALF_EVEN);
    }

    public String c(b bVar, Calendar calendar) {
        return o(b(bVar, calendar, true));
    }

    public String d(b bVar, Calendar calendar) {
        return o(b(bVar, calendar, false));
    }
}
