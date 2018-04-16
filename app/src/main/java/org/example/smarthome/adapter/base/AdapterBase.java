package org.example.smarthome.adapter.base;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * Created by 阳光大爱男孩 on 2017/8/10.
 */


public abstract class AdapterBase extends BaseAdapter{

    private List list;
    private Context context;
    private LayoutInflater layoutInflater;

    public AdapterBase(Context context,List list){
        this.context =context;
        this.list =list;
        layoutInflater =LayoutInflater.from(this.context);
    }

    public LayoutInflater GetLayoutInflater(){
        return layoutInflater;
    }

    public Context GetContext(){
        return context;
    }
    public List GetList(){
        return list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public long getItemId(int pPotision) {
        return pPotision;
    }
/*
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        return null;
    }*/

    @Override
    public Object getItem(int pPotision) {
        return list.get(pPotision);
    }
}
