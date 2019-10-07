import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * 입력 값 
 * @Input
0 0 0 0 0 0 0 0 0 0
0 0 0 0 1 0 0 0 0 0
0 0 0 1 1 1 0 0 0 0
0 1 1 1 1 1 1 0 0 0
0 1 1 1 1 1 1 1 1 0
0 1 1 1 1 1 1 1 1 0
0 0 1 1 1 1 1 1 0 0
0 0 0 1 1 1 1 0 0 0
0 0 0 0 1 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0
 *
 * 결과 값
 * @Output
0 0 0 0 0 0 0 0 0 0 
0 0 0 0 1 0 0 0 0 0 
0 0 0 1 2 1 0 0 0 0 
0 1 1 2 3 2 1 0 0 0 
0 1 2 3 4 3 2 1 1 0 
0 1 2 3 4 3 3 2 1 0 
0 0 1 2 3 2 2 1 0 0 
0 0 0 1 2 1 1 0 0 0 
0 0 0 0 1 0 0 0 0 0 
0 0 0 0 0 0 0 0 0 0 
 * */
public class Main {
	private static Set<String> set = new HashSet<>();
	
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	int[][] arr = new int[10][10];
    	
    	for(int i = 0; i < 10; i++) {
    		for(int j = 0; j < 10; j++) {
    			arr[i][j] = scanner.nextInt();
    		}
    	}
    	
    	boolean update = false;
    	while(true) {
    		update = dfs(arr, 0, 0);
    		if(update) {
    			set.clear();
    			continue;
    		}
    		break;
    	}
    	
    	for(int i = 0; i < 10; i++) {
    		for(int j = 0; j < 10; j++) {
    			System.out.print(arr[i][j]+" ");
    		}
    		System.out.println();
    	}
    }
    
    public static boolean checkRange(int[][] arr, int i, int j, int value) {
    	if(i < 0 || i >= arr.length || j < 0 || j >= arr.length) {
    		return false;
    	}
    	return value <= arr[i][j];
    }
    
    public static boolean dfs(int[][] arr, int i, int j) {
    	if(i < 0 || i >= arr.length || j < 0 || j >= arr.length) {
    		return false;
    	}
    	
    	if(set.contains(i+" "+j)) {
    		return false;
    	}
    	boolean update = false;
    	int value = arr[i][j];
    	set.add(i+" "+j);
    	if(value != 0) {
    		if(checkRange(arr, i - 1, j, value) &
	    		checkRange(arr, i + 1, j, value) &
	    		checkRange(arr, i, j + 1, value) &
	    		checkRange(arr, i, j - 1, value)) {
    			arr[i][j] = value + 1;
    			update = true;
    		}
    	}
    	update = update | dfs(arr, i - 1, j);
    	update = update | dfs(arr, i + 1, j);
    	update = update | dfs(arr, i, j + 1);
    	update = update | dfs(arr, i, j - 1);
    	return update;
    }
}