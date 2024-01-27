package c;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import c.a;

@SuppressLint({"BanParcelableUsage"})
/* compiled from: ResultReceiver */
public class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: h  reason: collision with root package name */
    final boolean f5143h = false;

    /* renamed from: i  reason: collision with root package name */
    final Handler f5144i = null;

    /* renamed from: j  reason: collision with root package name */
    a f5145j;

    /* compiled from: ResultReceiver */
    class a implements Parcelable.Creator<b> {
        a() {
        }

        /* renamed from: a */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        /* renamed from: b */
        public b[] newArray(int i10) {
            return new b[i10];
        }
    }

    /* renamed from: c.b$b  reason: collision with other inner class name */
    /* compiled from: ResultReceiver */
    class C0100b extends a.C0098a {
        C0100b() {
        }

        public void x0(int i10, Bundle bundle) {
            b bVar = b.this;
            Handler handler = bVar.f5144i;
            if (handler != null) {
                handler.post(new c(i10, bundle));
            } else {
                bVar.b(i10, bundle);
            }
        }
    }

    /* compiled from: ResultReceiver */
    class c implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        final int f5147h;

        /* renamed from: i  reason: collision with root package name */
        final Bundle f5148i;

        c(int i10, Bundle bundle) {
            this.f5147h = i10;
            this.f5148i = bundle;
        }

        public void run() {
            b.this.b(this.f5147h, this.f5148i);
        }
    }

    b(Parcel parcel) {
        this.f5145j = a.C0098a.z0(parcel.readStrongBinder());
    }

    /* access modifiers changed from: protected */
    public void b(int i10, Bundle bundle) {
    }

    public void c(int i10, Bundle bundle) {
        if (this.f5143h) {
            Handler handler = this.f5144i;
            if (handler != null) {
                handler.post(new c(i10, bundle));
            } else {
                b(i10, bundle);
            }
        } else {
            a aVar = this.f5145j;
            if (aVar != null) {
                try {
                    aVar.x0(i10, bundle);
                } catch (RemoteException unused) {
                }
            }
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        synchronized (this) {
            if (this.f5145j == null) {
                this.f5145j = new C0100b();
            }
            parcel.writeStrongBinder(this.f5145j.asBinder());
        }
    }
}
