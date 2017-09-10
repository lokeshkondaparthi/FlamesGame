package com.example.welcome.flamesgame;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText etYourName,etDearName;
    private Button btCalculate;
    private TextView tvResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etYourName = (EditText) findViewById(R.id.etYourName);
        etDearName = (EditText) findViewById(R.id.etDear);
        btCalculate = (Button) findViewById(R.id.btCalculate);
        tvResult = (TextView) findViewById(R.id.tvResult);

        btCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mYourName  = etYourName.getText().toString();
                String mDearName  = etDearName.getText().toString();
                String mNotCommonChars = "";
                String commonChars = "";
                for (int i = 0; i < mYourName.length(); i++)
                {
                    char ch = mYourName.charAt(i);
                    if (mDearName.indexOf(ch) != -1) {
                        commonChars = commonChars + ch;
                    }else{
                        mNotCommonChars = mNotCommonChars+ch;
                    }
                }
                char mResult  = getLetterFromWords(mNotCommonChars.length());
                switch (mResult) {
                    case 'f':
                        tvResult.setText("Friend");
                        break;
                    case 'l':
                        tvResult.setText("Lover");
                        break;
                    case 'a':
                        tvResult.setText("Anger");
                        break;
                    case 'm':
                        tvResult.setText("Marriage");
                        break;
                    case 'e':
                        tvResult.setText("Enemy");
                        break;
                    case 's':
                        tvResult.setText("Sister");
                        break;
                }
            }

            private char getLetterFromWords(int length) {
                switch (length) {
                    case 1:
                        return 's';

                    case 2:
                        return 'e';

                    case 3:
                        return 'f';

                    case 4:
                        return 'e';

                    case 5:
                        return 'f';

                    case 6:
                        return 'm';

                    case 7:
                        return 'e';

                    case 8:
                        return 'a';

                    case 9:
                        return 'e';

                    case 10:
                        return 'l';
                    default:return 'l';
                }
            }
        });

    }
}
