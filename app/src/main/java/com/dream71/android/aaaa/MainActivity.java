package com.dream71.android.aaaa;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.LegendEntry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;
import java.util.List;

import static com.github.mikephil.charting.utils.ColorTemplate.VORDIPLOM_COLORS;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        PieChart chart = findViewById(R.id.piechart);


        ArrayList<PieEntry> entries = new  ArrayList<>();
        entries.add(new PieEntry(10 , "In Progress"));
        entries.add(new PieEntry(20 , "Complete"));
        entries.add(new PieEntry(30 , "Pending"));
        entries.add(new PieEntry(40 , "Rejected"));
        entries.add(new PieEntry(50, "Total"));


        PieDataSet dataSet = new PieDataSet(entries, "");
        dataSet.setSliceSpace(3f);
        dataSet.setValueTextSize(10f);
        dataSet.setColors(ColorTemplate.COLORFUL_COLORS);
        chart.setEntryLabelColor(Color.WHITE);
        dataSet.setXValuePosition(PieDataSet.ValuePosition.OUTSIDE_SLICE);


        PieData data = new PieData(dataSet);
        data.setValueTextColor(Color.WHITE);


        chart.setData(data);
        chart.setDrawSliceText(false); // To remove slice text
        chart.setDrawMarkers(false); // To remove markers when click
        chart.setDrawEntryLabels(false); // To remove labels from piece of pie
        chart.getDescription().setEnabled(false); // To remove description of pie
        chart.setExtraOffsets(5, 10, 5, 5);




        chart.animateXY(500, 500);
    }


}
