package com.example.samsung.p1161_mngtasks1;

import android.content.Intent;

/**
 * Created by samsung on 11.05.2017.
 */

public class ActivityD extends MainActivity {

    @Override
    public void onClickBtnAbstract(int id) {

        if (id != R.id.btnStartSingleTop) {
            throw new RuntimeException();
        }
        startActivity(new Intent(this, ActivityD.class));
    }
}
