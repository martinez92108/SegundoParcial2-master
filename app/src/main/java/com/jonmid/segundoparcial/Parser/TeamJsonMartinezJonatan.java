package com.jonmid.segundoparcial.Parser;

import com.jonmid.segundoparcial.Models.TeamModelMartinezJonatan;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by martinez on 17/10/17.
 */

public class TeamJsonMartinezJonatan {

    public static List<TeamModelMartinezJonatan> getData(String content) throws JSONException {


       JSONObject jsonObject = new JSONObject(content);
        JSONArray jsonArray = jsonObject.getJSONArray("teams");

        List<TeamModelMartinezJonatan> teamModelMartinezJonatanList = new ArrayList<>();


        for (int i = 0; i < jsonArray.length(); i++){

            JSONObject item = jsonArray.getJSONObject(i);

            TeamModelMartinezJonatan teamModelMartinezJonatan = new TeamModelMartinezJonatan();
            teamModelMartinezJonatan.setName(item.getString("name"));
            teamModelMartinezJonatan.setCode(item.getString("code"));
            teamModelMartinezJonatan.setCrestUrl(item.getString("crestUrl"));

            teamModelMartinezJonatanList.add(teamModelMartinezJonatan);


        }
        return teamModelMartinezJonatanList;
    }





}
