package com.example.samsung.p1161_mngtasks1;

import android.content.Intent;

public class ActivityA extends MainActivity {

    @Override
    public void onClickBtnAbstract(int id) {

        if (id != R.id.btnStartSingleTop) {
            throw new RuntimeException();
        }
        startActivity(new Intent(this, ActivityB.class));
    }
}
