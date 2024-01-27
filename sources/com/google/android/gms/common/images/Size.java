package com.google.android.gms.common.images;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class Size {
    private final int zaa;
    private final int zab;

    public Size(int i10, int i11) {
        this.zaa = i10;
        this.zab = i11;
    }

    public static Size parseSize(String str) {
        if (str != null) {
            int indexOf = str.indexOf(42);
            if (indexOf < 0) {
                indexOf = str.indexOf(120);
            }
            if (indexOf >= 0) {
                try {
                    return new Size(Integer.parseInt(str.substring(0, indexOf)), Integer.parseInt(str.substring(indexOf + 1)));
                } catch (NumberFormatException unused) {
                    throw zaa(str);
                }
            } else {
                throw zaa(str);
            }
        } else {
            throw new IllegalArgumentException("string must not be null");
        }
    }

    private static NumberFormatException zaa(String str) {
        StringBuilder sb = new StringBuilder(str.length() + 16);
        sb.append("Invalid Size: \"");
        sb.append(str);
        sb.append("\"");
        throw new NumberFormatException(sb.toString());
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof Size) {
            Size size = (Size) obj;
            return this.zaa == size.zaa && this.zab == size.zab;
        }
    }

    public int getHeight() {
        return this.zab;
    }

    public int getWidth() {
        return this.zaa;
    }

    public int hashCode() {
        int i10 = this.zab;
        int i11 = this.zaa;
        return i10 ^ ((i11 >>> 16) | (i11 << 16));
    }

    public String toString() {
        int i10 = this.zaa;
        int i11 = this.zab;
        StringBuilder sb = new StringBuilder(23);
        sb.append(i10);
        sb.append("x");
        sb.append(i11);
        return sb.toString();
    }
}
