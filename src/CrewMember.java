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
}