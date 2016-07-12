package addmeup.anton.com.addmeup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            Button sumBtn = (Button) findViewById(R.id.sumBtn);
            final EditText fNumTxt = (EditText) findViewById(R.id.fNumTxt);
            final EditText sNumTxt = (EditText) findViewById(R.id.sNumTxt);
            final TextView displaySum = (TextView) findViewById(R.id.displaySum);

            assert sumBtn != null;
            sumBtn.setOnClickListener(
                    new Button.OnClickListener() {
                        public void onClick(View v) {
                            try {
                            float x, y;
                            float sum;

                            x = Float.parseFloat(String.valueOf(fNumTxt.getText()));
                            y = Float.parseFloat(String.valueOf(sNumTxt.getText()));
                            sum = x + y;

                            displaySum.setText(sum + "");
                            }catch(Exception e) {
                                Toast.makeText(getApplicationContext(), "Input invalid!", Toast.LENGTH_SHORT).show();
                            }
                            }

                    }
            );



    }
}
