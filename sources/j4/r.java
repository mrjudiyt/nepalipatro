package j4;

import android.media.MediaDrm;
import com.google.android.exoplayer2.drm.n;
import com.google.android.exoplayer2.drm.o;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class r implements MediaDrm.OnEventListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o f15385a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ n.b f15386b;

    public /* synthetic */ r(o oVar, n.b bVar) {
        this.f15385a = oVar;
        this.f15386b = bVar;
    }

    public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
        this.f15385a.w(this.f15386b, mediaDrm, bArr, i10, i11, bArr2);
    }
}
