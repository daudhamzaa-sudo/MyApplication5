package daud.example.myapplication55;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
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

    private static final String TAG= "LifecycleLab";

    public void onClick(View v)

    {
        String st= etlnput.getText().toString();
        tvOutput.setText(st);


        Intent i=new Intent(MainActivity.this, MainActivity2.class);
        startActivity(i);
    }


    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this,"onstart",Toast.LENGTH_SHORT).show();
        Log.d(TAG,"OnStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this,"onresume",Toast.LENGTH_SHORT).show();
        Log.d(TAG,"Onresume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this,"onpause",Toast.LENGTH_SHORT).show();
        Log.d(TAG,"Onpause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this,"onstop",Toast.LENGTH_SHORT).show();
        Log.d(TAG,"Onstop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"ondestroy",Toast.LENGTH_SHORT).show();
        Log.d(TAG,"Ondestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this,"onrestart",Toast.LENGTH_SHORT).show();
        Log.d(TAG,"Onrestart");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
      getMenuInflater().inflate(R.menu.menue, menu);
return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId()==R.id.item_set)
        {

        }
        if(item.getItemId()==R.id.item_logout)
        {

        }
        return true;
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