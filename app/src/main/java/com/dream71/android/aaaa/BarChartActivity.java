package com.dream71.android.aaaa;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter;
import com.github.mikephil.charting.formatter.LargeValueFormatter;

import java.util.ArrayList;

public class BarChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar_chart);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

         BarChart chart = findViewById(R.id.piechart);

        ArrayList<BarDataSet> dataSets = null;
         /*
        ArrayList<BarDataSet> dataSets = null;

        ArrayList<BarEntry> values1 = new ArrayList<>();
        ArrayList<BarEntry> values2 = new ArrayList<>();
        ArrayList<BarEntry> values3 = new ArrayList<>();
        ArrayList<BarEntry> values4 = new ArrayList<>();


        values1.add(new BarEntry(100, 10));
        values1.add(new BarEntry(100, 20));



        values2.add(new BarEntry(100, 10));
        values2.add(new BarEntry(100, 20));



        values3.add(new BarEntry(100, 10));
        values3.add(new BarEntry(100, 20));


        values4.add(new BarEntry(100, 10));
        values4.add(new BarEntry(100, 20));



        BarDataSet set1, set2, set3, set4;

        set1 = new BarDataSet(values1, "Company A");
        set1.setColor(Color.rgb(104, 241, 175));

        set2 = new BarDataSet(values2, "Company B");
        set2.setColor(Color.rgb(164, 228, 251));

        set3 = new BarDataSet(values3, "Company C");
        set3.setColor(Color.rgb(242, 247, 158));

        set4 = new BarDataSet(values4, "Company D");
        set4.setColor(Color.rgb(255, 102, 0));

        dataSets = new ArrayList<>();
        dataSets.add(v);
        dataSets.add(pendingdata);
        dataSets.add(rejectedData);


        BarData data = new BarData(set1, set2, set3, set4);

        BarData data = new BarData(xAxis, dataSets);


        chart.setData(data);



        float groupSpace = 0.08f;
        float barSpace = 0.03f; // x4 DataSet
        float barWidth = 0.2f; // x4 DataSet
        int startYear = 1980;


        ArrayList<BarEntry> completed = new ArrayList<>();
        completed.add(new BarEntry(10 , 1));
        completed.add(new BarEntry(20 , 2));
        completed.add(new BarEntry(30 , 3));


        BarDataSet completeData = new BarDataSet(completed, "Completed Issue");
        completeData.setColor(Color.rgb(0, 155, 0));

        ArrayList<BarEntry> pending  = new ArrayList<>();
        completed.add(new BarEntry(10 , 1));
        completed.add(new BarEntry(20 , 2));
        completed.add(new BarEntry(30 , 3));

        BarDataSet pendingdata = new BarDataSet(pending, "Pending Issue");
        pendingdata.setColor(Color.rgb(253, 129, 0));


        ArrayList<BarEntry> rejected  = new ArrayList<>();
        completed.add(new BarEntry(10 , 1));
        completed.add(new BarEntry(20 , 2));
        completed.add(new BarEntry(30 , 3));

        BarDataSet rejectedData = new BarDataSet(rejected, "Rejected Issue");
        pendingdata.setColor(Color.rgb(255, 0, 0));


        dataSets = new ArrayList<>();
        dataSets.add(completeData);
        dataSets.add(pendingdata);
        dataSets.add(rejectedData);

        ArrayList<String> xAxis = new ArrayList<>();
        xAxis.add("jan");
        xAxis.add("feb");
        xAxis.add("mar");

        BarData data = new BarData( completeData  , pendingdata , rejectedData);
        data.setValueFormatter(new LargeValueFormatter());
        chart.setData(data);


        */


        ArrayList<BarEntry> barEntries = new ArrayList<>();
        ArrayList<BarEntry> barEntries1 = new ArrayList<>();
        ArrayList<BarEntry> barEntries2 = new ArrayList<>();
        ArrayList<BarEntry> barEntries3 = new ArrayList<>();

        barEntries.add(new BarEntry(1,989.21f));
        barEntries.add(new BarEntry(2,420.22f));
        barEntries.add(new BarEntry(3,758));
        barEntries.add(new BarEntry(4,3078.97f));
        barEntries.add(new BarEntry(5,14586.96f));
        barEntries.add(new BarEntry(6,400.4f));
        barEntries.add(new BarEntry(7,5888.58f));

        barEntries1.add(new BarEntry(1,950));
        barEntries1.add(new BarEntry(2,791));
        barEntries1.add(new BarEntry(3,630));
        barEntries1.add(new BarEntry(4,782));
        barEntries1.add(new BarEntry(5,2714.54f));
        barEntries1.add(new BarEntry(6,500));
        barEntries1.add(new BarEntry(7,2173.36f));

        barEntries2.add(new BarEntry(1,900));
        barEntries2.add(new BarEntry(2,691));
        barEntries2.add(new BarEntry(3,1030));
        barEntries2.add(new BarEntry(4,382));
        barEntries2.add(new BarEntry(5,2714f));
        barEntries2.add(new BarEntry(6,5000));
        barEntries2.add(new BarEntry(7,1173f));

        barEntries3.add(new BarEntry(1,200));
        barEntries3.add(new BarEntry(2,991));
        barEntries3.add(new BarEntry(3,1830));
        barEntries3.add(new BarEntry(4,3082));
        barEntries3.add(new BarEntry(5,214));
        barEntries3.add(new BarEntry(6,5600));
        barEntries3.add(new BarEntry(7,9173));

        BarDataSet barDataSet = new BarDataSet(barEntries,"DATA SET 1");
        barDataSet.setColor(Color.parseColor("#F44336"));
        BarDataSet barDataSet1 = new BarDataSet(barEntries1,"DATA SET 2");
        barDataSet1.setColors(Color.parseColor("#9C27B0"));
        BarDataSet barDataSet2 = new BarDataSet(barEntries2,"DATA SET 3");
        barDataSet1.setColors(Color.parseColor("#e241f4"));
        BarDataSet barDataSet3 = new BarDataSet(barEntries3,"DATA SET 4");
        barDataSet1.setColors(Color.parseColor("#42f46e"));

        String[] months = new String[] {"TYPE 1", "TYPE 2", "TYPE 3", "TYPE 4"};
        BarData data = new BarData(barDataSet,barDataSet1,barDataSet2,barDataSet3);
        chart.setData(data);

        XAxis xAxis = chart.getXAxis();
        xAxis.setValueFormatter(new IndexAxisValueFormatter(months));
        chart.getAxisLeft().setAxisMinimum(0);
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setGranularity(1);
        xAxis.setCenterAxisLabels(true);
        xAxis.setGranularityEnabled(true);

        float barSpace = 0.02f;
        float groupSpace = 0.3f;
        int groupCount = 4;

        //IMPORTANT *****
        data.setBarWidth(0.15f);
        chart.getXAxis().setAxisMinimum(0);
        chart.getXAxis().setAxisMaximum(0 + chart.getBarData().getGroupWidth(groupSpace, barSpace) * groupCount);
        chart.groupBars(0, groupSpace, barSpace); // perform the "explicit" grouping

    }

}
