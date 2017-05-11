package com.example.samsung.p1161_mngtasks1;

import android.content.Intent;

/**
 * Created by samsung on 11.05.2017.
 */

public class ActivityB extends MainActivity {

    @Override
    public void onClickBtnAbstract(int id) {

        if (id != R.id.btnStart) {
            throw new RuntimeException();
        }

        startActivity(new Intent(this, ActivityC.class));

    }
}
