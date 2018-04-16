package org.example.smarthome.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.example.smarthome.R;
import org.example.smarthome.adapter.base.AdapterBase;

import java.util.List;

/**
 * Created by 阳光大爱男孩 on 2017/8/10.
 */

public class AdapterAppGrid extends BaseAdapter {

    private class Holder{
        ImageView imageView;
        TextView textView;
    }

    private Integer[] ImageInteger={
            R.drawable.door_window,
            R.drawable.lantern,
            R.drawable.temperature,
            R.drawable.bed,
            R.drawable.fire,
            R.drawable.buzzer,
            R.drawable.window,
            R.drawable.thief,
            R.drawable.feedback
    };

    private String[] ImageString=new String[9];
    private Context context;

    public AdapterAppGrid(Context context){
        this.context=context;
        ImageString[0]=context.getString(R.string.door_window);
        ImageString[1]=context.getString(R.string.lantern);
        ImageString[2]=context.getString(R.string.temperature);
        ImageString[3]=context.getString(R.string.bed);
        ImageString[4]=context.getString(R.string.fire);
        ImageString[5]=context.getString(R.string.buzzer);
        ImageString[6]=context.getString(R.string.window);
        ImageString[7]=context.getString(R.string.thief);
        ImageString[8]=context.getString(R.string.feedback);
    }


    @Override
    public int getCount() {
        return ImageString.length;
    }

    @Override
    public Object getItem(int i) {
        return ImageString[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        Holder holder;

        if (view==null){
            LayoutInflater _layoutInflater=LayoutInflater.from(context);
            view= _layoutInflater.inflate(R.layout.main_body_item,null);
            holder=new Holder();

            holder.imageView=(ImageView) view.findViewById(R.id.iv_icon);
            holder.textView=(TextView)view.findViewById(R.id.tv_name);
            view.setTag(holder);
        }else{
            holder=(Holder) view.getTag();

        }

        holder.imageView.setImageResource(ImageInteger[i]);
        LinearLayout.LayoutParams _LayoutParams=new LinearLayout.LayoutParams(300,300);
        holder.imageView.setLayoutParams(_LayoutParams);
        holder.imageView.setScaleType(ImageView.ScaleType.CENTER);
        holder.textView.setText(ImageString[i]);

        return view;
    }
}
