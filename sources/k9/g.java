package k9;

import com.google.android.gms.common.api.Api;
import o8.q;
import y8.l;

/* compiled from: Channel.kt */
public final class g {
    public static final <E> d<E> a(int i10, a aVar, l<? super E, q> lVar) {
        d<E> mVar;
        if (i10 != -2) {
            boolean z10 = false;
            if (i10 == -1) {
                if (aVar == a.SUSPEND) {
                    z10 = true;
                }
                if (z10) {
                    return new m(1, a.DROP_OLDEST, lVar);
                }
                throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
            } else if (i10 != 0) {
                if (i10 == Integer.MAX_VALUE) {
                    return new b(Api.BaseClientBuilder.API_PRIORITY_OTHER, lVar);
                }
                if (aVar == a.SUSPEND) {
                    return new b(i10, lVar);
                }
                return new m(i10, aVar, lVar);
            } else if (aVar == a.SUSPEND) {
                mVar = new b<>(0, lVar);
            } else {
                mVar = new m<>(1, aVar, lVar);
            }
        } else if (aVar == a.SUSPEND) {
            mVar = new b<>(d.f15524f.a(), lVar);
        } else {
            mVar = new m<>(1, aVar, lVar);
        }
        return mVar;
    }

    public static /* synthetic */ d b(int i10, a aVar, l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        if ((i11 & 2) != 0) {
            aVar = a.SUSPEND;
        }
        if ((i11 & 4) != 0) {
            lVar = null;
        }
        return a(i10, aVar, lVar);
    }
}
