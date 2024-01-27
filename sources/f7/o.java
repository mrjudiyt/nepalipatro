package f7;

import b7.b;
import com.facebook.appevents.AppEventsConstants;
import com.google.zxing.a;
import com.google.zxing.c;
import com.google.zxing.e;
import java.util.Map;

/* compiled from: UPCAWriter */
public final class o implements e {

    /* renamed from: a  reason: collision with root package name */
    private final j f14616a = new j();

    public b a(String str, a aVar, int i10, int i11, Map<c, ?> map) {
        if (aVar == a.UPC_A) {
            return this.f14616a.a(AppEventsConstants.EVENT_PARAM_VALUE_NO.concat(String.valueOf(str)), a.EAN_13, i10, i11, map);
        }
        throw new IllegalArgumentException("Can only encode UPC-A, but got ".concat(String.valueOf(aVar)));
    }
}
