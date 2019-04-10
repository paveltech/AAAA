package com.dream71.android.aaaa;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;

import java.util.ArrayList;

public class BarChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar_chart);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

         BarChart chart = findViewById(R.id.piechart);


        ArrayList<BarEntry> values1 = new ArrayList<>();
        ArrayList<BarEntry> values2 = new ArrayList<>();
        ArrayList<BarEntry> values3 = new ArrayList<>();
        ArrayList<BarEntry> values4 = new ArrayList<>();


        values1.add(new BarEntry(0, 0));
        values1.add(new BarEntry(1, 1));



        values2.add(new BarEntry(0, 0));
        values2.add(new BarEntry(1, 1));



        values3.add(new BarEntry(0, 0));
        values3.add(new BarEntry(1, 1));


        values4.add(new BarEntry(0, 0));
        values4.add(new BarEntry(1, 1));



        BarDataSet set1, set2, set3, set4;

        set1 = new BarDataSet(values1, "Company A");
        set1.setColor(Color.rgb(104, 241, 175));

        set2 = new BarDataSet(values2, "Company B");
        set2.setColor(Color.rgb(164, 228, 251));

        set3 = new BarDataSet(values3, "Company C");
        set3.setColor(Color.rgb(242, 247, 158));

        set4 = new BarDataSet(values4, "Company D");
        set4.setColor(Color.rgb(255, 102, 0));

        BarData data = new BarData(set1, set2, set3, set4);


        chart.setData(data);
    }

}
