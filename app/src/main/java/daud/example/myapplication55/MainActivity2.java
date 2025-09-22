package daud.example.myapplication55;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {
    private EditText etNum1;
    private TextView tvOp;
    private EditText etNum2;
    private Button btnMull;
    private TextView tvresult;
    private ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        etNum1 =findViewById(R.id.etNum1);
        tvOp =findViewById(R.id.tvOp);
        etNum2 =findViewById(R.id.etNum2);
        btnMull =findViewById(R.id.btnMull);
        tvresult =findViewById(R.id.tvresult);
        imageButton =findViewById(R.id.imageButton);


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void onClickGo(View v1) {
        String st = etNum1.getText().toString();
        int num1 = Integer.parseInt(st);
        String st1 = etNum2.getText().toString();
        int num2 = Integer.parseInt(st1);
        int x =num1*num2;
        tvresult.setText(x+"");
    }
    public void onClickplus(View v2) {
        String st = etNum1.getText().toString();
        int num1 = Integer.parseInt(st);
        String st1 = etNum2.getText().toString();
        int num2 = Integer.parseInt(st1);
        int y =num1+num2;
        tvresult.setText(y+"");
    }
}