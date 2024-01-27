package b0;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import androidx.core.util.c;

/* compiled from: PrecomputedTextCompat */
public class a implements Spannable {

    /* renamed from: k  reason: collision with root package name */
    private static final Object f4953k = new Object();

    /* renamed from: h  reason: collision with root package name */
    private final Spannable f4954h;

    /* renamed from: i  reason: collision with root package name */
    private final C0092a f4955i;

    /* renamed from: j  reason: collision with root package name */
    private final PrecomputedText f4956j;

    public C0092a a() {
        return this.f4955i;
    }

    public PrecomputedText b() {
        Spannable spannable = this.f4954h;
        if (spannable instanceof PrecomputedText) {
            return (PrecomputedText) spannable;
        }
        return null;
    }

    public char charAt(int i10) {
        return this.f4954h.charAt(i10);
    }

    public int getSpanEnd(Object obj) {
        return this.f4954h.getSpanEnd(obj);
    }

    public int getSpanFlags(Object obj) {
        return this.f4954h.getSpanFlags(obj);
    }

    public int getSpanStart(Object obj) {
        return this.f4954h.getSpanStart(obj);
    }

    public <T> T[] getSpans(int i10, int i11, Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 29) {
            return this.f4956j.getSpans(i10, i11, cls);
        }
        return this.f4954h.getSpans(i10, i11, cls);
    }

    public int length() {
        return this.f4954h.length();
    }

    public int nextSpanTransition(int i10, int i11, Class cls) {
        return this.f4954h.nextSpanTransition(i10, i11, cls);
    }

    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 29) {
            this.f4956j.removeSpan(obj);
        } else {
            this.f4954h.removeSpan(obj);
        }
    }

    public void setSpan(Object obj, int i10, int i11, int i12) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 29) {
            this.f4956j.setSpan(obj, i10, i11, i12);
        } else {
            this.f4954h.setSpan(obj, i10, i11, i12);
        }
    }

    public CharSequence subSequence(int i10, int i11) {
        return this.f4954h.subSequence(i10, i11);
    }

    public String toString() {
        return this.f4954h.toString();
    }

    /* renamed from: b0.a$a  reason: collision with other inner class name */
    /* compiled from: PrecomputedTextCompat */
    public static final class C0092a {

        /* renamed from: a  reason: collision with root package name */
        private final TextPaint f4957a;

        /* renamed from: b  reason: collision with root package name */
        private final TextDirectionHeuristic f4958b;

        /* renamed from: c  reason: collision with root package name */
        private final int f4959c;

        /* renamed from: d  reason: collision with root package name */
        private final int f4960d;

        /* renamed from: e  reason: collision with root package name */
        final PrecomputedText.Params f4961e;

        /* renamed from: b0.a$a$a  reason: collision with other inner class name */
        /* compiled from: PrecomputedTextCompat */
        public static class C0093a {

            /* renamed from: a  reason: collision with root package name */
            private final TextPaint f4962a;

            /* renamed from: b  reason: collision with root package name */
            private TextDirectionHeuristic f4963b;

            /* renamed from: c  reason: collision with root package name */
            private int f4964c;

            /* renamed from: d  reason: collision with root package name */
            private int f4965d;

            public C0093a(TextPaint textPaint) {
                this.f4962a = textPaint;
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 23) {
                    this.f4964c = 1;
                    this.f4965d = 1;
                } else {
                    this.f4965d = 0;
                    this.f4964c = 0;
                }
                if (i10 >= 18) {
                    this.f4963b = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                } else {
                    this.f4963b = null;
                }
            }

            public C0092a a() {
                return new C0092a(this.f4962a, this.f4963b, this.f4964c, this.f4965d);
            }

            public C0093a b(int i10) {
                this.f4964c = i10;
                return this;
            }

            public C0093a c(int i10) {
                this.f4965d = i10;
                return this;
            }

            public C0093a d(TextDirectionHeuristic textDirectionHeuristic) {
                this.f4963b = textDirectionHeuristic;
                return this;
            }
        }

        C0092a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i10, int i11) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f4961e = new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i10).setHyphenationFrequency(i11).setTextDirection(textDirectionHeuristic).build();
            } else {
                this.f4961e = null;
            }
            this.f4957a = textPaint;
            this.f4958b = textDirectionHeuristic;
            this.f4959c = i10;
            this.f4960d = i11;
        }

        public boolean a(C0092a aVar) {
            int i10 = Build.VERSION.SDK_INT;
            if ((i10 >= 23 && (this.f4959c != aVar.b() || this.f4960d != aVar.c())) || this.f4957a.getTextSize() != aVar.e().getTextSize() || this.f4957a.getTextScaleX() != aVar.e().getTextScaleX() || this.f4957a.getTextSkewX() != aVar.e().getTextSkewX()) {
                return false;
            }
            if ((i10 >= 21 && (this.f4957a.getLetterSpacing() != aVar.e().getLetterSpacing() || !TextUtils.equals(this.f4957a.getFontFeatureSettings(), aVar.e().getFontFeatureSettings()))) || this.f4957a.getFlags() != aVar.e().getFlags()) {
                return false;
            }
            if (i10 >= 24) {
                if (!this.f4957a.getTextLocales().equals(aVar.e().getTextLocales())) {
                    return false;
                }
            } else if (i10 >= 17 && !this.f4957a.getTextLocale().equals(aVar.e().getTextLocale())) {
                return false;
            }
            if (this.f4957a.getTypeface() == null) {
                if (aVar.e().getTypeface() != null) {
                    return false;
                }
                return true;
            } else if (!this.f4957a.getTypeface().equals(aVar.e().getTypeface())) {
                return false;
            } else {
                return true;
            }
        }

        public int b() {
            return this.f4959c;
        }

        public int c() {
            return this.f4960d;
        }

        public TextDirectionHeuristic d() {
            return this.f4958b;
        }

        public TextPaint e() {
            return this.f4957a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0092a)) {
                return false;
            }
            C0092a aVar = (C0092a) obj;
            if (!a(aVar)) {
                return false;
            }
            return Build.VERSION.SDK_INT < 18 || this.f4958b == aVar.d();
        }

        public int hashCode() {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 24) {
                return c.b(Float.valueOf(this.f4957a.getTextSize()), Float.valueOf(this.f4957a.getTextScaleX()), Float.valueOf(this.f4957a.getTextSkewX()), Float.valueOf(this.f4957a.getLetterSpacing()), Integer.valueOf(this.f4957a.getFlags()), this.f4957a.getTextLocales(), this.f4957a.getTypeface(), Boolean.valueOf(this.f4957a.isElegantTextHeight()), this.f4958b, Integer.valueOf(this.f4959c), Integer.valueOf(this.f4960d));
            } else if (i10 >= 21) {
                return c.b(Float.valueOf(this.f4957a.getTextSize()), Float.valueOf(this.f4957a.getTextScaleX()), Float.valueOf(this.f4957a.getTextSkewX()), Float.valueOf(this.f4957a.getLetterSpacing()), Integer.valueOf(this.f4957a.getFlags()), this.f4957a.getTextLocale(), this.f4957a.getTypeface(), Boolean.valueOf(this.f4957a.isElegantTextHeight()), this.f4958b, Integer.valueOf(this.f4959c), Integer.valueOf(this.f4960d));
            } else if (i10 >= 18) {
                return c.b(Float.valueOf(this.f4957a.getTextSize()), Float.valueOf(this.f4957a.getTextScaleX()), Float.valueOf(this.f4957a.getTextSkewX()), Integer.valueOf(this.f4957a.getFlags()), this.f4957a.getTextLocale(), this.f4957a.getTypeface(), this.f4958b, Integer.valueOf(this.f4959c), Integer.valueOf(this.f4960d));
            } else if (i10 >= 17) {
                return c.b(Float.valueOf(this.f4957a.getTextSize()), Float.valueOf(this.f4957a.getTextScaleX()), Float.valueOf(this.f4957a.getTextSkewX()), Integer.valueOf(this.f4957a.getFlags()), this.f4957a.getTextLocale(), this.f4957a.getTypeface(), this.f4958b, Integer.valueOf(this.f4959c), Integer.valueOf(this.f4960d));
            } else {
                return c.b(Float.valueOf(this.f4957a.getTextSize()), Float.valueOf(this.f4957a.getTextScaleX()), Float.valueOf(this.f4957a.getTextSkewX()), Integer.valueOf(this.f4957a.getFlags()), this.f4957a.getTypeface(), this.f4958b, Integer.valueOf(this.f4959c), Integer.valueOf(this.f4960d));
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("{");
            sb.append("textSize=" + this.f4957a.getTextSize());
            sb.append(", textScaleX=" + this.f4957a.getTextScaleX());
            sb.append(", textSkewX=" + this.f4957a.getTextSkewX());
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 21) {
                sb.append(", letterSpacing=" + this.f4957a.getLetterSpacing());
                sb.append(", elegantTextHeight=" + this.f4957a.isElegantTextHeight());
            }
            if (i10 >= 24) {
                sb.append(", textLocale=" + this.f4957a.getTextLocales());
            } else if (i10 >= 17) {
                sb.append(", textLocale=" + this.f4957a.getTextLocale());
            }
            sb.append(", typeface=" + this.f4957a.getTypeface());
            if (i10 >= 26) {
                sb.append(", variationSettings=" + this.f4957a.getFontVariationSettings());
            }
            sb.append(", textDir=" + this.f4958b);
            sb.append(", breakStrategy=" + this.f4959c);
            sb.append(", hyphenationFrequency=" + this.f4960d);
            sb.append("}");
            return sb.toString();
        }

        public C0092a(PrecomputedText.Params params) {
            this.f4957a = params.getTextPaint();
            this.f4958b = params.getTextDirection();
            this.f4959c = params.getBreakStrategy();
            this.f4960d = params.getHyphenationFrequency();
            this.f4961e = Build.VERSION.SDK_INT < 29 ? null : params;
        }
    }
}
