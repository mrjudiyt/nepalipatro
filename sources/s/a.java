package s;

import java.util.Arrays;
import s.b;

/* compiled from: ArrayLinkedVariables */
public class a implements b.a {

    /* renamed from: l  reason: collision with root package name */
    private static float f11197l = 0.001f;

    /* renamed from: a  reason: collision with root package name */
    int f11198a = 0;

    /* renamed from: b  reason: collision with root package name */
    private final b f11199b;

    /* renamed from: c  reason: collision with root package name */
    protected final c f11200c;

    /* renamed from: d  reason: collision with root package name */
    private int f11201d = 8;

    /* renamed from: e  reason: collision with root package name */
    private i f11202e = null;

    /* renamed from: f  reason: collision with root package name */
    private int[] f11203f = new int[8];

    /* renamed from: g  reason: collision with root package name */
    private int[] f11204g = new int[8];

    /* renamed from: h  reason: collision with root package name */
    private float[] f11205h = new float[8];

    /* renamed from: i  reason: collision with root package name */
    private int f11206i = -1;

    /* renamed from: j  reason: collision with root package name */
    private int f11207j = -1;

    /* renamed from: k  reason: collision with root package name */
    private boolean f11208k = false;

    a(b bVar, c cVar) {
        this.f11199b = bVar;
        this.f11200c = cVar;
    }

