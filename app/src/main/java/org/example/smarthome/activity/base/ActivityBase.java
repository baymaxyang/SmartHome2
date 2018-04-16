package org.example.smarthome.activity.base;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * Created by 阳光大爱男孩 on 2017/8/9.
 */

public class ActivityBase extends AppCompatActivity{

    protected void ShowMsg(String pMsg){
        Toast.makeText(this, pMsg, Toast.LENGTH_SHORT).show();
    }

    protected void OpenActivity(Class pClass){
        Intent _Intent=new Intent();
        _Intent.setClass(this,pClass);
        startActivity(_Intent);
    }
}
