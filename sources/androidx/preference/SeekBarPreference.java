package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import t0.c;
import t0.g;

public class SeekBarPreference extends Preference {
    int O;
    int P;
    private int Q;
    private int R;
    boolean S;
    SeekBar T;
    private TextView U;
    boolean V;
    private boolean W;
    boolean X;
    private final SeekBar.OnSeekBarChangeListener Y;
    private final View.OnKeyListener Z;

    class a implements SeekBar.OnSeekBarChangeListener {
        a() {
        }

        public void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
            if (z10) {
                SeekBarPreference seekBarPreference = SeekBarPreference.this;
                if (seekBarPreference.X || !seekBarPreference.S) {
                    seekBarPreference.N(seekBar);
                    return;
                }
            }
            SeekBarPreference seekBarPreference2 = SeekBarPreference.this;
            seekBarPreference2.O(i10 + seekBarPreference2.P);
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.S = true;
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.S = false;
            int progress = seekBar.getProgress();
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if (progress + seekBarPreference.P != seekBarPreference.O) {
                seekBarPreference.N(seekBar);
            }
        }
    }

    class b implements View.OnKeyListener {
        b() {
        }

        public boolean onKey(View view, int i10, KeyEvent keyEvent) {
            SeekBar seekBar;
            if (keyEvent.getAction() != 0) {
                return false;
            }
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if ((!seekBarPreference.V && (i10 == 21 || i10 == 22)) || i10 == 23 || i10 == 66 || (seekBar = seekBarPreference.T) == null) {
                return false;
            }
            return seekBar.onKeyDown(i10, keyEvent);
        }
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.Y = new a();
        this.Z = new b();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.C0, i10, i11);
        this.P = obtainStyledAttributes.getInt(g.F0, 0);
        K(obtainStyledAttributes.getInt(g.D0, 100));
        L(obtainStyledAttributes.getInt(g.G0, 0));
        this.V = obtainStyledAttributes.getBoolean(g.E0, true);
        this.W = obtainStyledAttributes.getBoolean(g.H0, false);
        this.X = obtainStyledAttributes.getBoolean(g.I0, false);
        obtainStyledAttributes.recycle();
    }

    private void M(int i10, boolean z10) {
        int i11 = this.P;
        if (i10 < i11) {
            i10 = i11;
        }
        int i12 = this.Q;
        if (i10 > i12) {
            i10 = i12;
        }
        if (i10 != this.O) {
            this.O = i10;
            O(i10);
            F(i10);
            if (z10) {
                w();
            }
        }
    }

    /* access modifiers changed from: protected */
    public Object A(TypedArray typedArray, int i10) {
        return Integer.valueOf(typedArray.getInt(i10, 0));
    }

    public final void K(int i10) {
        int i11 = this.P;
        if (i10 < i11) {
            i10 = i11;
        }
        if (i10 != this.Q) {
            this.Q = i10;
            w();
        }
    }

    public final void L(int i10) {
        if (i10 != this.R) {
            this.R = Math.min(this.Q - this.P, Math.abs(i10));
            w();
        }
    }

    /* access modifiers changed from: package-private */
    public void N(SeekBar seekBar) {
        int progress = this.P + seekBar.getProgress();
        if (progress == this.O) {
            return;
        }
        if (a(Integer.valueOf(progress))) {
            M(progress, false);
            return;
        }
        seekBar.setProgress(this.O - this.P);
        O(this.O);
    }

    /* access modifiers changed from: package-private */
    public void O(int i10) {
        TextView textView = this.U;
        if (textView != null) {
            textView.setText(String.valueOf(i10));
        }
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.seekBarPreferenceStyle);
    }
}
