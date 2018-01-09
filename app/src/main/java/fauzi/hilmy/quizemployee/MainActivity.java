package fauzi.hilmy.quizemployee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etNama, etJob, etEmployer, etSalary;
    Button btnSubmit;
    TextView lblName, lblJob, lblEmployer, lblSalary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lblName = (TextView) findViewById(R.id.lblName);
        lblJob = (TextView) findViewById(R.id.lblJob);
        lblEmployer = (TextView) findViewById(R.id.lblEmployer);
        lblSalary = (TextView) findViewById(R.id.lblSalary);
        etNama = (EditText) findViewById(R.id.etNama);
        etJob = (EditText) findViewById(R.id.etJob);
        etEmployer = (EditText) findViewById(R.id.etEmployer);
        etSalary = (EditText) findViewById(R.id.etSalary);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nNama = etNama.getText().toString();
                String nJob = etJob.getText().toString();
                String nEmployer = etEmployer.getText().toString();
                String nSalary = etSalary.getText().toString();

                lblName.setText("Your Name Is: " + nNama);
                lblJob.setText("Your Job Is: " + nJob);
                lblEmployer.setText("Your Employer Is: " + nEmployer);
                lblSalary.setText("Your Salary Is: " + nSalary);

            }
        });

    }
}
