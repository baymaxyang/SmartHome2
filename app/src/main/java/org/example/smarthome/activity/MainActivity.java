package org.example.smarthome.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import org.example.smarthome.R;
import org.example.smarthome.activity.base.ActivityFrame;
import org.example.smarthome.adapter.AdapterAppGrid;

public class MainActivity extends ActivityFrame {

    private AdapterAppGrid adapterAppGrid;
    private GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AppendMainBody(R.layout.main_body);

        InitVariable();
        InitView();
        InitListeners();
        BindData();

        gridView= (GridView) findViewById(R.id.gv_main);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch(i){
                    case 0:
                        Intent intent=new Intent(MainActivity.this,DoorWindow.class);
                        startActivity(intent);
                        break;
                  /*  case 2:
                        Intent intent=new Intent(MainActivity.this,DoorWindow.class);
                    case 3:
                        Intent intent=new Intent(MainActivity.this,DoorWindow.class);
                    case 4:
                        Intent intent=new Intent(MainActivity.this,DoorWindow.class);
                    case 5:
                        Intent intent=new Intent(MainActivity.this,DoorWindow.class);
                    case 6:
                        Intent intent=new Intent(MainActivity.this,DoorWindow.class);
                    case 7:
                        Intent intent=new Intent(MainActivity.this,DoorWindow.class);
                    case 8:
                        Intent intent=new Intent(MainActivity.this,DoorWindow.class);
                    case 9:
                        Intent intent=new Intent(MainActivity.this,DoorWindow.class);*/
                }
            }
        });
    }



    public void InitVariable(){
        adapterAppGrid=new AdapterAppGrid(this);
    }
    public void InitView(){
        gridView=(GridView)findViewById(R.id.gv_main);
    }
    public void InitListeners(){

    }
    public void BindData(){
        gridView.setAdapter(adapterAppGrid);
    }

}
