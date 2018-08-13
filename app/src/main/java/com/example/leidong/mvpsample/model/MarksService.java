package com.example.leidong.mvpsample.model;

import com.example.leidong.mvpsample.bean.Marks;

/**
 * Created by Lei Dong on 2018/8/13.
 */
public class MarksService implements IMarksService{
    @Override
    public int getTotalMarks(Marks marks) {
        return marks.getPhysicsMark() + marks.getChemistryMark() + marks.getBiologyMark();
    }
}
