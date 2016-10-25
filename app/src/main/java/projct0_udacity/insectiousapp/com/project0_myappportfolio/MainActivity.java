package projct0_udacity.insectiousapp.com.project0_myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button b1, b2, b3, b4, b5, b6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=(Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b2);
        b3=(Button)findViewById(R.id.b3);
        b4=(Button)findViewById(R.id.b4);
        b5=(Button)findViewById(R.id.b5);
        b6=(Button)findViewById(R.id.b6);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.b1:
                Toast.makeText(this, "POPULAR MOVIES", Toast.LENGTH_SHORT).show();
                break;
            case R.id.b2:
                Toast.makeText(this, "STOCK HAWK", Toast.LENGTH_SHORT).show();
                break;
            case R.id.b3:
                Toast.makeText(this, "BUILD IT BIGGER", Toast.LENGTH_SHORT).show();
                break;
            case R.id.b4:
                Toast.makeText(this, "MAKE YOUR APP MATERIAL", Toast.LENGTH_SHORT).show();
                break;
            case R.id.b5:
                Toast.makeText(this, "GO UBIQUITOUS", Toast.LENGTH_SHORT).show();
                break;
            case R.id.b6:
                Toast.makeText(this, "CAPSTONE", Toast.LENGTH_SHORT).show();
                break;
        }

    }
}
