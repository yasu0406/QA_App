package jp.techacademy.yasuhiro.katayama.qa_app;

import java.io.Serializable;

/**
 * Created by katayama on 2017/01/30.
 */

public class Answer implements Serializable {
    private String mBody;
    private String mName;
    private String mUid;
    private String mAnswerUid;

    public Answer(String mBody, String mName, String mUid, String mAnswerUid) {
        this.mBody = mBody;
        this.mName = mName;
        this.mUid = mUid;
        this.mAnswerUid = mAnswerUid;
    }

    public String getBody() {
        return mBody;
    }

    public void setBody(String mBody) {
        this.mBody = mBody;
    }

    public String getName() {
        return mName;
    }

    public void setName(String mName) {
        this.mName = mName;
    }

    public String getmUid() {
        return mUid;
    }

    public void setmUid(String mUid) {
        this.mUid = mUid;
    }

    public String getAnswerUid() {
        return mAnswerUid;
    }

    public void setAnswerUid(String mAnswerUid) {
        this.mAnswerUid = mAnswerUid;
    }
}
