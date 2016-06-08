package mcpeek.kevin.supercell.beans;

import org.json.simple.JSONArray;

import java.io.Serializable;
import java.util.List;

public class MemberListJSONArray implements Serializable, MemberList {
    private JSONArray members;

    public MemberListJSONArray() {}

    public JSONArray getMembers() {
        return members;
    }

    public void setMembers(List members) {
        if (isValidJSONArray(members))
            this.members.addAll(members);
        else
            this.members = new JSONArray();
    }

    public boolean isEmpty() {
        return members.isEmpty();
    }

    private boolean isValidJSONArray(List testList) {
        if (testList instanceof JSONArray && testList != null) {
            return true;
        }
        return false;
    }
}
