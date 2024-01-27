package f6;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
public abstract class k extends h implements l {
    public static l A0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
        return queryLocalInterface instanceof l ? (l) queryLocalInterface : new j(iBinder);
    }
}
