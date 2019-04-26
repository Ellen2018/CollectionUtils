package com.ellen.collectionutils;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.ellen.collectionutils.collectionutil.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<Student> stringList = new ArrayList<>();
        stringList.add(new Student("周杰伦"));
        stringList.add(new Student("周杰"));
        stringList.add(new Student("伍佰"));
        stringList.add(new Student("林俊杰"));
        stringList.add(new Student("王力宏"));
        stringList.add(new Student("蔡依林"));
        stringList.add(new Student("周杰"));
        stringList.add(new Student("伍佰"));
        stringList.add(new Student("林俊杰"));
        List<List<Student>> studentList = CollectionUtils.arrange(stringList);
        Log.e("整理的个数",studentList.size()+"");
        for(List<Student> studentList1: studentList){
            for(Student student:studentList1){
                Log.e("归类整理",student.name);
            }
        }
    }
}
