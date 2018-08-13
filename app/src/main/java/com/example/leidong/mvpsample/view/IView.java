package com.example.leidong.mvpsample.view;

/**
 * Created by Lei Dong on 2018/8/13.
 */
public interface IView {
    public String obtainChineseMark();

    public String obtainMathsMark();

    public String obtainEnglishMark();

    public void setTotalMark(String totalMark);
}
