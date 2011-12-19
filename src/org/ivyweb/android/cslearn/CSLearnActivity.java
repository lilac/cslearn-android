package org.ivyweb.android.cslearn;

import java.util.List;

import org.ivyweb.android.cslearn.models.DatabaseHelper;
import org.ivyweb.android.cslearn.models.SimpleQuestion;

import com.j256.ormlite.android.apptools.OrmLiteBaseActivity;
import com.j256.ormlite.dao.RuntimeExceptionDao;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class CSLearnActivity extends OrmLiteBaseActivity<DatabaseHelper> {
    
    private final String TAG = getClass().getSimpleName();
    
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Log.i(TAG, "creating " + getClass() + " at " + System.currentTimeMillis());
        TextView tv = new TextView(this);
        doSampleDatabaseStuff("onCreate", tv);
        setContentView(tv);
    }
    
    
	private void doSampleDatabaseStuff(String action, TextView tv) {
		// get our dao
		RuntimeExceptionDao<SimpleQuestion, Integer> simpleDao = getHelper().getSimpleQuestionDao();
		// query for all of the data objects in the database
		SimpleQuestion sq = new SimpleQuestion("Test question", "test answer");
		simpleDao.create(sq);
		List<SimpleQuestion> list = simpleDao.queryForAll();
		StringBuilder sb = new StringBuilder();
		for (SimpleQuestion question: list) {
		    sb.append(question.toString() + "\n");
		}
		tv.setText(sb.toString());
	}
}
