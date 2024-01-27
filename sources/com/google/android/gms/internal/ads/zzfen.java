package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzfen {
    public static ParcelFileDescriptor zza(InputStream inputStream) {
        ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
        ParcelFileDescriptor parcelFileDescriptor = createPipe[0];
        zzcbg.zza.execute(new zzfem(inputStream, createPipe[1]));
        return parcelFileDescriptor;
    }
}
