package _9_relationship_interface;

public interface CaluateSth {
    void getKeyword();

    double getResult(double leftVal,double rightVal);

    default String getFormat(double leftVal,double rightVal){
        return null;
    }
}
