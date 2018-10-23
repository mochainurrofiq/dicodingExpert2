package learning.rofiq.com.dicodingexpert2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class activityWithObject extends AppCompatActivity {
    public static String EXTRA_PERSON = "extra_person";
    private TextView tvObject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_with_object);

        tvObject = (TextView)findViewById(R.id.tv_data_received);
        Person mPerson = getIntent().getParcelableExtra(EXTRA_PERSON);
        String text = "Name : " +mPerson.getName()+ "Email : " +mPerson.getEmail()+ "Age : " +mPerson.getAge()+
                "Location : " +mPerson.getCity();
        tvObject.setText(text);
    }
}