    public final void a(i iVar, float f10) {
        if (f10 == 0.0f) {
            d(iVar, true);
            return;
        }
        int i10 = this.f11206i;
        if (i10 == -1) {
            this.f11206i = 0;
            this.f11205h[0] = f10;
            this.f11203f[0] = iVar.f11261j;
            this.f11204g[0] = -1;
            iVar.f11271t++;
            iVar.a(this.f11199b);
            this.f11198a++;
            if (!this.f11208k) {
                int i11 = this.f11207j + 1;
                this.f11207j = i11;
                int[] iArr = this.f11203f;
                if (i11 >= iArr.length) {
                    this.f11208k = true;
                    this.f11207j = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i12 = 0;
        int i13 = -1;
        while (i10 != -1 && i12 < this.f11198a) {
            int[] iArr2 = this.f11203f;
            int i14 = iArr2[i10];
            int i15 = iVar.f11261j;
            if (i14 == i15) {
                this.f11205h[i10] = f10;
                return;
            }
            if (iArr2[i10] < i15) {
                i13 = i10;
            }
            i10 = this.f11204g[i10];
            i12++;
        }
        int i16 = this.f11207j;
        int i17 = i16 + 1;
        if (this.f11208k) {
            int[] iArr3 = this.f11203f;
            if (iArr3[i16] != -1) {
                i16 = iArr3.length;
            }
        } else {
            i16 = i17;
        }
        int[] iArr4 = this.f11203f;
        if (i16 >= iArr4.length && this.f11198a < iArr4.length) {
            int i18 = 0;
            while (true) {
                int[] iArr5 = this.f11203f;
                if (i18 >= iArr5.length) {
                    break;
                } else if (iArr5[i18] == -1) {
                    i16 = i18;
                    break;
                } else {
                    i18++;
                }
            }
        }
        int[] iArr6 = this.f11203f;
        if (i16 >= iArr6.length) {
            i16 = iArr6.length;
            int i19 = this.f11201d * 2;
            this.f11201d = i19;
            this.f11208k = false;
            this.f11207j = i16 - 1;
            this.f11205h = Arrays.copyOf(this.f11205h, i19);
            this.f11203f = Arrays.copyOf(this.f11203f, this.f11201d);
            this.f11204g = Arrays.copyOf(this.f11204g, this.f11201d);
        }
        this.f11203f[i16] = iVar.f11261j;
        this.f11205h[i16] = f10;
        if (i13 != -1) {
            int[] iArr7 = this.f11204g;
            iArr7[i16] = iArr7[i13];
            iArr7[i13] = i16;
        } else {
            this.f11204g[i16] = this.f11206i;
            this.f11206i = i16;
        }
        iVar.f11271t++;
        iVar.a(this.f11199b);
        int i20 = this.f11198a + 1;
        this.f11198a = i20;
        if (!this.f11208k) {
            this.f11207j++;
        }
        int[] iArr8 = this.f11203f;
        if (i20 >= iArr8.length) {
            this.f11208k = true;
        }
        if (this.f11207j >= iArr8.length) {
            this.f11208k = true;
            this.f11207j = iArr8.length - 1;
        }
    }

    public int b() {
        return this.f11198a;
    }

    public float c(b bVar, boolean z10) {
        float f10 = f(bVar.f11209a);
        d(bVar.f11209a, z10);
        b.a aVar = bVar.f11213e;
        int b10 = aVar.b();
        for (int i10 = 0; i10 < b10; i10++) {
            i e10 = aVar.e(i10);
            k(e10, aVar.f(e10) * f10, z10);
        }
        return f10;
    }

    public final void clear() {
        int i10 = this.f11206i;
        int i11 = 0;
        while (i10 != -1 && i11 < this.f11198a) {
            i iVar = this.f11200c.f11218d[this.f11203f[i10]];
            if (iVar != null) {
                iVar.f(this.f11199b);
            }
            i10 = this.f11204g[i10];
            i11++;
        }
        this.f11206i = -1;
        this.f11207j = -1;
        this.f11208k = false;
        this.f11198a = 0;
    }

    public final float d(i iVar, boolean z10) {
        if (this.f11202e == iVar) {
            this.f11202e = null;
        }
        int i10 = this.f11206i;
        if (i10 == -1) {
            return 0.0f;
        }
        int i11 = 0;
        int i12 = -1;
        while (i10 != -1 && i11 < this.f11198a) {
            if (this.f11203f[i10] == iVar.f11261j) {
                if (i10 == this.f11206i) {
                    this.f11206i = this.f11204g[i10];
                } else {
                    int[] iArr = this.f11204g;
                    iArr[i12] = iArr[i10];
                }
                if (z10) {
                    iVar.f(this.f11199b);
                }
                iVar.f11271t--;
                this.f11198a--;
                this.f11203f[i10] = -1;
                if (this.f11208k) {
                    this.f11207j = i10;
                }
                return this.f11205h[i10];
            }
            i11++;
            i12 = i10;
            i10 = this.f11204g[i10];
        }
        return 0.0f;
    }

    public i e(int i10) {
        int i11 = this.f11206i;
        int i12 = 0;
        while (i11 != -1 && i12 < this.f11198a) {
            if (i12 == i10) {
                return this.f11200c.f11218d[this.f11203f[i11]];
            }
            i11 = this.f11204g[i11];
            i12++;
        }
        return null;
    }

    public final float f(i iVar) {
        int i10 = this.f11206i;
        int i11 = 0;
        while (i10 != -1 && i11 < this.f11198a) {
            if (this.f11203f[i10] == iVar.f11261j) {
                return this.f11205h[i10];
            }
            i10 = this.f11204g[i10];
            i11++;
        }
        return 0.0f;
    }

    public void g() {
        int i10 = this.f11206i;
        int i11 = 0;
        while (i10 != -1 && i11 < this.f11198a) {
            float[] fArr = this.f11205h;
            fArr[i10] = fArr[i10] * -1.0f;
            i10 = this.f11204g[i10];
            i11++;
        }
    }

    public float h(int i10) {
        int i11 = this.f11206i;
        int i12 = 0;
        while (i11 != -1 && i12 < this.f11198a) {
            if (i12 == i10) {
                return this.f11205h[i11];
            }
            i11 = this.f11204g[i11];
            i12++;
        }
        return 0.0f;
    }

    public boolean i(i iVar) {
        int i10 = this.f11206i;
        if (i10 == -1) {
            return false;
        }
        int i11 = 0;
        while (i10 != -1 && i11 < this.f11198a) {
            if (this.f11203f[i10] == iVar.f11261j) {
                return true;
            }
            i10 = this.f11204g[i10];
            i11++;
        }
        return false;
    }

    public void j(float f10) {
        int i10 = this.f11206i;
        int i11 = 0;
        while (i10 != -1 && i11 < this.f11198a) {
            float[] fArr = this.f11205h;
            fArr[i10] = fArr[i10] / f10;
            i10 = this.f11204g[i10];
            i11++;
        }
    }

    public void k(i iVar, float f10, boolean z10) {
        float f11 = f11197l;
        if (f10 <= (-f11) || f10 >= f11) {
            int i10 = this.f11206i;
            if (i10 == -1) {
                this.f11206i = 0;
                this.f11205h[0] = f10;
                this.f11203f[0] = iVar.f11261j;
                this.f11204g[0] = -1;
                iVar.f11271t++;
                iVar.a(this.f11199b);
                this.f11198a++;
                if (!this.f11208k) {
                    int i11 = this.f11207j + 1;
                    this.f11207j = i11;
                    int[] iArr = this.f11203f;
                    if (i11 >= iArr.length) {
                        this.f11208k = true;
                        this.f11207j = iArr.length - 1;
                        return;
                    }
                    return;
                }
                return;
            }
            int i12 = 0;
            int i13 = -1;
            while (i10 != -1 && i12 < this.f11198a) {
                int[] iArr2 = this.f11203f;
                int i14 = iArr2[i10];
                int i15 = iVar.f11261j;
                if (i14 == i15) {
                    float[] fArr = this.f11205h;
                    float f12 = fArr[i10] + f10;
                    float f13 = f11197l;
                    if (f12 > (-f13) && f12 < f13) {
                        f12 = 0.0f;
                    }
                    fArr[i10] = f12;
                    if (f12 == 0.0f) {
                        if (i10 == this.f11206i) {
                            this.f11206i = this.f11204g[i10];
                        } else {
                            int[] iArr3 = this.f11204g;
                            iArr3[i13] = iArr3[i10];
                        }
                        if (z10) {
                            iVar.f(this.f11199b);
                        }
                        if (this.f11208k) {
                            this.f11207j = i10;
                        }
                        iVar.f11271t--;
                        this.f11198a--;
                        return;
                    }
                    return;
                }
                if (iArr2[i10] < i15) {
                    i13 = i10;
                }
                i10 = this.f11204g[i10];
                i12++;
            }
            int i16 = this.f11207j;
            int i17 = i16 + 1;
            if (this.f11208k) {
                int[] iArr4 = this.f11203f;
                if (iArr4[i16] != -1) {
                    i16 = iArr4.length;
                }
            } else {
                i16 = i17;
            }
            int[] iArr5 = this.f11203f;
            if (i16 >= iArr5.length && this.f11198a < iArr5.length) {
                int i18 = 0;
                while (true) {
                    int[] iArr6 = this.f11203f;
                    if (i18 >= iArr6.length) {
                        break;
                    } else if (iArr6[i18] == -1) {
                        i16 = i18;
                        break;
                    } else {
                        i18++;
                    }
                }
            }
            int[] iArr7 = this.f11203f;
            if (i16 >= iArr7.length) {
                i16 = iArr7.length;
                int i19 = this.f11201d * 2;
                this.f11201d = i19;
                this.f11208k = false;
                this.f11207j = i16 - 1;
                this.f11205h = Arrays.copyOf(this.f11205h, i19);
                this.f11203f = Arrays.copyOf(this.f11203f, this.f11201d);
                this.f11204g = Arrays.copyOf(this.f11204g, this.f11201d);
            }
            this.f11203f[i16] = iVar.f11261j;
            this.f11205h[i16] = f10;
            if (i13 != -1) {
                int[] iArr8 = this.f11204g;
                iArr8[i16] = iArr8[i13];
                iArr8[i13] = i16;
            } else {
                this.f11204g[i16] = this.f11206i;
                this.f11206i = i16;
            }
            iVar.f11271t++;
            iVar.a(this.f11199b);
            this.f11198a++;
            if (!this.f11208k) {
                this.f11207j++;
            }
            int i20 = this.f11207j;
            int[] iArr9 = this.f11203f;
            if (i20 >= iArr9.length) {
                this.f11208k = true;
                this.f11207j = iArr9.length - 1;
            }
        }
    }

    public String toString() {
        int i10 = this.f11206i;
        String str = "";
        int i11 = 0;
        while (i10 != -1 && i11 < this.f11198a) {
            str = ((str + " -> ") + this.f11205h[i10] + " : ") + this.f11200c.f11218d[this.f11203f[i10]];
            i10 = this.f11204g[i10];
            i11++;
        }
        return str;
    }
}
