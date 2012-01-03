package org.ivyweb.android.cslearn.models;

import java.util.Collection;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable
public class ChoiceQuestion {
	@DatabaseField(generatedId = true)
	int id;
	@DatabaseField(index = true, canBeNull = false)
	String content;
	
	@ForeignCollectionField(eager = false)
	Collection<Choice> choices;
	
	public ChoiceQuestion() {}

	public ChoiceQuestion(String content, Collection<Choice> choices) {
		super();
		this.content = content;
		this.choices = choices;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Collection<Choice> getChoices() {
		return choices;
	}

	public void setChoices(Collection<Choice> choices) {
		this.choices = choices;
	}

	public int getId() {
		return id;
	}
	
	
}
