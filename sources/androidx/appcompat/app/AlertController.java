package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.g0;
import androidx.core.view.z;
import androidx.core.widget.NestedScrollView;
import f.j;
import java.lang.ref.WeakReference;

class AlertController {
    NestedScrollView A;
    private int B = 0;
    private Drawable C;
    private ImageView D;
    private TextView E;
    private TextView F;
    private View G;
    ListAdapter H;
    int I = -1;
    private int J;
    private int K;
    int L;
    int M;
    int N;
    int O;
    private boolean P;
    private int Q = 0;
    Handler R;
    private final View.OnClickListener S = new a();

    /* renamed from: a  reason: collision with root package name */
    private final Context f555a;

    /* renamed from: b  reason: collision with root package name */
    final g.f f556b;

    /* renamed from: c  reason: collision with root package name */
    private final Window f557c;

    /* renamed from: d  reason: collision with root package name */
    private final int f558d;

    /* renamed from: e  reason: collision with root package name */
    private CharSequence f559e;

    /* renamed from: f  reason: collision with root package name */
    private CharSequence f560f;

    /* renamed from: g  reason: collision with root package name */
    ListView f561g;

    /* renamed from: h  reason: collision with root package name */
    private View f562h;

    /* renamed from: i  reason: collision with root package name */
    private int f563i;

    /* renamed from: j  reason: collision with root package name */
    private int f564j;

    /* renamed from: k  reason: collision with root package name */
    private int f565k;

    /* renamed from: l  reason: collision with root package name */
    private int f566l;

    /* renamed from: m  reason: collision with root package name */
    private int f567m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f568n = false;

    /* renamed from: o  reason: collision with root package name */
    Button f569o;

    /* renamed from: p  reason: collision with root package name */
    private CharSequence f570p;

    /* renamed from: q  reason: collision with root package name */
    Message f571q;

    /* renamed from: r  reason: collision with root package name */
    private Drawable f572r;

    /* renamed from: s  reason: collision with root package name */
    Button f573s;

    /* renamed from: t  reason: collision with root package name */
    private CharSequence f574t;

    /* renamed from: u  reason: collision with root package name */
    Message f575u;

    /* renamed from: v  reason: collision with root package name */
    private Drawable f576v;

    /* renamed from: w  reason: collision with root package name */
    Button f577w;

    /* renamed from: x  reason: collision with root package name */
    private CharSequence f578x;

    /* renamed from: y  reason: collision with root package name */
    Message f579y;

    /* renamed from: z  reason: collision with root package name */
    private Drawable f580z;

    public static class RecycleListView extends ListView {

        /* renamed from: h  reason: collision with root package name */
        private final int f581h;

