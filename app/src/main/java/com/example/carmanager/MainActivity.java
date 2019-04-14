package com.example.carmanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    private RecyclerView rect;
    private EditText manu, color, price, engine;
    private Button btn;
    private ArrayList<Car> list = new ArrayList<Car>();
    private int index=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rect=findViewById(R.id.rec);
        manu = findViewById(R.id.manu1);
        color = findViewById(R.id.color1);
        price = findViewById(R.id.price1);
        engine = findViewById(R.id.engine1);
        btn = findViewById(R.id.btn1);

        RecyclerView.LayoutManager manager = new LinearLayoutManager(this);
        rect.setLayoutManager(manager);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (manu.getText().toString().isEmpty())
                {
                    manu.setError("Please enter the manufacturer");
                }

                else if (color.getText().toString().isEmpty())
                {
                    color.setError("Please enter the color");
                }

                else if (price.getText().toString().isEmpty())
                {
                    price.setError("Please enter the price");
                }

                else if(engine.getText().toString().isEmpty())
                {
                    engine.setText("Please enter the engine");
                }

                else
                {
                    Car c = new Car();
                    c.setId(index);
                    c.setManufacture(manu.getText().toString());
                    c.setColor(color.getText().toString());
                    c.setPrice(Integer.parseInt(price.getText().toString()));
                    c.setEngine(Float.parseFloat(engine.getText().toString()));
                    list.add(c);

                    RecyclerAdapter adapter = new RecyclerAdapter(list);
                    rect.setAdapter(adapter);
                    index++;
                }
            }
        });
    }
}
