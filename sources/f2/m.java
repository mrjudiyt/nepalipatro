package f2;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import f2.e;
import java.io.IOException;

/* compiled from: ParcelFileDescriptorRewinder */
public final class m implements e<ParcelFileDescriptor> {

    /* renamed from: a  reason: collision with root package name */
    private final b f8497a;

    /* compiled from: ParcelFileDescriptorRewinder */
    public static final class a implements e.a<ParcelFileDescriptor> {
        public Class<ParcelFileDescriptor> a() {
            return ParcelFileDescriptor.class;
        }

        /* renamed from: c */
        public e<ParcelFileDescriptor> b(ParcelFileDescriptor parcelFileDescriptor) {
            return new m(parcelFileDescriptor);
        }
    }

    /* compiled from: ParcelFileDescriptorRewinder */
    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final ParcelFileDescriptor f8498a;

        b(ParcelFileDescriptor parcelFileDescriptor) {
            this.f8498a = parcelFileDescriptor;
        }

        /* access modifiers changed from: package-private */
        public ParcelFileDescriptor a() {
            try {
                Os.lseek(this.f8498a.getFileDescriptor(), 0, OsConstants.SEEK_SET);
                return this.f8498a;
            } catch (ErrnoException e10) {
                throw new IOException(e10);
            }
        }
    }

    public m(ParcelFileDescriptor parcelFileDescriptor) {
        this.f8497a = new b(parcelFileDescriptor);
    }

    public static boolean c() {
        return Build.VERSION.SDK_INT >= 21;
    }

    public void b() {
    }

    /* renamed from: d */
    public ParcelFileDescriptor a() {
        return this.f8497a.a();
    }
}
