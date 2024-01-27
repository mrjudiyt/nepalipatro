package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import i2.e;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: TransformationUtils */
public final class w {

    /* renamed from: a  reason: collision with root package name */
    private static final Paint f5928a = new Paint(6);

    /* renamed from: b  reason: collision with root package name */
    private static final Paint f5929b = new Paint(7);

    /* renamed from: c  reason: collision with root package name */
    private static final Paint f5930c;

    /* renamed from: d  reason: collision with root package name */
    private static final Set<String> f5931d;

    /* renamed from: e  reason: collision with root package name */
    private static final Lock f5932e;

    /* compiled from: TransformationUtils */
    private static final class a implements Lock {
        a() {
        }

        public void lock() {
        }

        public void lockInterruptibly() {
        }

        public Condition newCondition() {
            throw new UnsupportedOperationException("Should not be called");
        }

        public boolean tryLock() {
            return true;
        }

        public boolean tryLock(long j10, TimeUnit timeUnit) {
            return true;
        }

        public void unlock() {
        }
    }

    static {
        HashSet hashSet = new HashSet(Arrays.asList(new String[]{"XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079"}));
        f5931d = hashSet;
        f5932e = hashSet.contains(Build.MODEL) ? new ReentrantLock() : new a();
        Paint paint = new Paint(7);
        f5930c = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    private static void a(Bitmap bitmap, Bitmap bitmap2, Matrix matrix) {
        Lock lock = f5932e;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, f5928a);
            c(canvas);
            lock.unlock();
        } catch (Throwable th) {
            f5932e.unlock();
            throw th;
        }
    }

    public static Bitmap b(e eVar, Bitmap bitmap, int i10, int i11) {
        float f10;
        float f11;
        if (bitmap.getWidth() == i10 && bitmap.getHeight() == i11) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float f12 = 0.0f;
        if (bitmap.getWidth() * i11 > bitmap.getHeight() * i10) {
            f11 = ((float) i11) / ((float) bitmap.getHeight());
            f12 = (((float) i10) - (((float) bitmap.getWidth()) * f11)) * 0.5f;
            f10 = 0.0f;
        } else {
            f11 = ((float) i10) / ((float) bitmap.getWidth());
            f10 = (((float) i11) - (((float) bitmap.getHeight()) * f11)) * 0.5f;
        }
        matrix.setScale(f11, f11);
        matrix.postTranslate((float) ((int) (f12 + 0.5f)), (float) ((int) (f10 + 0.5f)));
        Bitmap d10 = eVar.d(i10, i11, f(bitmap));
        j(bitmap, d10);
        a(bitmap, d10, matrix);
        return d10;
    }

    private static void c(Canvas canvas) {
        canvas.setBitmap((Bitmap) null);
    }

    public static Lock d() {
        return f5932e;
    }

    public static int e(int i10) {
        switch (i10) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    private static Bitmap.Config f(Bitmap bitmap) {
        return bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888;
    }

    static void g(int i10, Matrix matrix) {
        switch (i10) {
            case 2:
                matrix.setScale(-1.0f, 1.0f);
                return;
            case 3:
                matrix.setRotate(180.0f);
                return;
            case 4:
                matrix.setRotate(180.0f);
                matrix.postScale(-1.0f, 1.0f);
                return;
            case 5:
                matrix.setRotate(90.0f);
                matrix.postScale(-1.0f, 1.0f);
                return;
            case 6:
                matrix.setRotate(90.0f);
                return;
            case 7:
                matrix.setRotate(-90.0f);
                matrix.postScale(-1.0f, 1.0f);
                return;
            case 8:
                matrix.setRotate(-90.0f);
                return;
            default:
                return;
        }
    }

    public static boolean h(int i10) {
        switch (i10) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    public static Bitmap i(e eVar, Bitmap bitmap, int i10) {
        if (!h(i10)) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        g(i10, matrix);
        RectF rectF = new RectF(0.0f, 0.0f, (float) bitmap.getWidth(), (float) bitmap.getHeight());
        matrix.mapRect(rectF);
        Bitmap d10 = eVar.d(Math.round(rectF.width()), Math.round(rectF.height()), f(bitmap));
        matrix.postTranslate(-rectF.left, -rectF.top);
        d10.setHasAlpha(bitmap.hasAlpha());
        a(bitmap, d10, matrix);
        return d10;
    }

    public static void j(Bitmap bitmap, Bitmap bitmap2) {
        bitmap2.setHasAlpha(bitmap.hasAlpha());
    }
}
