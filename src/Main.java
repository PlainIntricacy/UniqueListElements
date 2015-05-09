import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the list of integers:");
        String[] parts = input.nextLine().split(",");
        input.close();
        List<String> nums = new ArrayList<String>();
        for (String i : parts) {
            nums.add(i);
        }
        List<String> finaList = new ArrayList<String>();
        HashSet<String> hset = new HashSet<String>();
        for(String i:nums){
            if(!hset.contains(i)){
                finaList.add(i);
                hset.add(i);
            }
        }
        finaList.sort(new Comparator<String>() {
            public int compare(String a, String b) {
                if(Integer.parseInt(a)<Integer.parseInt(b)){
                    return -1;
                }
                return 0;
            }
        });
        System.out.println("Unique elements in given list:");
        for (String j : finaList) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
