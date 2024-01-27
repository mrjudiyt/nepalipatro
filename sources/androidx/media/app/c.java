package androidx.media.app;

import android.app.PendingIntent;
import android.os.Build;
import android.support.v4.media.session.MediaSessionCompat;
import android.widget.RemoteViews;
import androidx.core.app.l;
import androidx.media.i;
import androidx.media.j;
import androidx.media.k;

/* compiled from: NotificationCompat */
public class c extends l.h {

    /* renamed from: e  reason: collision with root package name */
    int[] f3615e = null;

    /* renamed from: f  reason: collision with root package name */
    MediaSessionCompat.Token f3616f;

    /* renamed from: g  reason: collision with root package name */
    boolean f3617g;

    /* renamed from: h  reason: collision with root package name */
    PendingIntent f3618h;

    private RemoteViews t(l.a aVar) {
        boolean z10 = aVar.a() == null;
        RemoteViews remoteViews = new RemoteViews(this.f2203a.f2167a.getPackageName(), k.f3739a);
        int i10 = i.f3733a;
        remoteViews.setImageViewResource(i10, aVar.e());
        if (!z10) {
            remoteViews.setOnClickPendingIntent(i10, aVar.a());
        }
        if (Build.VERSION.SDK_INT >= 15) {
            a.a(remoteViews, i10, aVar.j());
        }
        return remoteViews;
    }

    public void b(androidx.core.app.k kVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            b.d(kVar.a(), b.b(b.a(), this.f3615e, this.f3616f));
        } else if (this.f3617g) {
            kVar.a().setOngoing(true);
        }
    }

    public RemoteViews n(androidx.core.app.k kVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            return null;
        }
        return r();
    }

    public RemoteViews o(androidx.core.app.k kVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            return null;
        }
        return s();
    }

    /* access modifiers changed from: package-private */
    public RemoteViews r() {
        int min = Math.min(this.f2203a.f2168b.size(), 5);
        RemoteViews c10 = c(false, u(min), false);
        c10.removeAllViews(i.f3736d);
        if (min > 0) {
            for (int i10 = 0; i10 < min; i10++) {
                c10.addView(i.f3736d, t(this.f2203a.f2168b.get(i10)));
            }
        }
        if (this.f3617g) {
            int i11 = i.f3734b;
            c10.setViewVisibility(i11, 0);
            c10.setInt(i11, "setAlpha", this.f2203a.f2167a.getResources().getInteger(j.f3738a));
            c10.setOnClickPendingIntent(i11, this.f3618h);
        } else {
            c10.setViewVisibility(i.f3734b, 8);
        }
        return c10;
    }

    /* access modifiers changed from: package-private */
    public RemoteViews s() {
        int i10;
        RemoteViews c10 = c(false, v(), true);
        int size = this.f2203a.f2168b.size();
        int[] iArr = this.f3615e;
        if (iArr == null) {
            i10 = 0;
        } else {
            i10 = Math.min(iArr.length, 3);
        }
        c10.removeAllViews(i.f3736d);
        if (i10 > 0) {
            int i11 = 0;
            while (i11 < i10) {
                if (i11 < size) {
                    c10.addView(i.f3736d, t(this.f2203a.f2168b.get(this.f3615e[i11])));
                    i11++;
                } else {
                    throw new IllegalArgumentException(String.format("setShowActionsInCompactView: action %d out of bounds (max %d)", new Object[]{Integer.valueOf(i11), Integer.valueOf(size - 1)}));
                }
            }
        }
        if (this.f3617g) {
            c10.setViewVisibility(i.f3735c, 8);
            int i12 = i.f3734b;
            c10.setViewVisibility(i12, 0);
            c10.setOnClickPendingIntent(i12, this.f3618h);
            c10.setInt(i12, "setAlpha", this.f2203a.f2167a.getResources().getInteger(j.f3738a));
        } else {
            c10.setViewVisibility(i.f3735c, 0);
            c10.setViewVisibility(i.f3734b, 8);
        }
        return c10;
    }

    /* access modifiers changed from: package-private */
    public int u(int i10) {
        if (i10 <= 3) {
            return k.f3741c;
        }
        return k.f3740b;
    }

    /* access modifiers changed from: package-private */
    public int v() {
        return k.f3742d;
    }

    public c w(PendingIntent pendingIntent) {
        this.f3618h = pendingIntent;
        return this;
    }

    public c x(MediaSessionCompat.Token token) {
        this.f3616f = token;
        return this;
    }

    public c y(int... iArr) {
        this.f3615e = iArr;
        return this;
    }

    public c z(boolean z10) {
        if (Build.VERSION.SDK_INT < 21) {
            this.f3617g = z10;
        }
        return this;
    }
}
