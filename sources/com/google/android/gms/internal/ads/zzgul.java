package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public class zzgul extends IOException {
    private zzgvj zza = null;
    private boolean zzb;

    public zzgul(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    static zzguk zza() {
        return new zzguk("Protocol message tag had invalid wire type.");
    }

    static zzgul zzb() {
        return new zzgul("Protocol message end-group tag did not match expected tag.");
    }

    static zzgul zzc() {
        return new zzgul("Protocol message contained an invalid tag (zero).");
    }

    static zzgul zzd() {
        return new zzgul("Protocol message had invalid UTF-8.");
    }

    static zzgul zze() {
        return new zzgul("CodedInputStream encountered a malformed varint.");
    }

    static zzgul zzf() {
        return new zzgul("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static zzgul zzg() {
        return new zzgul("Failed to parse the message.");
    }

    static zzgul zzi() {
        return new zzgul("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    static zzgul zzj() {
        return new zzgul("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final zzgul zzh(zzgvj zzgvj) {
        this.zza = zzgvj;
        return this;
    }

    /* access modifiers changed from: package-private */
    public final void zzk() {
        this.zzb = true;
    }

    /* access modifiers changed from: package-private */
    public final boolean zzl() {
        return this.zzb;
    }

    public zzgul(String str) {
        super(str);
    }
}
