package test.controller;

import main.java.controller.IJsonDataSource;
import org.json.JSONObject;

/**
 * Created by zsolt on 5/28/17.
 */

public class JsonDataSourceMock implements IJsonDataSource {
    private final String contents;

    public JsonDataSourceMock(String JsonContents) {
        this.contents = JsonContents;
    }

    public JSONObject getJson() {
        return new JSONObject(this.contents);
    }
}
