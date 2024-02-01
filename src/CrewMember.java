public class CrewMember {

    private String fullname;
    private int crewID;
    private String department;
    int  numPromotedCrew = 0;

    public CrewMember(String inF, int inCID, String inDT){

        this.fullname = inF;
        this.crewID = inCID;
        this.department = inDT;

    }

    public String getFullName(){

        return fullname;
    }

    public int getCrewID(){

        return crewID;
    }

    public String getDepartment(){

        return department;
    }

    public String toString(){

            String fn = fullname;
            int cID = crewID;
            String d = department;

        return (fn+"\tCrewID:"+cID+"\t"+"["+department+"]");
    }


}
