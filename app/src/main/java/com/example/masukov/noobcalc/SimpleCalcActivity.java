package com.example.masukov.noobcalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.EditText;
import org.mariuszgromada.math.mxparser.*;

public class SimpleCalcActivity extends AppCompatActivity implements OnClickListener {

    private EditText mEditText;
    private Double result;
    private String s;

    private Button mButton0,mButton1,mButton2,mButton3,mButton4,
            mButton5,mButton6,mButton7,mButton8,mButton9,
            mButtonDivision,mButtonMultiplication,mButtonMinus,
            mButtonPlus,mButtonComma,mButtonEqual,mButtonC,
            mButtonLeftBracket,mButtonRightBracket,mButtonSqrt,
            mButtonDegree,mButtonFactorial,mButtonLogarithm,
            mButtonSin,mButtonCos,mButtonTan,mButtonAsin,
            mButtonAcos,mButtonAtan,mButtonPi,mButtonE,
            mButtonPercent,mButtonAbs,mButtonLn,mButtonLog2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_calc);

        mEditText = (EditText)findViewById(R.id.edit);
        mButton0 = (Button)findViewById(R.id.button_0);
        mButton1 = (Button)findViewById(R.id.button_1);
        mButton2 = (Button)findViewById(R.id.button_2);
        mButton3 = (Button)findViewById(R.id.button_3);
        mButton4 = (Button)findViewById(R.id.button_4);
        mButton5 = (Button)findViewById(R.id.button_5);
        mButton6 = (Button)findViewById(R.id.button_6);
        mButton7 = (Button)findViewById(R.id.button_7);
        mButton8 = (Button)findViewById(R.id.button_8);
        mButton9 = (Button)findViewById(R.id.button_9);
        mButtonDivision = (Button)findViewById(R.id.button_division);
        mButtonMultiplication = (Button)findViewById(R.id.button_multiplication);
        mButtonMinus = (Button)findViewById(R.id.button_minus);
        mButtonPlus = (Button)findViewById(R.id.button_plus);
        mButtonComma = (Button)findViewById(R.id.button_comma);
        mButtonLeftBracket = (Button)findViewById(R.id.button_left_bracket);
        mButtonRightBracket = (Button)findViewById(R.id.button_right_bracket);
        mButtonC =(Button)findViewById(R.id.button_c);
        mButtonSqrt = (Button)findViewById(R.id.button_sqrt);
        mButtonDegree = (Button)findViewById(R.id.button_degree);
        mButtonFactorial = (Button)findViewById(R.id.button_factorial);
        mButtonLogarithm = (Button)findViewById(R.id.button_logarithm);
        mButtonSin = (Button)findViewById(R.id.button_sin);
        mButtonCos = (Button)findViewById(R.id.button_cos);
        mButtonTan = (Button)findViewById(R.id.button_tan);
        mButtonAsin = (Button)findViewById(R.id.button_asin);
        mButtonAcos = (Button)findViewById(R.id.button_acos);
        mButtonAtan = (Button)findViewById(R.id.button_atan);
        mButtonEqual = (Button)findViewById(R.id.button_equal);
        mButtonPi = (Button)findViewById(R.id.button_pi);
        mButtonE = (Button)findViewById(R.id.button_e);
        mButtonPercent= (Button)findViewById(R.id.button_percent);
        mButtonAbs=(Button)findViewById(R.id.button_abs);
        mButtonLn=(Button)findViewById(R.id.button_ln);
        mButtonLog2=(Button)findViewById(R.id.button_log2);


        mButton0.setOnClickListener(this);
        mButton1.setOnClickListener(this);
        mButton2.setOnClickListener(this);
        mButton3.setOnClickListener(this);
        mButton4.setOnClickListener(this);
        mButton5.setOnClickListener(this);
        mButton6.setOnClickListener(this);
        mButton7.setOnClickListener(this);
        mButton8.setOnClickListener(this);
        mButton9.setOnClickListener(this);
        mButtonDivision.setOnClickListener(this);
        mButtonMultiplication.setOnClickListener(this);
        mButtonMinus.setOnClickListener(this);
        mButtonPlus.setOnClickListener(this);
        mButtonComma.setOnClickListener(this);
        mButtonLeftBracket.setOnClickListener(this);
        mButtonRightBracket.setOnClickListener(this);
        mButtonC.setOnClickListener(this);
        mButtonSqrt.setOnClickListener(this);
        mButtonDegree.setOnClickListener(this);
        mButtonFactorial.setOnClickListener(this);
        mButtonLogarithm.setOnClickListener(this);
        mButtonSin.setOnClickListener(this);
        mButtonCos.setOnClickListener(this);
        mButtonTan.setOnClickListener(this);
        mButtonAsin.setOnClickListener(this);
        mButtonAcos.setOnClickListener(this);
        mButtonAtan.setOnClickListener(this);
        mButtonEqual.setOnClickListener(this);
        mButtonPi.setOnClickListener(this);
        mButtonE.setOnClickListener(this);
        mButtonAbs.setOnClickListener(this);
        mButtonPercent.setOnClickListener(this);
        mButtonLn.setOnClickListener(this);
        mButtonLog2.setOnClickListener(this);
        mButtonC.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                mEditText.setText("");
                return true;
            }
        });
    }

    public void onClick(View v){
        switch (v.getId()) {
            case R.id.button_0:
                mEditText.setText(mEditText.getText()+"0");
                mEditText.setSelection(mEditText.getText().length());
                break;
            case R.id.button_1:
                mEditText.setText(mEditText.getText()+"1");
                mEditText.setSelection(mEditText.getText().length());
                break;
            case R.id.button_2:
                mEditText.setText(mEditText.getText()+"2");
                mEditText.setSelection(mEditText.getText().length());
                break;
            case R.id.button_3:
                mEditText.setText(mEditText.getText()+"3");
                mEditText.setSelection(mEditText.getText().length());
                break;
            case R.id.button_4:
                mEditText.setText(mEditText.getText()+"4");
                mEditText.setSelection(mEditText.getText().length());
                break;
            case R.id.button_5:
                mEditText.setText(mEditText.getText()+"5");
                mEditText.setSelection(mEditText.getText().length());
                break;
            case R.id.button_6:
                mEditText.setText(mEditText.getText()+"6");
                mEditText.setSelection(mEditText.getText().length());
                break;
            case R.id.button_7:
                mEditText.setText(mEditText.getText()+"7");
                mEditText.setSelection(mEditText.getText().length());
                break;
            case R.id.button_8:
                mEditText.setText(mEditText.getText()+"8");
                mEditText.setSelection(mEditText.getText().length());
                break;
            case R.id.button_9:
                mEditText.setText(mEditText.getText()+"9");
                mEditText.setSelection(mEditText.getText().length());
                break;
            case R.id.button_division:
                mEditText.setText(mEditText.getText()+"/");
                mEditText.setSelection(mEditText.getText().length());
                break;
            case R.id.button_multiplication:
                mEditText.setText(mEditText.getText()+"*");
                mEditText.setSelection(mEditText.getText().length());
                break;
            case R.id.button_minus:
                mEditText.setText(mEditText.getText()+"-");
                mEditText.setSelection(mEditText.getText().length());
                break;
            case R.id.button_plus:
                mEditText.setText(mEditText.getText()+"+");
                mEditText.setSelection(mEditText.getText().length());
                break;
            case R.id.button_comma:
                mEditText.setText(mEditText.getText()+".");
                mEditText.setSelection(mEditText.getText().length());
                break;
            case R.id.button_left_bracket:
                mEditText.setText(mEditText.getText()+"(");
                mEditText.setSelection(mEditText.getText().length());
                break;
            case R.id.button_right_bracket:
                mEditText.setText(mEditText.getText()+")");
                mEditText.setSelection(mEditText.getText().length());
                break;
            case R.id.button_c:
                if(mEditText.getText().length()!=0) {
                    s = mEditText.getText().toString().substring(0, mEditText.getText().length() - 1);
                    mEditText.setText(s);
                }
                mEditText.setSelection(mEditText.getText().length());
                break;

            case R.id.button_sqrt:
                mEditText.setText(mEditText.getText()+"sqrt(");
                mEditText.setSelection(mEditText.getText().length());
                break;
            case R.id.button_degree:
                mEditText.setText(mEditText.getText()+"^");
                mEditText.setSelection(mEditText.getText().length());
                break;
            case R.id.button_factorial:
                mEditText.setText(mEditText.getText()+"!");
                mEditText.setSelection(mEditText.getText().length());
                break;
            case R.id.button_logarithm:
                mEditText.setText(mEditText.getText()+"log10(");
                mEditText.setSelection(mEditText.getText().length());
                break;
            case R.id.button_sin:
                mEditText.setText(mEditText.getText()+"sin(");
                mEditText.setSelection(mEditText.getText().length());
                break;
            case R.id.button_cos:
                mEditText.setText(mEditText.getText()+"cos(");
                mEditText.setSelection(mEditText.getText().length());
                break;
            case R.id.button_tan:
                mEditText.setText(mEditText.getText()+"tan(");
                mEditText.setSelection(mEditText.getText().length());
                break;
            case R.id.button_asin:
                mEditText.setText(mEditText.getText()+"asin(");
                mEditText.setSelection(mEditText.getText().length());
                break;
            case R.id.button_acos:
                mEditText.setText(mEditText.getText()+"acos(");
                mEditText.setSelection(mEditText.getText().length());
                break;
            case R.id.button_atan:
                mEditText.setText(mEditText.getText()+"atan(");
                mEditText.setSelection(mEditText.getText().length());
                break;
            case R.id.button_equal:
                Expression x = new Expression(mEditText.getText().toString());
                result=x.calculate();
                mEditText.setText(result.toString());
                mEditText.setSelection(mEditText.getText().length());
                break;
            case R.id.button_pi:
                mEditText.setText(mEditText.getText()+"pi");
                mEditText.setSelection(mEditText.getText().length());
                break;
            case R.id.button_e:
                mEditText.setText(mEditText.getText()+"e");
                mEditText.setSelection(mEditText.getText().length());
                break;
            case R.id.button_percent:
                mEditText.setText(mEditText.getText()+"%");
                mEditText.setSelection(mEditText.getText().length());
                break;
            case R.id.button_abs:
                mEditText.setText(mEditText.getText()+"abs(");
                mEditText.setSelection(mEditText.getText().length());
                break;
            case R.id.button_ln:
                mEditText.setText(mEditText.getText()+"ln(");
                mEditText.setSelection(mEditText.getText().length());
                break;
            case R.id.button_log2:
                mEditText.setText(mEditText.getText()+"log2(");
                mEditText.setSelection(mEditText.getText().length());
                break;
        }
    }
}
