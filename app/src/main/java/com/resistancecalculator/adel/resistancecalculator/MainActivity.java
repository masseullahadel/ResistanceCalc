package com.resistancecalculator.adel.resistancecalculator;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.graphics.Color;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.os.Build;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
    }

    public void fiveBands(View v) {
        // Do something in response to button
        Intent intent = new Intent(this, FiveBandsActivity.class);
        startActivity(intent);
    }

    public static class PlaceholderFragment extends Fragment {
        public String[] resistance = {"0","0","1","0"};


        TextView resistanceLabel;
        TextView resistanceLabel2;
        Paint paint;
        Canvas canvas;
        ImageView iView;


        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {

            View rootView = inflater.inflate(R.layout.fragment_main, container, false);

            resistanceLabel = (TextView) rootView.findViewById(R.id.resistanceLabel);
            resistanceLabel2 = (TextView) rootView.findViewById(R.id.resistanceLabel2);

            Bitmap bitMap = Bitmap.createBitmap(150, 100, Bitmap.Config.ARGB_8888);  //creates bmp
            bitMap = bitMap.copy(bitMap.getConfig(), true);     //lets bmp to be mutable
            canvas = new Canvas(bitMap);                 //draw a canvas in defined bmp
            paint = new Paint(Paint.ANTI_ALIAS_FLAG);


            final Button band1Black = (Button)rootView.findViewById(R.id.buttonBand1Black);
            Button band1Gray = (Button)rootView.findViewById(R.id.buttonBand1Gray);
            Button band1Red = (Button)rootView.findViewById(R.id.buttonBand1Red);
            Button band1Orange = (Button)rootView.findViewById(R.id.buttonBand1Orange);
            Button band1Yellow = (Button)rootView.findViewById(R.id.buttonBand1Yellow);
            Button band1Green = (Button)rootView.findViewById(R.id.buttonBand1Green);
            Button band1Blue = (Button)rootView.findViewById(R.id.buttonBand1Blue);
            Button band1Purple = (Button)rootView.findViewById(R.id.buttonBand1Purple);
            Button band1White = (Button)rootView.findViewById(R.id.buttonBand1White);
            Button band1Brown = (Button)rootView.findViewById(R.id.buttonBand1Brown);
            Button band2Black = (Button)rootView.findViewById(R.id.buttonBand2Black);
            Button band2Gray = (Button)rootView.findViewById(R.id.buttonBand2Gray);
            Button band2Red = (Button)rootView.findViewById(R.id.buttonBand2Red);
            Button band2Orange = (Button)rootView.findViewById(R.id.buttonBand2Orange);
            Button band2Yellow = (Button)rootView.findViewById(R.id.buttonBand2Yellow);
            Button band2Green = (Button)rootView.findViewById(R.id.buttonBand2Green);
            Button band2Blue = (Button)rootView.findViewById(R.id.buttonBand2Blue);
            Button band2Purple = (Button)rootView.findViewById(R.id.buttonBand2Purple);
            Button band2White = (Button)rootView.findViewById(R.id.buttonBand2White);
            Button band2Brown = (Button)rootView.findViewById(R.id.buttonBand2Brown);

            Button band3Black = (Button)rootView.findViewById(R.id.buttonBand3Black);
            Button band3Gold = (Button)rootView.findViewById(R.id.buttonBand3Gold);
            Button band3Red = (Button)rootView.findViewById(R.id.buttonBand3Red);
            Button band3Orange = (Button)rootView.findViewById(R.id.buttonBand3Orange);
            Button band3Yellow = (Button)rootView.findViewById(R.id.buttonBand3Yellow);
            Button band3Green = (Button)rootView.findViewById(R.id.buttonBand3Green);
            Button band3Blue = (Button)rootView.findViewById(R.id.buttonBand3Blue);
            Button band3Purple = (Button)rootView.findViewById(R.id.buttonBand3Purple);
            Button band3Silver = (Button)rootView.findViewById(R.id.buttonBand3Silver);
            Button band3Brown = (Button)rootView.findViewById(R.id.buttonBand3Brown);
            Button band3White = (Button)rootView.findViewById(R.id.buttonBand3White);
            Button band3Gray = (Button)rootView.findViewById(R.id.buttonBand3Gray);


            Button band4Gold = (Button)rootView.findViewById(R.id.buttonBand4Gold);
            Button band4Red = (Button)rootView.findViewById(R.id.buttonBand4Red);
            Button band4Gray = (Button)rootView.findViewById(R.id.buttonBand4Gray);
            Button band4Green = (Button)rootView.findViewById(R.id.buttonBand4Green);
            Button band4Blue = (Button)rootView.findViewById(R.id.buttonBand4Blue);
            Button band4Purple = (Button)rootView.findViewById(R.id.buttonBand4Purple);
            Button band4Silver = (Button)rootView.findViewById(R.id.buttonBand4Silver);
            Button band4Brown = (Button)rootView.findViewById(R.id.buttonBand4Brown);

            //Button fiveBands = (Button)rootView.findViewById(R.id.buttonFiveBands);

            band1Black.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {
                    resistanceBand1("0", Color.BLACK);
                }
            });
            band1Brown.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    int brown = getResources().getColor(R.color.brown);
                    resistanceBand1("1", brown);
                }
            });
            band1Red.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v){
                    resistanceBand1("2", Color.RED);

                }
            });
            band1Orange.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {
                    int orange = getResources().getColor(R.color.orange);
                    resistanceBand1("3",orange);
                }
            });
            band1Yellow.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {
                    resistanceBand1("4", Color.YELLOW);

                }
            });
            band1Green.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {
                    int green = getResources().getColor(R.color.green);
                    resistanceBand1("5", green);

                }
            });
            band1Blue.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {
                    resistanceBand1("6", Color.BLUE);

                }
            });
            band1Purple.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {
                    int purple = getResources().getColor(R.color.purple);
                    resistanceBand1("7", purple);

                }
            });
            band1Gray.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {
                    int gray = getResources().getColor(R.color.gray);
                    resistanceBand1("8", gray);

                }
            });
            band1White.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {
                    int white = getResources().getColor(R.color.white);
                    resistanceBand1("9", white);

                }
            });

            band2Black.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {
                    resistanceBand2("0", Color.BLACK);

                }
            });
            band2Brown.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    int brown = getResources().getColor(R.color.brown);
                    resistanceBand2("1", brown);

                }
            });
            band2Red.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {
                    resistanceBand2("2", Color.RED);

                }
            });
            band2Orange.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {
                    int orange = getResources().getColor(R.color.orange);
                    resistanceBand2("3", orange);

                }
            });
            band2Yellow.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {
                    resistanceBand2("4", Color.YELLOW);

                }
            });
            band2Green.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {
                    int green = getResources().getColor(R.color.green);
                    resistanceBand2("5", green);
                }
            });
            band2Blue.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {
                    resistanceBand2("6", Color.BLUE);

                }
            });
            band2Purple.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {
                    int purple = getResources().getColor(R.color.purple);
                    resistanceBand2("7", purple);

                }
            });
            band2Gray.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {
                    int gray = getResources().getColor(R.color.gray);
                    resistanceBand2("8", gray);
                }
            });
            band2White.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {
                    int white = getResources().getColor(R.color.white);
                    resistanceBand2("9", white);
                }
            });

            band3Black.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {
                    resistanceBand3("1", Color.BLACK);
                }
            });
            band3Brown.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {
                    int brown = getResources().getColor(R.color.brown);
                    resistanceBand3("10", brown);
                }
            });
            band3Red.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {
                    resistanceBand3("100", Color.RED);
                }
            });
            band3Orange.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {
                    int orange = getResources().getColor(R.color.orange);
                    resistanceBand3("1000", orange);
                }
            });
            band3Yellow.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {
                    resistanceBand3("10000", Color.YELLOW);
                }
            });
            band3Green.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {
                    int green = getResources().getColor(R.color.green);
                    resistanceBand3("100000", green);
                }
            });
            band3Blue.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {
                    resistanceBand3("1000000", Color.BLUE);
                }
            });
            band3Purple.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {
                    int purple = getResources().getColor(R.color.purple);
                    resistanceBand3("10000000", purple);
                }
            });

            band3Gray.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {
                    resistanceBand3("100000000", Color.GRAY);
                }
            });
            band3White.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {
                    resistanceBand3("1000000000", Color.WHITE);
                }
            });

            band3Gold.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {
                    int gold = getResources().getColor(R.color.gold);
                    resistanceBand3("0.1", gold);
                }
            });
            band3Silver.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {
                    int silver = getResources().getColor(R.color.silver);
                    resistanceBand3("0.01", silver);
                }
            });

            band4Brown.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {
                    int brown = getResources().getColor(R.color.brown);
                    resistanceBand4("1", brown);
                }
            });
            band4Red.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    resistanceBand4("2", Color.RED);
                }
            });
            band4Green.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {
                    int green = getResources().getColor(R.color.green);
                    resistanceBand4("0.5", green);
                }
            });
            band4Blue.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {
                    resistanceBand4("0.25", Color.BLUE);
                }
            });
            band4Purple.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {
                    int purple = getResources().getColor(R.color.purple);
                    resistanceBand4("0.10", purple);
                }
            });
            band4Gray.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {
                    int gray = getResources().getColor(R.color.gray);
                    resistanceBand4("0.05", gray);
                }
            });
            band4Gold.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {
                    int gold = getResources().getColor(R.color.gold);
                    resistanceBand4("5", gold);
                }
            });
            band4Silver.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    int silver = getResources().getColor(R.color.silver);
                    resistanceBand4("10", silver);
                }
            });


            iView = (ImageView) rootView.findViewById(R.id.resistorCanvas);
            iView.setImageBitmap(bitMap);
            //changed set image resource to set image background resource
            iView.setBackgroundResource(R.drawable.resistor);


            return rootView;
        }


        public void resistanceBand1(String resistanceVal, int colorVal){
            resistance[0] = resistanceVal;
            paint.setColor(colorVal);
            canvas.drawRect(5, 91, 25, 9, paint);
            iView.invalidate();
            calcResistance();
        }
        public void resistanceBand2(String resistanceVal, int colorVal){
            resistance[1] = resistanceVal;
            paint.setColor(colorVal);
            canvas.drawRect(45, 91, 65, 9, paint);
            iView.invalidate();
            calcResistance();
        }
        public void resistanceBand3(String resistanceVal, int colorVal){
            resistance[2] = resistanceVal;
            paint.setColor(colorVal);
            canvas.drawRect(85, 91, 105, 9, paint);
            iView.invalidate();
            calcResistance();
        }
        public void resistanceBand4(String resistanceVal, int colorVal) {
            resistance[3] = resistanceVal;
            paint.setColor(colorVal);
            canvas.drawRect(125, 91, 145, 9, paint);
            iView.invalidate();
            calcResistance();
        }
        public void calcResistance(){
            double resistanceValue = 0;
            String digit = "";
            String output = "";

            digit = resistance[0] + resistance[1];

            resistanceValue = Math.round((Float.valueOf(digit) * Float.valueOf(resistance[2]) * 100.0)) / 100.0;

            output = convertOutput(resistanceValue);
            if(resistance[3]!="0")
                calcUnc(resistanceValue);

            resistanceLabel.setText(output + "\u03A9" + " \u00b1 " + resistance[3] + "\u0025");
        }

        public String convertOutput(double resistanceValue) {
            String output = "";

            if (resistanceValue > 999 && resistanceValue <= 999999) {
                resistanceValue = Math.round((resistanceValue / 1000.0) * 100.0) / 100.0;
                output = String.valueOf(resistanceValue) + "k";
            } else if (resistanceValue > 999999 && resistanceValue <= 999999999) {
                resistanceValue = Math.round((resistanceValue / 1000000.0) * 100.0) / 100.0;
                output = String.valueOf(resistanceValue) + "M";
            }
            else if(resistanceValue > 999999999) {
                resistanceValue = Math.round((resistanceValue / 1000000000.0)*100.0)/100.0;
                output = String.valueOf(resistanceValue) + "G";
            }
            else {
                resistanceValue = Math.round(resistanceValue*100.0)/100.0;
                output = String.valueOf(resistanceValue);
            }
            return output;
        }

        public void calcUnc(double resistanceVal){
            double minValue = 0;
            double maxValue = 0;

            minValue = resistanceVal - resistanceVal * 0.01 * Float.valueOf(resistance[3]);
            maxValue = resistanceVal + resistanceVal * 0.01 * Float.valueOf(resistance[3]);

            String uncertaintyMin = convertOutput(minValue);
            String uncertaintyMax = convertOutput(maxValue);

            resistanceLabel2.setText(uncertaintyMin + "\u03A9" + " - " + uncertaintyMax + "\u03A9");

        }
    }
}