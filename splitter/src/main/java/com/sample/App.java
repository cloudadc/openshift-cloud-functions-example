package com.sample;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class App {

    public static JsonObject main(JsonObject args) {
        JsonObject response = new JsonObject();
        String text = null;
        if (args.has("text")) {
            text = args.getAsJsonPrimitive("text").getAsString();
        }
        String[] results = new String[] { text };
        if (text != null && text.indexOf(",") != -1) {
            results = text.split(",");
        }
        JsonArray splitStrings = new JsonArray();
        for (String var : results) {
            splitStrings.add(var);
        }
        response.add("result", splitStrings);
        return response;
    }

}