        /* renamed from: i  reason: collision with root package name */
        private final int f582i;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f8347f2);
            this.f582i = obtainStyledAttributes.getDimensionPixelOffset(j.f8352g2, -1);
            this.f581h = obtainStyledAttributes.getDimensionPixelOffset(j.f8357h2, -1);
        }

        public void a(boolean z10, boolean z11) {
            if (!z11 || !z10) {
                setPadding(getPaddingLeft(), z10 ? getPaddingTop() : this.f581h, getPaddingRight(), z11 ? getPaddingBottom() : this.f582i);
            }
        }
    }

    class a implements View.OnClickListener {
        a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
            r3 = r0.f579y;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onClick(android.view.View r3) {
            /*
                r2 = this;
                androidx.appcompat.app.AlertController r0 = androidx.appcompat.app.AlertController.this
                android.widget.Button r1 = r0.f569o
                if (r3 != r1) goto L_0x000f
                android.os.Message r1 = r0.f571q
                if (r1 == 0) goto L_0x000f
                android.os.Message r3 = android.os.Message.obtain(r1)
                goto L_0x002a
            L_0x000f:
                android.widget.Button r1 = r0.f573s
                if (r3 != r1) goto L_0x001c
                android.os.Message r1 = r0.f575u
                if (r1 == 0) goto L_0x001c
                android.os.Message r3 = android.os.Message.obtain(r1)
                goto L_0x002a
            L_0x001c:
                android.widget.Button r1 = r0.f577w
                if (r3 != r1) goto L_0x0029
                android.os.Message r3 = r0.f579y
                if (r3 == 0) goto L_0x0029
                android.os.Message r3 = android.os.Message.obtain(r3)
                goto L_0x002a
            L_0x0029:
                r3 = 0
            L_0x002a:
                if (r3 == 0) goto L_0x002f
                r3.sendToTarget()
            L_0x002f:
                androidx.appcompat.app.AlertController r3 = androidx.appcompat.app.AlertController.this
                android.os.Handler r0 = r3.R
                r1 = 1
                g.f r3 = r3.f556b
                android.os.Message r3 = r0.obtainMessage(r1, r3)
                r3.sendToTarget()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.a.onClick(android.view.View):void");
        }
    }

    class b implements NestedScrollView.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f584a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f585b;

        b(View view, View view2) {
            this.f584a = view;
            this.f585b = view2;
        }

        public void a(NestedScrollView nestedScrollView, int i10, int i11, int i12, int i13) {
            AlertController.f(nestedScrollView, this.f584a, this.f585b);
        }
    }

    class c implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ View f587h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ View f588i;

        c(View view, View view2) {
            this.f587h = view;
            this.f588i = view2;
        }

        public void run() {
            AlertController.f(AlertController.this.A, this.f587h, this.f588i);
        }
    }

    class d implements AbsListView.OnScrollListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f590a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f591b;

        d(View view, View view2) {
            this.f590a = view;
            this.f591b = view2;
        }

        public void onScroll(AbsListView absListView, int i10, int i11, int i12) {
            AlertController.f(absListView, this.f590a, this.f591b);
        }

        public void onScrollStateChanged(AbsListView absListView, int i10) {
        }
    }

    class e implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ View f593h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ View f594i;

        e(View view, View view2) {
            this.f593h = view;
            this.f594i = view2;
        }

        public void run() {
            AlertController.f(AlertController.this.f561g, this.f593h, this.f594i);
        }
    }

    public static class f {
        public int A;
        public int B;
        public int C;
        public int D;
        public boolean E = false;
        public boolean[] F;
        public boolean G;
        public boolean H;
        public int I = -1;
        public DialogInterface.OnMultiChoiceClickListener J;
        public Cursor K;
        public String L;
        public String M;
        public AdapterView.OnItemSelectedListener N;
        public e O;
        public boolean P = true;

        /* renamed from: a  reason: collision with root package name */
        public final Context f596a;

        /* renamed from: b  reason: collision with root package name */
        public final LayoutInflater f597b;

        /* renamed from: c  reason: collision with root package name */
        public int f598c = 0;

        /* renamed from: d  reason: collision with root package name */
        public Drawable f599d;

        /* renamed from: e  reason: collision with root package name */
        public int f600e = 0;

        /* renamed from: f  reason: collision with root package name */
        public CharSequence f601f;

        /* renamed from: g  reason: collision with root package name */
        public View f602g;

        /* renamed from: h  reason: collision with root package name */
        public CharSequence f603h;

        /* renamed from: i  reason: collision with root package name */
        public CharSequence f604i;

        /* renamed from: j  reason: collision with root package name */
        public Drawable f605j;

        /* renamed from: k  reason: collision with root package name */
        public DialogInterface.OnClickListener f606k;

        /* renamed from: l  reason: collision with root package name */
        public CharSequence f607l;

        /* renamed from: m  reason: collision with root package name */
        public Drawable f608m;

        /* renamed from: n  reason: collision with root package name */
        public DialogInterface.OnClickListener f609n;

        /* renamed from: o  reason: collision with root package name */
        public CharSequence f610o;

        /* renamed from: p  reason: collision with root package name */
        public Drawable f611p;

        /* renamed from: q  reason: collision with root package name */
        public DialogInterface.OnClickListener f612q;

        /* renamed from: r  reason: collision with root package name */
        public boolean f613r;

        /* renamed from: s  reason: collision with root package name */
        public DialogInterface.OnCancelListener f614s;

        /* renamed from: t  reason: collision with root package name */
        public DialogInterface.OnDismissListener f615t;

        /* renamed from: u  reason: collision with root package name */
        public DialogInterface.OnKeyListener f616u;

        /* renamed from: v  reason: collision with root package name */
        public CharSequence[] f617v;

        /* renamed from: w  reason: collision with root package name */
        public ListAdapter f618w;

        /* renamed from: x  reason: collision with root package name */
        public DialogInterface.OnClickListener f619x;

        /* renamed from: y  reason: collision with root package name */
        public int f620y;

        /* renamed from: z  reason: collision with root package name */
        public View f621z;

        class a extends ArrayAdapter<CharSequence> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ RecycleListView f622h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(Context context, int i10, int i11, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i10, i11, charSequenceArr);
                this.f622h = recycleListView;
            }

            public View getView(int i10, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i10, view, viewGroup);
                boolean[] zArr = f.this.F;
                if (zArr != null && zArr[i10]) {
                    this.f622h.setItemChecked(i10, true);
                }
                return view2;
            }
        }

        class b extends CursorAdapter {

            /* renamed from: h  reason: collision with root package name */
            private final int f624h;

            /* renamed from: i  reason: collision with root package name */
            private final int f625i;

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ RecycleListView f626j;

            /* renamed from: k  reason: collision with root package name */
            final /* synthetic */ AlertController f627k;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(Context context, Cursor cursor, boolean z10, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z10);
                this.f626j = recycleListView;
                this.f627k = alertController;
                Cursor cursor2 = getCursor();
                this.f624h = cursor2.getColumnIndexOrThrow(f.this.L);
                this.f625i = cursor2.getColumnIndexOrThrow(f.this.M);
            }

            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(16908308)).setText(cursor.getString(this.f624h));
                RecycleListView recycleListView = this.f626j;
                int position = cursor.getPosition();
                boolean z10 = true;
                if (cursor.getInt(this.f625i) != 1) {
                    z10 = false;
                }
                recycleListView.setItemChecked(position, z10);
            }

            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return f.this.f597b.inflate(this.f627k.M, viewGroup, false);
            }
        }

        class c implements AdapterView.OnItemClickListener {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ AlertController f629h;

            c(AlertController alertController) {
                this.f629h = alertController;
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
                f.this.f619x.onClick(this.f629h.f556b, i10);
                if (!f.this.H) {
                    this.f629h.f556b.dismiss();
                }
            }
        }

        class d implements AdapterView.OnItemClickListener {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ RecycleListView f631h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ AlertController f632i;

            d(RecycleListView recycleListView, AlertController alertController) {
                this.f631h = recycleListView;
                this.f632i = alertController;
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
                boolean[] zArr = f.this.F;
                if (zArr != null) {
                    zArr[i10] = this.f631h.isItemChecked(i10);
                }
                f.this.J.onClick(this.f632i.f556b, i10, this.f631h.isItemChecked(i10));
            }
        }

        public interface e {
            void a(ListView listView);
        }

        public f(Context context) {
            this.f596a = context;
            this.f613r = true;
            this.f597b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* JADX WARNING: type inference failed for: r9v0, types: [android.widget.ListAdapter] */
        /* JADX WARNING: type inference failed for: r9v3 */
        /* JADX WARNING: type inference failed for: r9v4 */
        /* JADX WARNING: type inference failed for: r2v5, types: [android.widget.SimpleCursorAdapter] */
        /* JADX WARNING: type inference failed for: r1v23, types: [androidx.appcompat.app.AlertController$f$b] */
        /* JADX WARNING: type inference failed for: r1v24, types: [androidx.appcompat.app.AlertController$f$a] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void b(androidx.appcompat.app.AlertController r11) {
            /*
                r10 = this;
                android.view.LayoutInflater r0 = r10.f597b
                int r1 = r11.L
                r2 = 0
                android.view.View r0 = r0.inflate(r1, r2)
                androidx.appcompat.app.AlertController$RecycleListView r0 = (androidx.appcompat.app.AlertController.RecycleListView) r0
                boolean r1 = r10.G
                r8 = 1
                if (r1 == 0) goto L_0x0035
                android.database.Cursor r1 = r10.K
                if (r1 != 0) goto L_0x0026
                androidx.appcompat.app.AlertController$f$a r9 = new androidx.appcompat.app.AlertController$f$a
                android.content.Context r3 = r10.f596a
                int r4 = r11.M
                r5 = 16908308(0x1020014, float:2.3877285E-38)
                java.lang.CharSequence[] r6 = r10.f617v
                r1 = r9
                r2 = r10
                r7 = r0
                r1.<init>(r3, r4, r5, r6, r7)
                goto L_0x006b
            L_0x0026:
                androidx.appcompat.app.AlertController$f$b r9 = new androidx.appcompat.app.AlertController$f$b
                android.content.Context r3 = r10.f596a
                android.database.Cursor r4 = r10.K
                r5 = 0
                r1 = r9
                r2 = r10
                r6 = r0
                r7 = r11
                r1.<init>(r3, r4, r5, r6, r7)
                goto L_0x006b
            L_0x0035:
                boolean r1 = r10.H
                if (r1 == 0) goto L_0x003c
                int r1 = r11.N
                goto L_0x003e
            L_0x003c:
                int r1 = r11.O
            L_0x003e:
                r4 = r1
                android.database.Cursor r1 = r10.K
                r2 = 16908308(0x1020014, float:2.3877285E-38)
                if (r1 == 0) goto L_0x005d
                android.widget.SimpleCursorAdapter r9 = new android.widget.SimpleCursorAdapter
                android.content.Context r3 = r10.f596a
                android.database.Cursor r5 = r10.K
                java.lang.String[] r6 = new java.lang.String[r8]
                java.lang.String r1 = r10.L
                r7 = 0
                r6[r7] = r1
                int[] r1 = new int[r8]
                r1[r7] = r2
                r2 = r9
                r7 = r1
                r2.<init>(r3, r4, r5, r6, r7)
                goto L_0x006b
            L_0x005d:
                android.widget.ListAdapter r9 = r10.f618w
                if (r9 == 0) goto L_0x0062
                goto L_0x006b
            L_0x0062:
                androidx.appcompat.app.AlertController$h r9 = new androidx.appcompat.app.AlertController$h
                android.content.Context r1 = r10.f596a
                java.lang.CharSequence[] r3 = r10.f617v
                r9.<init>(r1, r4, r2, r3)
            L_0x006b:
                androidx.appcompat.app.AlertController$f$e r1 = r10.O
                if (r1 == 0) goto L_0x0072
                r1.a(r0)
            L_0x0072:
                r11.H = r9
                int r1 = r10.I
                r11.I = r1
                android.content.DialogInterface$OnClickListener r1 = r10.f619x
                if (r1 == 0) goto L_0x0085
                androidx.appcompat.app.AlertController$f$c r1 = new androidx.appcompat.app.AlertController$f$c
                r1.<init>(r11)
                r0.setOnItemClickListener(r1)
                goto L_0x0091
            L_0x0085:
                android.content.DialogInterface$OnMultiChoiceClickListener r1 = r10.J
                if (r1 == 0) goto L_0x0091
                androidx.appcompat.app.AlertController$f$d r1 = new androidx.appcompat.app.AlertController$f$d
                r1.<init>(r0, r11)
                r0.setOnItemClickListener(r1)
            L_0x0091:
                android.widget.AdapterView$OnItemSelectedListener r1 = r10.N
                if (r1 == 0) goto L_0x0098
                r0.setOnItemSelectedListener(r1)
            L_0x0098:
                boolean r1 = r10.H
                if (r1 == 0) goto L_0x00a0
                r0.setChoiceMode(r8)
                goto L_0x00a8
            L_0x00a0:
                boolean r1 = r10.G
                if (r1 == 0) goto L_0x00a8
                r1 = 2
                r0.setChoiceMode(r1)
            L_0x00a8:
                r11.f561g = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.f.b(androidx.appcompat.app.AlertController):void");
        }

        public void a(AlertController alertController) {
            View view = this.f602g;
            if (view != null) {
                alertController.l(view);
            } else {
                CharSequence charSequence = this.f601f;
                if (charSequence != null) {
                    alertController.q(charSequence);
                }
                Drawable drawable = this.f599d;
                if (drawable != null) {
                    alertController.n(drawable);
                }
                int i10 = this.f598c;
                if (i10 != 0) {
                    alertController.m(i10);
                }
                int i11 = this.f600e;
                if (i11 != 0) {
                    alertController.m(alertController.c(i11));
                }
            }
            CharSequence charSequence2 = this.f603h;
            if (charSequence2 != null) {
                alertController.o(charSequence2);
            }
            CharSequence charSequence3 = this.f604i;
            if (!(charSequence3 == null && this.f605j == null)) {
                alertController.k(-1, charSequence3, this.f606k, (Message) null, this.f605j);
            }
            CharSequence charSequence4 = this.f607l;
            if (!(charSequence4 == null && this.f608m == null)) {
                alertController.k(-2, charSequence4, this.f609n, (Message) null, this.f608m);
            }
            CharSequence charSequence5 = this.f610o;
            if (!(charSequence5 == null && this.f611p == null)) {
                alertController.k(-3, charSequence5, this.f612q, (Message) null, this.f611p);
            }
            if (!(this.f617v == null && this.K == null && this.f618w == null)) {
                b(alertController);
            }
            View view2 = this.f621z;
            if (view2 == null) {
                int i12 = this.f620y;
                if (i12 != 0) {
                    alertController.r(i12);
                }
            } else if (this.E) {
                alertController.t(view2, this.A, this.B, this.C, this.D);
            } else {
                alertController.s(view2);
            }
        }
    }

    private static final class g extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<DialogInterface> f634a;

        public g(DialogInterface dialogInterface) {
            this.f634a = new WeakReference<>(dialogInterface);
        }

        public void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == -3 || i10 == -2 || i10 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f634a.get(), message.what);
            } else if (i10 == 1) {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    private static class h extends ArrayAdapter<CharSequence> {
        public h(Context context, int i10, int i11, CharSequence[] charSequenceArr) {
            super(context, i10, i11, charSequenceArr);
        }

        public long getItemId(int i10) {
            return (long) i10;
        }

        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, g.f fVar, Window window) {
        this.f555a = context;
        this.f556b = fVar;
        this.f557c = window;
        this.R = new g(fVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, j.F, f.a.f8197n, 0);
        this.J = obtainStyledAttributes.getResourceId(j.G, 0);
        this.K = obtainStyledAttributes.getResourceId(j.I, 0);
        this.L = obtainStyledAttributes.getResourceId(j.K, 0);
        this.M = obtainStyledAttributes.getResourceId(j.L, 0);
        this.N = obtainStyledAttributes.getResourceId(j.N, 0);
        this.O = obtainStyledAttributes.getResourceId(j.J, 0);
        this.P = obtainStyledAttributes.getBoolean(j.M, true);
        this.f558d = obtainStyledAttributes.getDimensionPixelSize(j.H, 0);
        obtainStyledAttributes.recycle();
        fVar.g(1);
    }

    static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    private void b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    static void f(View view, View view2, View view3) {
        int i10 = 0;
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            if (!view.canScrollVertically(1)) {
                i10 = 4;
            }
            view3.setVisibility(i10);
        }
    }

    private ViewGroup i(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    private int j() {
        int i10 = this.K;
        if (i10 == 0) {
            return this.J;
        }
        if (this.Q == 1) {
            return i10;
        }
        return this.J;
    }

    private void p(ViewGroup viewGroup, View view, int i10, int i11) {
        View findViewById = this.f557c.findViewById(f.f.f8278v);
        View findViewById2 = this.f557c.findViewById(f.f.f8277u);
        if (Build.VERSION.SDK_INT >= 23) {
            z.d0(view, i10, i11);
            if (findViewById != null) {
                viewGroup.removeView(findViewById);
            }
            if (findViewById2 != null) {
                viewGroup.removeView(findViewById2);
                return;
            }
            return;
        }
        if (findViewById != null && (i10 & 1) == 0) {
            viewGroup.removeView(findViewById);
            findViewById = null;
        }
        if (findViewById2 != null && (i10 & 2) == 0) {
            viewGroup.removeView(findViewById2);
            findViewById2 = null;
        }
        if (findViewById != null || findViewById2 != null) {
            if (this.f560f != null) {
                this.A.setOnScrollChangeListener(new b(findViewById, findViewById2));
                this.A.post(new c(findViewById, findViewById2));
                return;
            }
            ListView listView = this.f561g;
            if (listView != null) {
                listView.setOnScrollListener(new d(findViewById, findViewById2));
                this.f561g.post(new e(findViewById, findViewById2));
                return;
            }
            if (findViewById != null) {
                viewGroup.removeView(findViewById);
            }
            if (findViewById2 != null) {
                viewGroup.removeView(findViewById2);
            }
        }
    }

    private void u(ViewGroup viewGroup) {
        boolean z10;
        Button button = (Button) viewGroup.findViewById(16908313);
        this.f569o = button;
        button.setOnClickListener(this.S);
        boolean z11 = true;
        if (!TextUtils.isEmpty(this.f570p) || this.f572r != null) {
            this.f569o.setText(this.f570p);
            Drawable drawable = this.f572r;
            if (drawable != null) {
                int i10 = this.f558d;
                drawable.setBounds(0, 0, i10, i10);
                this.f569o.setCompoundDrawables(this.f572r, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            this.f569o.setVisibility(0);
            z10 = true;
        } else {
            this.f569o.setVisibility(8);
            z10 = false;
        }
        Button button2 = (Button) viewGroup.findViewById(16908314);
        this.f573s = button2;
        button2.setOnClickListener(this.S);
        if (!TextUtils.isEmpty(this.f574t) || this.f576v != null) {
            this.f573s.setText(this.f574t);
            Drawable drawable2 = this.f576v;
            if (drawable2 != null) {
                int i11 = this.f558d;
                drawable2.setBounds(0, 0, i11, i11);
                this.f573s.setCompoundDrawables(this.f576v, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            this.f573s.setVisibility(0);
            z10 |= true;
        } else {
            this.f573s.setVisibility(8);
        }
        Button button3 = (Button) viewGroup.findViewById(16908315);
        this.f577w = button3;
        button3.setOnClickListener(this.S);
        if (!TextUtils.isEmpty(this.f578x) || this.f580z != null) {
            this.f577w.setText(this.f578x);
            Drawable drawable3 = this.f580z;
            if (drawable3 != null) {
                int i12 = this.f558d;
                drawable3.setBounds(0, 0, i12, i12);
                this.f577w.setCompoundDrawables(this.f580z, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            this.f577w.setVisibility(0);
            z10 |= true;
        } else {
            this.f577w.setVisibility(8);
        }
        if (z(this.f555a)) {
            if (z10) {
                b(this.f569o);
            } else if (z10) {
                b(this.f573s);
            } else if (z10) {
                b(this.f577w);
            }
        }
        if (!z10) {
            z11 = false;
        }
        if (!z11) {
            viewGroup.setVisibility(8);
        }
    }

    private void v(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f557c.findViewById(f.f.f8279w);
        this.A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(16908299);
        this.F = textView;
        if (textView != null) {
            CharSequence charSequence = this.f560f;
            if (charSequence != null) {
                textView.setText(charSequence);
                return;
            }
            textView.setVisibility(8);
            this.A.removeView(this.F);
            if (this.f561g != null) {
                ViewGroup viewGroup2 = (ViewGroup) this.A.getParent();
                int indexOfChild = viewGroup2.indexOfChild(this.A);
                viewGroup2.removeViewAt(indexOfChild);
                viewGroup2.addView(this.f561g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                return;
            }
            viewGroup.setVisibility(8);
        }
    }

    private void w(ViewGroup viewGroup) {
        View view = this.f562h;
        boolean z10 = false;
        if (view == null) {
            view = this.f563i != 0 ? LayoutInflater.from(this.f555a).inflate(this.f563i, viewGroup, false) : null;
        }
        if (view != null) {
            z10 = true;
        }
        if (!z10 || !a(view)) {
            this.f557c.setFlags(131072, 131072);
        }
        if (z10) {
            FrameLayout frameLayout = (FrameLayout) this.f557c.findViewById(f.f.f8270n);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (this.f568n) {
                frameLayout.setPadding(this.f564j, this.f565k, this.f566l, this.f567m);
            }
            if (this.f561g != null) {
                ((g0.a) viewGroup.getLayoutParams()).f1086a = 0.0f;
                return;
            }
            return;
        }
        viewGroup.setVisibility(8);
    }

    private void x(ViewGroup viewGroup) {
        if (this.G != null) {
            viewGroup.addView(this.G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f557c.findViewById(f.f.O).setVisibility(8);
            return;
        }
        this.D = (ImageView) this.f557c.findViewById(16908294);
        if (!(!TextUtils.isEmpty(this.f559e)) || !this.P) {
            this.f557c.findViewById(f.f.O).setVisibility(8);
            this.D.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        TextView textView = (TextView) this.f557c.findViewById(f.f.f8266j);
        this.E = textView;
        textView.setText(this.f559e);
        int i10 = this.B;
        if (i10 != 0) {
            this.D.setImageResource(i10);
            return;
        }
        Drawable drawable = this.C;
        if (drawable != null) {
            this.D.setImageDrawable(drawable);
            return;
        }
        this.E.setPadding(this.D.getPaddingLeft(), this.D.getPaddingTop(), this.D.getPaddingRight(), this.D.getPaddingBottom());
        this.D.setVisibility(8);
    }

    private void y() {
        ListAdapter listAdapter;
        View findViewById;
        View findViewById2;
        View findViewById3 = this.f557c.findViewById(f.f.f8276t);
        int i10 = f.f.P;
        View findViewById4 = findViewById3.findViewById(i10);
        int i11 = f.f.f8269m;
        View findViewById5 = findViewById3.findViewById(i11);
        int i12 = f.f.f8267k;
        View findViewById6 = findViewById3.findViewById(i12);
        ViewGroup viewGroup = (ViewGroup) findViewById3.findViewById(f.f.f8271o);
        w(viewGroup);
        View findViewById7 = viewGroup.findViewById(i10);
        View findViewById8 = viewGroup.findViewById(i11);
        View findViewById9 = viewGroup.findViewById(i12);
        ViewGroup i13 = i(findViewById7, findViewById4);
        ViewGroup i14 = i(findViewById8, findViewById5);
        ViewGroup i15 = i(findViewById9, findViewById6);
        v(i14);
        u(i15);
        x(i13);
        char c10 = 0;
        boolean z10 = viewGroup.getVisibility() != 8;
        boolean z11 = (i13 == null || i13.getVisibility() == 8) ? false : true;
        boolean z12 = (i15 == null || i15.getVisibility() == 8) ? false : true;
        if (!(z12 || i14 == null || (findViewById2 = i14.findViewById(f.f.K)) == null)) {
            findViewById2.setVisibility(0);
        }
        if (z11) {
            NestedScrollView nestedScrollView = this.A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View view = null;
            if (!(this.f560f == null && this.f561g == null)) {
                view = i13.findViewById(f.f.N);
            }
            if (view != null) {
                view.setVisibility(0);
            }
        } else if (!(i14 == null || (findViewById = i14.findViewById(f.f.L)) == null)) {
            findViewById.setVisibility(0);
        }
        ListView listView = this.f561g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).a(z11, z12);
        }
        if (!z10) {
            View view2 = this.f561g;
            if (view2 == null) {
                view2 = this.A;
            }
            if (view2 != null) {
                if (z12) {
                    c10 = 2;
                }
                p(i14, view2, z11 | c10 ? 1 : 0, 3);
            }
        }
        ListView listView2 = this.f561g;
        if (listView2 != null && (listAdapter = this.H) != null) {
            listView2.setAdapter(listAdapter);
            int i16 = this.I;
            if (i16 > -1) {
                listView2.setItemChecked(i16, true);
                listView2.setSelection(i16);
            }
        }
    }

    private static boolean z(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(f.a.f8196m, typedValue, true);
        if (typedValue.data != 0) {
            return true;
        }
        return false;
    }

    public int c(int i10) {
        TypedValue typedValue = new TypedValue();
        this.f555a.getTheme().resolveAttribute(i10, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView d() {
        return this.f561g;
    }

    public void e() {
        this.f556b.setContentView(j());
        y();
    }

    public boolean g(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A;
        return nestedScrollView != null && nestedScrollView.s(keyEvent);
    }

    public boolean h(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A;
        return nestedScrollView != null && nestedScrollView.s(keyEvent);
    }

    public void k(int i10, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.R.obtainMessage(i10, onClickListener);
        }
        if (i10 == -3) {
            this.f578x = charSequence;
            this.f579y = message;
            this.f580z = drawable;
        } else if (i10 == -2) {
            this.f574t = charSequence;
            this.f575u = message;
            this.f576v = drawable;
        } else if (i10 == -1) {
            this.f570p = charSequence;
            this.f571q = message;
            this.f572r = drawable;
        } else {
            throw new IllegalArgumentException("Button does not exist");
        }
    }

    public void l(View view) {
        this.G = view;
    }

    public void m(int i10) {
        this.C = null;
        this.B = i10;
        ImageView imageView = this.D;
        if (imageView == null) {
            return;
        }
        if (i10 != 0) {
            imageView.setVisibility(0);
            this.D.setImageResource(this.B);
            return;
        }
        imageView.setVisibility(8);
    }

    public void n(Drawable drawable) {
        this.C = drawable;
        this.B = 0;
        ImageView imageView = this.D;
        if (imageView == null) {
            return;
        }
        if (drawable != null) {
            imageView.setVisibility(0);
            this.D.setImageDrawable(drawable);
            return;
        }
        imageView.setVisibility(8);
    }

    public void o(CharSequence charSequence) {
        this.f560f = charSequence;
        TextView textView = this.F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void q(CharSequence charSequence) {
        this.f559e = charSequence;
        TextView textView = this.E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void r(int i10) {
        this.f562h = null;
        this.f563i = i10;
        this.f568n = false;
    }

    public void s(View view) {
        this.f562h = view;
        this.f563i = 0;
        this.f568n = false;
    }

    public void t(View view, int i10, int i11, int i12, int i13) {
        this.f562h = view;
        this.f563i = 0;
        this.f568n = true;
        this.f564j = i10;
        this.f565k = i11;
        this.f566l = i12;
        this.f567m = i13;
    }
}
