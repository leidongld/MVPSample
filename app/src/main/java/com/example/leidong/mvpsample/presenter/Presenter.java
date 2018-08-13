package com.example.leidong.mvpsample.presenter;

import com.example.leidong.mvpsample.bean.Marks;
import com.example.leidong.mvpsample.model.IMarksService;
import com.example.leidong.mvpsample.model.MarksService;
import com.example.leidong.mvpsample.view.IView;

/**
 * Created by Lei Dong on 2018/8/13.
 */
public class Presenter implements IPresenter {
    private IView view;

    public Presenter(IView view) {
        this.view = view;
    }

    @Override
    public void obtainTotalMark() {
        int chineneMark = Integer.parseInt(view.obtainChineseMark());
        int mathsMark = Integer.parseInt(view.obtainMathsMark());
        int englishMark = Integer.parseInt(view.obtainEnglishMark());

        IMarksService service = new MarksService();
        Marks marks = new Marks();
        marks.setPhysicsMark(90);
        marks.setChemistryMark(70);
        marks.setBiologyMark(80);
        int totalMark1 = service.getTotalMarks(marks);
        int totalMark2 = (totalMark1 + chineneMark + mathsMark + englishMark);
        view.setTotalMark("6门总分为： " + String.valueOf(totalMark2));
    }
}
