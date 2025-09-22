package daud.example.myapplication55;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private TextView tvOutput;
    private Button prs;
    private EditText hello;
    private EditText etlnput;
    private Button btngo;



    public void onClick(View v)

    {
        String st= etlnput.getText().toString();
        tvOutput.setText(st);


        Intent i=new Intent(MainActivity.this, MainActivity2.class);
        startActivity(i);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        tvOutput =findViewById(R.id. tvOutput);
        prs =findViewById(R.id. prs);
        hello =findViewById(R.id. hello);
        etlnput =findViewById(R.id. etlnput);
        btngo =findViewById(R.id. btngo);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}