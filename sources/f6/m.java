package f6;

import android.os.Bundle;
import android.os.Parcel;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
public abstract class m extends h implements n {
    public m() {
        super("com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean z0(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 2) {
            i.b(parcel);
            Q((Bundle) i.a(parcel, Bundle.CREATOR));
            return true;
        } else if (i10 != 3) {
            return false;
        } else {
            i.b(parcel);
            zzb((Bundle) i.a(parcel, Bundle.CREATOR));
            return true;
        }
    }
}
