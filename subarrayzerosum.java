import java.util.*;

public class subarrayzerosum {
    public static List<List<Integer>> zerosum(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        Map<Integer, List<Integer>> hm = new HashMap<>();
        
        // Initialize the hashmap with sum 0 at index -1
        hm.put(0, new ArrayList<>());
        hm.get(0).add(-1);

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            // If sum exists in the map, subarrays with zero sum exist
            if (hm.containsKey(sum)) {
                for (int value : hm.get(sum)) {
                    List<Integer> ans = new ArrayList<>();
                    for (int k = value + 1; k <= i; k++) {  // Fix loop condition
                        ans.add(arr[k]);
                    }
                    result.add(ans);
                }
            }

            // Store the sum in hashmap
            hm.putIfAbsent(sum, new ArrayList<>());
            hm.get(sum).add(i);
        }
        
        return result;  // Return the list of subarrays
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the array size: ");
        int n = sc.nextInt();
        
        System.out.print("Enter the array elements: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Call zerosum method and print the result
        List<List<Integer>> subarrays = zerosum(arr);

        if (subarrays.isEmpty()) {
            System.out.println("No subarray with zero sum found.");
        } else {
            System.out.println("Subarrays with zero sum:");
            for (List<Integer> subarray : subarrays) {
                System.out.println(subarray);
            }
        }
        
        sc.close();
    }
}
