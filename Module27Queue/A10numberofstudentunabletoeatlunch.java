package Module27Queue;

public class A10numberofstudentunabletoeatlunch {

    public int countstudent(int[] student, int[] sandwiches){
        int ones = 0;
        int zeroes = 0;

        for(int stud : student){
            if (stud == 0) {
                zeroes++;
            }else{
                ones++;
            }
        }

        for(int sandwich : sandwiches){
            if (sandwich == 0) {
                if (zeroes == 0) {
                    return ones;
                }else{
                    zeroes--;
                }
            }else if (sandwich == 1) {
                if (ones == 0) {
                    return zeroes;
                }else{
                    ones--;
                }
            }
        }
        return 0;
    } 
    
    public static void main(String[] args) {
        A10numberofstudentunabletoeatlunch obj = new A10numberofstudentunabletoeatlunch();
        int[] student = {1, 1, 0, 0};
        int[] sandwiches = {0, 1, 0, 0,0,0,0,0,0,0,0,0,1};
        int result = obj.countstudent(student, sandwiches);
        System.out.println(result);
    }
}