package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.android.billingclient:billing@@6.0.1 */
public final class zzc extends zzh implements zze {
    zzc(IBinder iBinder) {
        super(iBinder, "com.android.vending.billing.IInAppBillingService");
    }

    public final int zza(int i10, String str, String str2) {
        Parcel zzn = zzn();
        zzn.writeInt(3);
        zzn.writeString(str);
        zzn.writeString(str2);
        Parcel zzo = zzo(5, zzn);
        int readInt = zzo.readInt();
        zzo.recycle();
        return readInt;
    }

    public final int zzc(int i10, String str, String str2, Bundle bundle) {
        Parcel zzn = zzn();
        zzn.writeInt(i10);
        zzn.writeString(str);
        zzn.writeString(str2);
        zzj.zzb(zzn, bundle);
        Parcel zzo = zzo(10, zzn);
        int readInt = zzo.readInt();
        zzo.recycle();
        return readInt;
    }

    public final Bundle zzd(int i10, String str, String str2, Bundle bundle) {
        Parcel zzn = zzn();
        zzn.writeInt(9);
        zzn.writeString(str);
        zzn.writeString(str2);
        zzj.zzb(zzn, bundle);
        Parcel zzo = zzo(902, zzn);
        Bundle bundle2 = (Bundle) zzj.zza(zzo, Bundle.CREATOR);
        zzo.recycle();
        return bundle2;
    }

    public final Bundle zze(int i10, String str, String str2, Bundle bundle) {
        Parcel zzn = zzn();
        zzn.writeInt(9);
        zzn.writeString(str);
        zzn.writeString(str2);
        zzj.zzb(zzn, bundle);
        Parcel zzo = zzo(12, zzn);
        Bundle bundle2 = (Bundle) zzj.zza(zzo, Bundle.CREATOR);
        zzo.recycle();
        return bundle2;
    }

    public final Bundle zzf(int i10, String str, String str2, String str3, String str4) {
        Parcel zzn = zzn();
        zzn.writeInt(3);
        zzn.writeString(str);
        zzn.writeString(str2);
        zzn.writeString(str3);
        zzn.writeString((String) null);
        Parcel zzo = zzo(3, zzn);
        Bundle bundle = (Bundle) zzj.zza(zzo, Bundle.CREATOR);
        zzo.recycle();
        return bundle;
    }

    public final Bundle zzg(int i10, String str, String str2, String str3, String str4, Bundle bundle) {
        Parcel zzn = zzn();
        zzn.writeInt(i10);
        zzn.writeString(str);
        zzn.writeString(str2);
        zzn.writeString(str3);
        zzn.writeString((String) null);
        zzj.zzb(zzn, bundle);
        Parcel zzo = zzo(8, zzn);
        Bundle bundle2 = (Bundle) zzj.zza(zzo, Bundle.CREATOR);
        zzo.recycle();
        return bundle2;
    }

    public final Bundle zzh(int i10, String str, String str2, String str3, Bundle bundle) {
        Parcel zzn = zzn();
        zzn.writeInt(6);
        zzn.writeString(str);
        zzn.writeString(str2);
        zzn.writeString(str3);
        zzj.zzb(zzn, bundle);
        Parcel zzo = zzo(9, zzn);
        Bundle bundle2 = (Bundle) zzj.zza(zzo, Bundle.CREATOR);
        zzo.recycle();
        return bundle2;
    }

    public final Bundle zzi(int i10, String str, String str2, String str3) {
        Parcel zzn = zzn();
        zzn.writeInt(3);
        zzn.writeString(str);
        zzn.writeString(str2);
        zzn.writeString(str3);
        Parcel zzo = zzo(4, zzn);
        Bundle bundle = (Bundle) zzj.zza(zzo, Bundle.CREATOR);
        zzo.recycle();
        return bundle;
    }

    public final Bundle zzj(int i10, String str, String str2, String str3, Bundle bundle) {
        Parcel zzn = zzn();
        zzn.writeInt(i10);
        zzn.writeString(str);
        zzn.writeString(str2);
        zzn.writeString(str3);
        zzj.zzb(zzn, bundle);
        Parcel zzo = zzo(11, zzn);
        Bundle bundle2 = (Bundle) zzj.zza(zzo, Bundle.CREATOR);
        zzo.recycle();
        return bundle2;
    }

    public final Bundle zzk(int i10, String str, String str2, Bundle bundle) {
        Parcel zzn = zzn();
        zzn.writeInt(3);
        zzn.writeString(str);
        zzn.writeString(str2);
        zzj.zzb(zzn, bundle);
        Parcel zzo = zzo(2, zzn);
        Bundle bundle2 = (Bundle) zzj.zza(zzo, Bundle.CREATOR);
        zzo.recycle();
        return bundle2;
    }

    public final Bundle zzl(int i10, String str, String str2, Bundle bundle, Bundle bundle2) {
        Parcel zzn = zzn();
        zzn.writeInt(i10);
        zzn.writeString(str);
        zzn.writeString(str2);
        zzj.zzb(zzn, bundle);
        zzj.zzb(zzn, bundle2);
        Parcel zzo = zzo(901, zzn);
        Bundle bundle3 = (Bundle) zzj.zza(zzo, Bundle.CREATOR);
        zzo.recycle();
        return bundle3;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.google.android.gms.internal.play_billing.zzg, android.os.IBinder] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzm(int r2, java.lang.String r3, android.os.Bundle r4, com.google.android.gms.internal.play_billing.zzg r5) {
        /*
            r1 = this;
            android.os.Parcel r2 = r1.zzn()
            r0 = 12
            r2.writeInt(r0)
            r2.writeString(r3)
            com.google.android.gms.internal.play_billing.zzj.zzb(r2, r4)
            r2.writeStrongBinder(r5)
            r3 = 1201(0x4b1, float:1.683E-42)
            r1.zzp(r3, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzc.zzm(int, java.lang.String, android.os.Bundle, com.google.android.gms.internal.play_billing.zzg):void");
    }

    public final int zzq(int i10, String str, String str2) {
        Parcel zzn = zzn();
        zzn.writeInt(i10);
        zzn.writeString(str);
        zzn.writeString(str2);
        Parcel zzo = zzo(1, zzn);
        int readInt = zzo.readInt();
        zzo.recycle();
        return readInt;
    }
}
