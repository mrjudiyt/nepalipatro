package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public enum zzgxj {
    DOUBLE(zzgxk.DOUBLE, 1),
    FLOAT(zzgxk.FLOAT, 5),
    INT64(r5, 0),
    UINT64(r5, 0),
    INT32(r11, 0),
    FIXED64(r5, 1),
    FIXED32(r11, 5),
    BOOL(zzgxk.BOOLEAN, 0),
    STRING(zzgxk.STRING, 2),
    GROUP(r13, 3),
    MESSAGE(r13, 2),
    BYTES(zzgxk.BYTE_STRING, 2),
    UINT32(r11, 0),
    ENUM(zzgxk.ENUM, 0),
    SFIXED32(r11, 5),
    SFIXED64(r5, 1),
    SINT32(r11, 0),
    SINT64(r5, 0);
    
    private final zzgxk zzt;

    private zzgxj(zzgxk zzgxk, int i10) {
        this.zzt = zzgxk;
    }

    public final zzgxk zza() {
        return this.zzt;
    }
}
