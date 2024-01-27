package x;

import android.view.View;
import t.c;
import t.f;

/* compiled from: ViewTimeCycle */
public abstract class e extends f {

    /* compiled from: ViewTimeCycle */
    public static class a extends e {
        public boolean b(View view, float f10, long j10, c cVar) {
            return this.f11512h;
        }

        public boolean c(View view, c cVar, float f10, long j10, double d10, double d11) {
            view.setRotation(a(f10, j10, view, cVar) + ((float) Math.toDegrees(Math.atan2(d11, d10))));
            return this.f11512h;
        }
    }

    public float a(float f10, long j10, View view, c cVar) {
        this.f11505a.c((double) f10, this.f11511g);
        float[] fArr = this.f11511g;
        float f11 = fArr[1];
        if (f11 == 0.0f) {
            this.f11512h = false;
            return fArr[2];
        } else if (Float.isNaN(this.f11514j)) {
            throw null;
        } else {
            this.f11514j = (float) ((((double) this.f11514j) + ((((double) (j10 - this.f11513i)) * 1.0E-9d) * ((double) f11))) % 1.0d);
            throw null;
        }
    }

    public abstract boolean b(View view, float f10, long j10, c cVar);
}
