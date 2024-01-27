package com.google.android.gms.common.server.response;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.JsonUtils;
import com.google.android.gms.common.util.MapUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@KeepForSdk
@SafeParcelable.Class(creator = "SafeParcelResponseCreator")
@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class SafeParcelResponse extends FastSafeParcelableJsonResponse {
    @KeepForSdk
    public static final Parcelable.Creator<SafeParcelResponse> CREATOR = new zaq();
    @SafeParcelable.VersionField(getter = "getVersionCode", id = 1)
    private final int zaa;
    @SafeParcelable.Field(getter = "getParcel", id = 2)
    private final Parcel zab;
    private final int zac;
    @SafeParcelable.Field(getter = "getFieldMappingDictionary", id = 3)
    private final zan zad;
    private final String zae;
    private int zaf;
    private int zag;

    @SafeParcelable.Constructor
    SafeParcelResponse(@SafeParcelable.Param(id = 1) int i10, @SafeParcelable.Param(id = 2) Parcel parcel, @SafeParcelable.Param(id = 3) zan zan) {
        this.zaa = i10;
        this.zab = (Parcel) Preconditions.checkNotNull(parcel);
        this.zac = 2;
        this.zad = zan;
        this.zae = zan == null ? null : zan.zaa();
        this.zaf = 2;
    }

    @KeepForSdk
    public static <T extends FastJsonResponse & SafeParcelable> SafeParcelResponse from(T t10) {
        zan zan = new zan(t10.getClass());
        zaF(zan, t10);
        zan.zac();
        zan.zad();
        return new SafeParcelResponse((SafeParcelable) t10, zan, (String) Preconditions.checkNotNull(t10.getClass().getCanonicalName()));
    }

    private static void zaF(zan zan, FastJsonResponse fastJsonResponse) {
        String str;
        String str2;
        Class<?> cls = fastJsonResponse.getClass();
        if (!zan.zaf(cls)) {
            Map<String, FastJsonResponse.Field<?, ?>> fieldMappings = fastJsonResponse.getFieldMappings();
            zan.zae(cls, fieldMappings);
            for (String str3 : fieldMappings.keySet()) {
                FastJsonResponse.Field field = fieldMappings.get(str3);
                Class<? extends FastJsonResponse> cls2 = field.zag;
                if (cls2 != null) {
                    try {
                        zaF(zan, (FastJsonResponse) cls2.newInstance());
                    } catch (InstantiationException e10) {
                        String valueOf = String.valueOf(((Class) Preconditions.checkNotNull(field.zag)).getCanonicalName());
                        if (valueOf.length() != 0) {
                            str = "Could not instantiate an object of type ".concat(valueOf);
                        } else {
                            str = new String("Could not instantiate an object of type ");
                        }
                        throw new IllegalStateException(str, e10);
                    } catch (IllegalAccessException e11) {
                        String valueOf2 = String.valueOf(((Class) Preconditions.checkNotNull(field.zag)).getCanonicalName());
                        if (valueOf2.length() != 0) {
                            str2 = "Could not access object of type ".concat(valueOf2);
                        } else {
                            str2 = new String("Could not access object of type ");
                        }
                        throw new IllegalStateException(str2, e11);
                    }
                }
            }
        }
    }

    private final void zaG(FastJsonResponse.Field<?, ?> field) {
        if (field.zaf != -1) {
            Parcel parcel = this.zab;
            if (parcel != null) {
                int i10 = this.zaf;
                if (i10 == 0) {
                    this.zag = SafeParcelWriter.beginObjectHeader(parcel);
                    this.zaf = 1;
                } else if (i10 != 1) {
                    throw new IllegalStateException("Attempted to parse JSON with a SafeParcelResponse object that is already filled with data.");
                }
            } else {
                throw new IllegalStateException("Internal Parcel object is null.");
            }
        } else {
            throw new IllegalStateException("Field does not have a valid safe parcelable field id.");
        }
    }

    private final void zaH(StringBuilder sb, Map<String, FastJsonResponse.Field<?, ?>> map, Parcel parcel) {
        SparseArray sparseArray = new SparseArray();
        for (Map.Entry next : map.entrySet()) {
            sparseArray.put(((FastJsonResponse.Field) next.getValue()).getSafeParcelableFieldId(), next);
        }
        sb.append('{');
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        boolean z10 = false;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            Map.Entry entry = (Map.Entry) sparseArray.get(SafeParcelReader.getFieldId(readHeader));
            if (entry != null) {
                if (z10) {
                    sb.append(",");
                }
                FastJsonResponse.Field field = (FastJsonResponse.Field) entry.getValue();
                sb.append("\"");
                sb.append((String) entry.getKey());
                sb.append("\":");
                if (field.zaj()) {
                    int i10 = field.zac;
                    switch (i10) {
                        case 0:
                            zaJ(sb, field, FastJsonResponse.zaD(field, Integer.valueOf(SafeParcelReader.readInt(parcel, readHeader))));
                            break;
                        case 1:
                            zaJ(sb, field, FastJsonResponse.zaD(field, SafeParcelReader.createBigInteger(parcel, readHeader)));
                            break;
                        case 2:
                            zaJ(sb, field, FastJsonResponse.zaD(field, Long.valueOf(SafeParcelReader.readLong(parcel, readHeader))));
                            break;
                        case 3:
                            zaJ(sb, field, FastJsonResponse.zaD(field, Float.valueOf(SafeParcelReader.readFloat(parcel, readHeader))));
                            break;
                        case 4:
                            zaJ(sb, field, FastJsonResponse.zaD(field, Double.valueOf(SafeParcelReader.readDouble(parcel, readHeader))));
                            break;
                        case 5:
                            zaJ(sb, field, FastJsonResponse.zaD(field, SafeParcelReader.createBigDecimal(parcel, readHeader)));
                            break;
                        case 6:
                            zaJ(sb, field, FastJsonResponse.zaD(field, Boolean.valueOf(SafeParcelReader.readBoolean(parcel, readHeader))));
                            break;
                        case 7:
                            zaJ(sb, field, FastJsonResponse.zaD(field, SafeParcelReader.createString(parcel, readHeader)));
                            break;
                        case 8:
                        case 9:
                            zaJ(sb, field, FastJsonResponse.zaD(field, SafeParcelReader.createByteArray(parcel, readHeader)));
                            break;
                        case 10:
                            Bundle createBundle = SafeParcelReader.createBundle(parcel, readHeader);
                            HashMap hashMap = new HashMap();
                            for (String str : createBundle.keySet()) {
                                hashMap.put(str, (String) Preconditions.checkNotNull(createBundle.getString(str)));
                            }
                            zaJ(sb, field, FastJsonResponse.zaD(field, hashMap));
                            break;
                        case 11:
                            throw new IllegalArgumentException("Method does not accept concrete type.");
                        default:
                            StringBuilder sb2 = new StringBuilder(36);
                            sb2.append("Unknown field out type = ");
                            sb2.append(i10);
                            throw new IllegalArgumentException(sb2.toString());
                    }
                } else if (field.zad) {
                    sb.append("[");
                    switch (field.zac) {
                        case 0:
                            ArrayUtils.writeArray(sb, SafeParcelReader.createIntArray(parcel, readHeader));
                            break;
                        case 1:
                            ArrayUtils.writeArray(sb, (T[]) SafeParcelReader.createBigIntegerArray(parcel, readHeader));
                            break;
                        case 2:
                            ArrayUtils.writeArray(sb, SafeParcelReader.createLongArray(parcel, readHeader));
                            break;
                        case 3:
                            ArrayUtils.writeArray(sb, SafeParcelReader.createFloatArray(parcel, readHeader));
                            break;
                        case 4:
                            ArrayUtils.writeArray(sb, SafeParcelReader.createDoubleArray(parcel, readHeader));
                            break;
                        case 5:
                            ArrayUtils.writeArray(sb, (T[]) SafeParcelReader.createBigDecimalArray(parcel, readHeader));
                            break;
                        case 6:
                            ArrayUtils.writeArray(sb, SafeParcelReader.createBooleanArray(parcel, readHeader));
                            break;
                        case 7:
                            ArrayUtils.writeStringArray(sb, SafeParcelReader.createStringArray(parcel, readHeader));
                            break;
                        case 8:
                        case 9:
                        case 10:
                            throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                        case 11:
                            Parcel[] createParcelArray = SafeParcelReader.createParcelArray(parcel, readHeader);
                            int length = createParcelArray.length;
                            for (int i11 = 0; i11 < length; i11++) {
                                if (i11 > 0) {
                                    sb.append(",");
                                }
                                createParcelArray[i11].setDataPosition(0);
                                zaH(sb, field.zah(), createParcelArray[i11]);
                            }
                            break;
                        default:
                            throw new IllegalStateException("Unknown field type out.");
                    }
                    sb.append("]");
                } else {
                    switch (field.zac) {
                        case 0:
                            sb.append(SafeParcelReader.readInt(parcel, readHeader));
                            break;
                        case 1:
                            sb.append(SafeParcelReader.createBigInteger(parcel, readHeader));
                            break;
                        case 2:
                            sb.append(SafeParcelReader.readLong(parcel, readHeader));
                            break;
                        case 3:
                            sb.append(SafeParcelReader.readFloat(parcel, readHeader));
                            break;
                        case 4:
                            sb.append(SafeParcelReader.readDouble(parcel, readHeader));
                            break;
                        case 5:
                            sb.append(SafeParcelReader.createBigDecimal(parcel, readHeader));
                            break;
                        case 6:
                            sb.append(SafeParcelReader.readBoolean(parcel, readHeader));
                            break;
                        case 7:
                            String createString = SafeParcelReader.createString(parcel, readHeader);
                            sb.append("\"");
                            sb.append(JsonUtils.escapeString(createString));
                            sb.append("\"");
                            break;
                        case 8:
                            byte[] createByteArray = SafeParcelReader.createByteArray(parcel, readHeader);
                            sb.append("\"");
                            sb.append(Base64Utils.encode(createByteArray));
                            sb.append("\"");
                            break;
                        case 9:
                            byte[] createByteArray2 = SafeParcelReader.createByteArray(parcel, readHeader);
                            sb.append("\"");
                            sb.append(Base64Utils.encodeUrlSafe(createByteArray2));
                            sb.append("\"");
                            break;
                        case 10:
                            Bundle createBundle2 = SafeParcelReader.createBundle(parcel, readHeader);
                            Set<String> keySet = createBundle2.keySet();
                            sb.append("{");
                            boolean z11 = true;
                            for (String str2 : keySet) {
                                if (!z11) {
                                    sb.append(",");
                                }
                                sb.append("\"");
                                sb.append(str2);
                                sb.append("\":\"");
                                sb.append(JsonUtils.escapeString(createBundle2.getString(str2)));
                                sb.append("\"");
                                z11 = false;
                            }
                            sb.append("}");
                            break;
                        case 11:
                            Parcel createParcel = SafeParcelReader.createParcel(parcel, readHeader);
                            createParcel.setDataPosition(0);
                            zaH(sb, field.zah(), createParcel);
                            break;
                        default:
                            throw new IllegalStateException("Unknown field type out");
                    }
                }
                z10 = true;
            }
        }
        if (parcel.dataPosition() == validateObjectHeader) {
            sb.append('}');
            return;
        }
        StringBuilder sb3 = new StringBuilder(37);
        sb3.append("Overread allowed size end=");
        sb3.append(validateObjectHeader);
        throw new SafeParcelReader.ParseException(sb3.toString(), parcel);
    }

    private static final void zaI(StringBuilder sb, int i10, Object obj) {
        switch (i10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                sb.append(obj);
                return;
            case 7:
                sb.append("\"");
                sb.append(JsonUtils.escapeString(Preconditions.checkNotNull(obj).toString()));
                sb.append("\"");
                return;
            case 8:
                sb.append("\"");
                sb.append(Base64Utils.encode((byte[]) obj));
                sb.append("\"");
                return;
            case 9:
                sb.append("\"");
                sb.append(Base64Utils.encodeUrlSafe((byte[]) obj));
                sb.append("\"");
                return;
            case 10:
                MapUtils.writeStringMapToJson(sb, (HashMap) Preconditions.checkNotNull(obj));
                return;
            case 11:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                StringBuilder sb2 = new StringBuilder(26);
                sb2.append("Unknown type = ");
                sb2.append(i10);
                throw new IllegalArgumentException(sb2.toString());
        }
    }

    private static final void zaJ(StringBuilder sb, FastJsonResponse.Field<?, ?> field, Object obj) {
        if (field.zab) {
            ArrayList arrayList = (ArrayList) obj;
            sb.append("[");
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (i10 != 0) {
                    sb.append(",");
                }
                zaI(sb, field.zaa, arrayList.get(i10));
            }
            sb.append("]");
            return;
        }
        zaI(sb, field.zaa, obj);
    }

    public final <T extends FastJsonResponse> void addConcreteTypeArrayInternal(FastJsonResponse.Field field, String str, ArrayList<T> arrayList) {
        zaG(field);
        ArrayList arrayList2 = new ArrayList();
        ((ArrayList) Preconditions.checkNotNull(arrayList)).size();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList2.add(((SafeParcelResponse) ((FastJsonResponse) arrayList.get(i10))).zaE());
        }
        SafeParcelWriter.writeParcelList(this.zab, field.getSafeParcelableFieldId(), arrayList2, true);
    }

    public final <T extends FastJsonResponse> void addConcreteTypeInternal(FastJsonResponse.Field field, String str, T t10) {
        zaG(field);
        SafeParcelWriter.writeParcel(this.zab, field.getSafeParcelableFieldId(), ((SafeParcelResponse) t10).zaE(), true);
    }

    public final Map<String, FastJsonResponse.Field<?, ?>> getFieldMappings() {
        zan zan = this.zad;
        if (zan == null) {
            return null;
        }
        return zan.zab((String) Preconditions.checkNotNull(this.zae));
    }

    public final Object getValueObject(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    public final boolean isPrimitiveFieldSet(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    /* access modifiers changed from: protected */
    public final void setBooleanInternal(FastJsonResponse.Field<?, ?> field, String str, boolean z10) {
        zaG(field);
        SafeParcelWriter.writeBoolean(this.zab, field.getSafeParcelableFieldId(), z10);
    }

    /* access modifiers changed from: protected */
    public final void setDecodedBytesInternal(FastJsonResponse.Field<?, ?> field, String str, byte[] bArr) {
        zaG(field);
        SafeParcelWriter.writeByteArray(this.zab, field.getSafeParcelableFieldId(), bArr, true);
    }

    /* access modifiers changed from: protected */
    public final void setIntegerInternal(FastJsonResponse.Field<?, ?> field, String str, int i10) {
        zaG(field);
        SafeParcelWriter.writeInt(this.zab, field.getSafeParcelableFieldId(), i10);
    }

    /* access modifiers changed from: protected */
    public final void setLongInternal(FastJsonResponse.Field<?, ?> field, String str, long j10) {
        zaG(field);
        SafeParcelWriter.writeLong(this.zab, field.getSafeParcelableFieldId(), j10);
    }

    /* access modifiers changed from: protected */
    public final void setStringInternal(FastJsonResponse.Field<?, ?> field, String str, String str2) {
        zaG(field);
        SafeParcelWriter.writeString(this.zab, field.getSafeParcelableFieldId(), str2, true);
    }

    /* access modifiers changed from: protected */
    public final void setStringMapInternal(FastJsonResponse.Field<?, ?> field, String str, Map<String, String> map) {
        zaG(field);
        Bundle bundle = new Bundle();
        for (String str2 : ((Map) Preconditions.checkNotNull(map)).keySet()) {
            bundle.putString(str2, map.get(str2));
        }
        SafeParcelWriter.writeBundle(this.zab, field.getSafeParcelableFieldId(), bundle, true);
    }

    /* access modifiers changed from: protected */
    public final void setStringsInternal(FastJsonResponse.Field<?, ?> field, String str, ArrayList<String> arrayList) {
        zaG(field);
        int size = ((ArrayList) Preconditions.checkNotNull(arrayList)).size();
        String[] strArr = new String[size];
        for (int i10 = 0; i10 < size; i10++) {
            strArr[i10] = arrayList.get(i10);
        }
        SafeParcelWriter.writeStringArray(this.zab, field.getSafeParcelableFieldId(), strArr, true);
    }

    public final String toString() {
        Preconditions.checkNotNull(this.zad, "Cannot convert to JSON on client side.");
        Parcel zaE = zaE();
        zaE.setDataPosition(0);
        StringBuilder sb = new StringBuilder(100);
        zaH(sb, (Map) Preconditions.checkNotNull(this.zad.zab((String) Preconditions.checkNotNull(this.zae))), zaE);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        zan zan;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zaa);
        SafeParcelWriter.writeParcel(parcel, 2, zaE(), false);
        int i11 = this.zac;
        if (i11 != 0) {
            zan = i11 != 1 ? this.zad : this.zad;
        } else {
            zan = null;
        }
        SafeParcelWriter.writeParcelable(parcel, 3, zan, i10, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final Parcel zaE() {
        int i10 = this.zaf;
        if (i10 == 0) {
            int beginObjectHeader = SafeParcelWriter.beginObjectHeader(this.zab);
            this.zag = beginObjectHeader;
            SafeParcelWriter.finishObjectHeader(this.zab, beginObjectHeader);
            this.zaf = 2;
        } else if (i10 == 1) {
            SafeParcelWriter.finishObjectHeader(this.zab, this.zag);
            this.zaf = 2;
        }
        return this.zab;
    }

    /* access modifiers changed from: protected */
    public final void zab(FastJsonResponse.Field<?, ?> field, String str, BigDecimal bigDecimal) {
        zaG(field);
        SafeParcelWriter.writeBigDecimal(this.zab, field.getSafeParcelableFieldId(), bigDecimal, true);
    }

    /* access modifiers changed from: protected */
    public final void zad(FastJsonResponse.Field<?, ?> field, String str, ArrayList<BigDecimal> arrayList) {
        zaG(field);
        int size = ((ArrayList) Preconditions.checkNotNull(arrayList)).size();
        BigDecimal[] bigDecimalArr = new BigDecimal[size];
        for (int i10 = 0; i10 < size; i10++) {
            bigDecimalArr[i10] = arrayList.get(i10);
        }
        SafeParcelWriter.writeBigDecimalArray(this.zab, field.getSafeParcelableFieldId(), bigDecimalArr, true);
    }

    /* access modifiers changed from: protected */
    public final void zaf(FastJsonResponse.Field<?, ?> field, String str, BigInteger bigInteger) {
        zaG(field);
        SafeParcelWriter.writeBigInteger(this.zab, field.getSafeParcelableFieldId(), bigInteger, true);
    }

    /* access modifiers changed from: protected */
    public final void zah(FastJsonResponse.Field<?, ?> field, String str, ArrayList<BigInteger> arrayList) {
        zaG(field);
        int size = ((ArrayList) Preconditions.checkNotNull(arrayList)).size();
        BigInteger[] bigIntegerArr = new BigInteger[size];
        for (int i10 = 0; i10 < size; i10++) {
            bigIntegerArr[i10] = arrayList.get(i10);
        }
        SafeParcelWriter.writeBigIntegerArray(this.zab, field.getSafeParcelableFieldId(), bigIntegerArr, true);
    }

    /* access modifiers changed from: protected */
    public final void zak(FastJsonResponse.Field<?, ?> field, String str, ArrayList<Boolean> arrayList) {
        zaG(field);
        int size = ((ArrayList) Preconditions.checkNotNull(arrayList)).size();
        boolean[] zArr = new boolean[size];
        for (int i10 = 0; i10 < size; i10++) {
            zArr[i10] = arrayList.get(i10).booleanValue();
        }
        SafeParcelWriter.writeBooleanArray(this.zab, field.getSafeParcelableFieldId(), zArr, true);
    }

    /* access modifiers changed from: protected */
    public final void zan(FastJsonResponse.Field<?, ?> field, String str, double d10) {
        zaG(field);
        SafeParcelWriter.writeDouble(this.zab, field.getSafeParcelableFieldId(), d10);
    }

    /* access modifiers changed from: protected */
    public final void zap(FastJsonResponse.Field<?, ?> field, String str, ArrayList<Double> arrayList) {
        zaG(field);
        int size = ((ArrayList) Preconditions.checkNotNull(arrayList)).size();
        double[] dArr = new double[size];
        for (int i10 = 0; i10 < size; i10++) {
            dArr[i10] = arrayList.get(i10).doubleValue();
        }
        SafeParcelWriter.writeDoubleArray(this.zab, field.getSafeParcelableFieldId(), dArr, true);
    }

    /* access modifiers changed from: protected */
    public final void zar(FastJsonResponse.Field<?, ?> field, String str, float f10) {
        zaG(field);
        SafeParcelWriter.writeFloat(this.zab, field.getSafeParcelableFieldId(), f10);
    }

    /* access modifiers changed from: protected */
    public final void zat(FastJsonResponse.Field<?, ?> field, String str, ArrayList<Float> arrayList) {
        zaG(field);
        int size = ((ArrayList) Preconditions.checkNotNull(arrayList)).size();
        float[] fArr = new float[size];
        for (int i10 = 0; i10 < size; i10++) {
            fArr[i10] = arrayList.get(i10).floatValue();
        }
        SafeParcelWriter.writeFloatArray(this.zab, field.getSafeParcelableFieldId(), fArr, true);
    }

    /* access modifiers changed from: protected */
    public final void zaw(FastJsonResponse.Field<?, ?> field, String str, ArrayList<Integer> arrayList) {
        zaG(field);
        int size = ((ArrayList) Preconditions.checkNotNull(arrayList)).size();
        int[] iArr = new int[size];
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = arrayList.get(i10).intValue();
        }
        SafeParcelWriter.writeIntArray(this.zab, field.getSafeParcelableFieldId(), iArr, true);
    }

    /* access modifiers changed from: protected */
    public final void zaz(FastJsonResponse.Field<?, ?> field, String str, ArrayList<Long> arrayList) {
        zaG(field);
        int size = ((ArrayList) Preconditions.checkNotNull(arrayList)).size();
        long[] jArr = new long[size];
        for (int i10 = 0; i10 < size; i10++) {
            jArr[i10] = arrayList.get(i10).longValue();
        }
        SafeParcelWriter.writeLongArray(this.zab, field.getSafeParcelableFieldId(), jArr, true);
    }

    private SafeParcelResponse(SafeParcelable safeParcelable, zan zan, String str) {
        this.zaa = 1;
        Parcel obtain = Parcel.obtain();
        this.zab = obtain;
        safeParcelable.writeToParcel(obtain, 0);
        this.zac = 1;
        this.zad = (zan) Preconditions.checkNotNull(zan);
        this.zae = (String) Preconditions.checkNotNull(str);
        this.zaf = 2;
    }

    public SafeParcelResponse(zan zan, String str) {
        this.zaa = 1;
        this.zab = Parcel.obtain();
        this.zac = 0;
        this.zad = (zan) Preconditions.checkNotNull(zan);
        this.zae = (String) Preconditions.checkNotNull(str);
        this.zaf = 0;
    }
}
