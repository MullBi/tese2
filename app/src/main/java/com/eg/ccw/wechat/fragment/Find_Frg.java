package com.eg.ccw.wechat.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.eg.ccw.wechat.R;

/**
 * Created by Administrator on 2015/8/16.
 */
public class Find_Frg extends Fragment {
    private LinearLayout yaoyiyao;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.frg_find,container,false);
        yaoyiyao= (LinearLayout) view.findViewById(R.id.yaoyiyao);
        yaoyiyao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"我是摇一摇", Toast.LENGTH_SHORT).show();

            }
        });

        return view;
    }



    @Override
    public void onPause() {
        super.onPause();
    }
}
