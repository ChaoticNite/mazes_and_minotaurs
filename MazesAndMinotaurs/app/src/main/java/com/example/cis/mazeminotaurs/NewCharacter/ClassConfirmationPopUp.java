package com.example.cis.mazeminotaurs.NewCharacter;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.util.DisplayMetrics;
import android.widget.TextView;

import com.example.cis.mazeminotaurs.R;

/**
 *  Made to confirm class selection.
 *
 * Created by Chaos on 3/16/2017.
 */

public class ClassConfirmationPopUp extends Activity {

    String classConText;
    TextView confirmTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.class_confirmation_popup);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int) (width*.8), (int) (height*.6));





    }
}
