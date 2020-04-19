package AlgStruct.dataStruc;

// write your code in Java

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * (c) Copyright 2018, Synopsys, Inc. All rights reserved worldwide.
 *
 * You may not copy this code and post it anywhere without written consent from the copyright holder.
 **/
class Solution {
    ArrayList<Important> highlights;

    /**
     * Tags used to flag important log messages.
     **/
    enum Tag {
        ERROR("ERROR"), EXCEPTION("EXCEPTION"), RESULT("RESULT");
        String tagType;

        Tag(String tagType) {
            this.tagType = tagType;
        }
    }
    /**
     * Encapsulates important log messages for further processing.
     **/
    class Important {
        Tag messageType;
        String timestamp;
        String message;

        public Important(Tag messageType, String timestamp, String message) {
            this.messageType = messageType;
            this.timestamp = timestamp;
            this.message = message;
        }

        @Override
        public String toString() {
            return messageType + " found: " + timestamp + " - " + message;
        }
    }

    public Solution() {
        highlights = new ArrayList();
    }

    public String solution(String log) {
        List<String> items = Arrays.asList(log.split("\n"));
        for(String i:items){


                List<String> splt = Arrays.asList(i.split(" - "));
                if (!splt.isEmpty() && splt.size() == 2) {
                    String timestamp = splt.get(0);
                    String message = splt.get(1);
                    if(message.startsWith("ERROR:")||message.startsWith("EXCEPTION:")||message.startsWith("RESULT:")) {
                        int index = message.indexOf(":");
                        String messageType = message.substring(0, index);
                        Important m = new Important(Tag.valueOf(messageType), timestamp, message);
                        highlights.add(m);
                        highlights.toArray();
                    }
                }
            }




        ///// DO NOT CHANGE THE CODE BELOW /////
        return formatResults();
    }

    ///// DO NOT CHANGE CODE BELOW /////
    private String formatResults() {
        String results = "{";
        for (Important item : highlights) {
            results += "'" + item + "',";
        }
        results += "}";
        return results;
    }
}
