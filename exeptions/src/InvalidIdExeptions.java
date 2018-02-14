public class InvalidIdExeptions extends Exception{

    private String rc;

    public InvalidIdExeptions(String rc) {
        this.rc = rc;
    }

    @Override
    public String getMessage() {

        if (rc.charAt(6)=='/' && rc.length()==11){
            return "Incorrect lenght with '/'";
        }
        if (rc.charAt(6)=='/' && rc.length()==10){
            return "Incorrect lenght without '/'";
        }
        if ("0156".contains(String.valueOf(rc.charAt(2)))==false){
            return "Incorect form of ID, you are probably transformer";
        }
        return "Incorect form of ID";
    }



}
