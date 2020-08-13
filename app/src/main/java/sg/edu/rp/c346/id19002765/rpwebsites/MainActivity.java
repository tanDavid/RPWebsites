package sg.edu.rp.c346.id19002765.rpwebsites;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    Spinner spnCategory, spnSubCategory;
    Button btnGo;
    ArrayList<String> alNumbers;
    ArrayAdapter<String> aaNumbers;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spnCategory = findViewById(R.id.spinner);
        spnSubCategory = findViewById(R.id.spinner2);
        btnGo = findViewById(R.id.button);


        //Initialise the ArrayList
        alNumbers = new ArrayList<>();

        //Create an ArrayAdapter using the default Spinner layout and the ArrayList
        aaNumbers = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, alNumbers);



        //Bind the ArrayAdapter to the spinner
        spnSubCategory.setAdapter(aaNumbers);

        spnCategory.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                alNumbers.clear();
                switch (position){
                    case 0:
                        String[] strNumbers = getResources().getStringArray(R.array.subCategoryRP);
                        alNumbers.addAll(Arrays.asList(strNumbers));
                        //set Default
                        spnSubCategory.setSelection(1);
                        break;

                    case 1:
                        strNumbers = getResources().getStringArray(R.array.subCategorySOI);
                        alNumbers.addAll(Arrays.asList(strNumbers));
                        //set Default
                        spnSubCategory.setSelection(1);
                        break;
                }
                aaNumbers.notifyDataSetChanged();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pos = spnCategory.getSelectedItemPosition();
                int pos2 = spnSubCategory.getSelectedItemPosition();

                alNumbers.clear();



            }
        });



    }
}
