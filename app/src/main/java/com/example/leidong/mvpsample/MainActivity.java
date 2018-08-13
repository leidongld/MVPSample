package com.example.leidong.mvpsample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.leidong.mvpsample.presenter.IPresenter;
import com.example.leidong.mvpsample.presenter.Presenter;
import com.example.leidong.mvpsample.view.IView;

public class MainActivity extends AppCompatActivity implements IView{
    private EditText mEtInput1, mEtInput2, mEtInput3;
    private Button mBtSubmit;
    private TextView mTvContent;

    private IPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new Presenter(this);

        initWidgets();

        initActions();
    }

    private void initActions() {
        mBtSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.obtainTotalMark();
            }
        });
    }

    private void initWidgets() {
        mEtInput1 = findViewById(R.id.et_input1);
        mEtInput2 = findViewById(R.id.et_input2);
        mEtInput3 = findViewById(R.id.et_input3);
        mBtSubmit = findViewById(R.id.bt_submit);
        mTvContent = findViewById(R.id.tv_content);
    }

    @Override
    public String obtainChineseMark() {
        return mEtInput1.getText().toString();
    }

    @Override
    public String obtainMathsMark() {
        return mEtInput2.getText().toString();
    }

    @Override
    public String obtainEnglishMark() {
        return mEtInput3.getText().toString();
    }

    @Override
    public void setTotalMark(String totalMark) {
        mTvContent.setText(totalMark);
    }
}
