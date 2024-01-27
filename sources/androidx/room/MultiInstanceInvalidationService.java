package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import androidx.room.c;
import java.util.HashMap;

public class MultiInstanceInvalidationService extends Service {

    /* renamed from: h  reason: collision with root package name */
    int f4327h = 0;

    /* renamed from: i  reason: collision with root package name */
    final HashMap<Integer, String> f4328i = new HashMap<>();

    /* renamed from: j  reason: collision with root package name */
    final RemoteCallbackList<b> f4329j = new a();

    /* renamed from: k  reason: collision with root package name */
    private final c.a f4330k = new b();

    class a extends RemoteCallbackList<b> {
        a() {
        }

        /* renamed from: a */
        public void onCallbackDied(b bVar, Object obj) {
            MultiInstanceInvalidationService.this.f4328i.remove(Integer.valueOf(((Integer) obj).intValue()));
        }
    }

    class b extends c.a {
        b() {
        }

        public void q0(int i10, String[] strArr) {
            synchronized (MultiInstanceInvalidationService.this.f4329j) {
                String str = MultiInstanceInvalidationService.this.f4328i.get(Integer.valueOf(i10));
                if (str != null) {
                    int beginBroadcast = MultiInstanceInvalidationService.this.f4329j.beginBroadcast();
                    int i11 = 0;
                    while (i11 < beginBroadcast) {
                        try {
                            int intValue = ((Integer) MultiInstanceInvalidationService.this.f4329j.getBroadcastCookie(i11)).intValue();
                            String str2 = MultiInstanceInvalidationService.this.f4328i.get(Integer.valueOf(intValue));
                            if (i10 != intValue && str.equals(str2)) {
                                try {
                                    MultiInstanceInvalidationService.this.f4329j.getBroadcastItem(i11).s(strArr);
                                } catch (RemoteException unused) {
                                }
                            }
                            i11++;
                        } catch (Throwable th) {
                            MultiInstanceInvalidationService.this.f4329j.finishBroadcast();
                            throw th;
                        }
                    }
                    MultiInstanceInvalidationService.this.f4329j.finishBroadcast();
                }
            }
        }

        public void v0(b bVar, int i10) {
            synchronized (MultiInstanceInvalidationService.this.f4329j) {
                MultiInstanceInvalidationService.this.f4329j.unregister(bVar);
                MultiInstanceInvalidationService.this.f4328i.remove(Integer.valueOf(i10));
            }
        }

        public int x(b bVar, String str) {
            if (str == null) {
                return 0;
            }
            synchronized (MultiInstanceInvalidationService.this.f4329j) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
                int i10 = multiInstanceInvalidationService.f4327h + 1;
                multiInstanceInvalidationService.f4327h = i10;
                if (multiInstanceInvalidationService.f4329j.register(bVar, Integer.valueOf(i10))) {
                    MultiInstanceInvalidationService.this.f4328i.put(Integer.valueOf(i10), str);
                    return i10;
                }
                MultiInstanceInvalidationService multiInstanceInvalidationService2 = MultiInstanceInvalidationService.this;
                multiInstanceInvalidationService2.f4327h--;
                return 0;
            }
        }
    }

    public IBinder onBind(Intent intent) {
        return this.f4330k;
    }
}
