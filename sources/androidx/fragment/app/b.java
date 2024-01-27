package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.w;
import androidx.lifecycle.h;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* compiled from: BackStackState */
final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: h  reason: collision with root package name */
    final int[] f3086h;

    /* renamed from: i  reason: collision with root package name */
    final ArrayList<String> f3087i;

    /* renamed from: j  reason: collision with root package name */
    final int[] f3088j;

    /* renamed from: k  reason: collision with root package name */
    final int[] f3089k;

    /* renamed from: l  reason: collision with root package name */
    final int f3090l;

    /* renamed from: m  reason: collision with root package name */
    final String f3091m;

    /* renamed from: n  reason: collision with root package name */
    final int f3092n;

    /* renamed from: o  reason: collision with root package name */
    final int f3093o;

    /* renamed from: p  reason: collision with root package name */
    final CharSequence f3094p;

    /* renamed from: q  reason: collision with root package name */
    final int f3095q;

    /* renamed from: r  reason: collision with root package name */
    final CharSequence f3096r;

    /* renamed from: s  reason: collision with root package name */
    final ArrayList<String> f3097s;

    /* renamed from: t  reason: collision with root package name */
    final ArrayList<String> f3098t;

    /* renamed from: u  reason: collision with root package name */
    final boolean f3099u;

    /* compiled from: BackStackState */
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

    public b(a aVar) {
        int size = aVar.f3309c.size();
        this.f3086h = new int[(size * 5)];
        if (aVar.f3315i) {
            this.f3087i = new ArrayList<>(size);
            this.f3088j = new int[size];
            this.f3089k = new int[size];
            int i10 = 0;
            int i11 = 0;
            while (i10 < size) {
                w.a aVar2 = aVar.f3309c.get(i10);
                int i12 = i11 + 1;
                this.f3086h[i11] = aVar2.f3326a;
                ArrayList<String> arrayList = this.f3087i;
                Fragment fragment = aVar2.f3327b;
                arrayList.add(fragment != null ? fragment.mWho : null);
                int[] iArr = this.f3086h;
                int i13 = i12 + 1;
                iArr[i12] = aVar2.f3328c;
                int i14 = i13 + 1;
                iArr[i13] = aVar2.f3329d;
                int i15 = i14 + 1;
                iArr[i14] = aVar2.f3330e;
                iArr[i15] = aVar2.f3331f;
                this.f3088j[i10] = aVar2.f3332g.ordinal();
                this.f3089k[i10] = aVar2.f3333h.ordinal();
                i10++;
                i11 = i15 + 1;
            }
            this.f3090l = aVar.f3314h;
            this.f3091m = aVar.f3317k;
            this.f3092n = aVar.f3081v;
            this.f3093o = aVar.f3318l;
            this.f3094p = aVar.f3319m;
            this.f3095q = aVar.f3320n;
            this.f3096r = aVar.f3321o;
            this.f3097s = aVar.f3322p;
            this.f3098t = aVar.f3323q;
            this.f3099u = aVar.f3324r;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    public a b(n nVar) {
        a aVar = new a(nVar);
        int i10 = 0;
        int i11 = 0;
        while (i10 < this.f3086h.length) {
            w.a aVar2 = new w.a();
            int i12 = i10 + 1;
            aVar2.f3326a = this.f3086h[i10];
            if (n.F0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Instantiate ");
                sb.append(aVar);
                sb.append(" op #");
                sb.append(i11);
                sb.append(" base fragment #");
                sb.append(this.f3086h[i12]);
            }
            String str = this.f3087i.get(i11);
            if (str != null) {
                aVar2.f3327b = nVar.g0(str);
            } else {
                aVar2.f3327b = null;
            }
            aVar2.f3332g = h.b.values()[this.f3088j[i11]];
            aVar2.f3333h = h.b.values()[this.f3089k[i11]];
            int[] iArr = this.f3086h;
            int i13 = i12 + 1;
            int i14 = iArr[i12];
            aVar2.f3328c = i14;
            int i15 = i13 + 1;
            int i16 = iArr[i13];
            aVar2.f3329d = i16;
            int i17 = i15 + 1;
            int i18 = iArr[i15];
            aVar2.f3330e = i18;
            int i19 = iArr[i17];
            aVar2.f3331f = i19;
            aVar.f3310d = i14;
            aVar.f3311e = i16;
            aVar.f3312f = i18;
            aVar.f3313g = i19;
            aVar.e(aVar2);
            i11++;
            i10 = i17 + 1;
        }
        aVar.f3314h = this.f3090l;
        aVar.f3317k = this.f3091m;
        aVar.f3081v = this.f3092n;
        aVar.f3315i = true;
        aVar.f3318l = this.f3093o;
        aVar.f3319m = this.f3094p;
        aVar.f3320n = this.f3095q;
        aVar.f3321o = this.f3096r;
        aVar.f3322p = this.f3097s;
        aVar.f3323q = this.f3098t;
        aVar.f3324r = this.f3099u;
        aVar.n(1);
        return aVar;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeIntArray(this.f3086h);
        parcel.writeStringList(this.f3087i);
        parcel.writeIntArray(this.f3088j);
        parcel.writeIntArray(this.f3089k);
        parcel.writeInt(this.f3090l);
        parcel.writeString(this.f3091m);
        parcel.writeInt(this.f3092n);
        parcel.writeInt(this.f3093o);
        TextUtils.writeToParcel(this.f3094p, parcel, 0);
        parcel.writeInt(this.f3095q);
        TextUtils.writeToParcel(this.f3096r, parcel, 0);
        parcel.writeStringList(this.f3097s);
        parcel.writeStringList(this.f3098t);
        parcel.writeInt(this.f3099u ? 1 : 0);
    }

    public b(Parcel parcel) {
        this.f3086h = parcel.createIntArray();
        this.f3087i = parcel.createStringArrayList();
        this.f3088j = parcel.createIntArray();
        this.f3089k = parcel.createIntArray();
        this.f3090l = parcel.readInt();
        this.f3091m = parcel.readString();
        this.f3092n = parcel.readInt();
        this.f3093o = parcel.readInt();
        this.f3094p = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f3095q = parcel.readInt();
        this.f3096r = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f3097s = parcel.createStringArrayList();
        this.f3098t = parcel.createStringArrayList();
        this.f3099u = parcel.readInt() != 0;
    }
}
