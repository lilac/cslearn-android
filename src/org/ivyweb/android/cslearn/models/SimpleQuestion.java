package org.ivyweb.android.cslearn.models;

import com.j256.ormlite.field.DatabaseField;

public class SimpleQuestion {

	@DatabaseField(generatedId = true)
	int id;
	@DatabaseField(index = true)
	String content;
	
	@DatabaseField
	String key;

	SimpleQuestion() {}
	
	/**
	 * @param content
	 * @param key
	 */
	public SimpleQuestion(String content, String key) {
	    super();
	    this.content = content;
	    this.key = key;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id=").append(id);
		sb.append(", ").append("content=").append(content);
		sb.append(", ").append("key=").append(key);
		return sb.toString();
	}

	public String getContent() {
	    return content;
	}

	public void setContent(String content) {
	    this.content = content;
	}

	public String getKey() {
	    return key;
	}

	public void setKey(String key) {
	    this.key = key;
	}
}
