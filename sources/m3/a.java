package m3;

import com.facebook.internal.security.OidcSecurityUtil;
import java.net.URL;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.y;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ URL f15715h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ y f15716i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ String f15717j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ ReentrantLock f15718k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ Condition f15719l;

    public /* synthetic */ a(URL url, y yVar, String str, ReentrantLock reentrantLock, Condition condition) {
        this.f15715h = url;
        this.f15716i = yVar;
        this.f15717j = str;
        this.f15718k = reentrantLock;
        this.f15719l = condition;
    }

    public final void run() {
        OidcSecurityUtil.m128getRawKeyFromEndPoint$lambda1(this.f15715h, this.f15716i, this.f15717j, this.f15718k, this.f15719l);
    }
}
