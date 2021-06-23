
public class CheckifAlltheIntegersinaRangeAreCovered {
	public static void main(String[] args) {
		int[][] ranges = {{1,10},{10,20}};
		int left = 21;
		int right = 21;
		boolean ans = true;
		for(int i = 0; i < ranges.length; i++) {
			
				if((ranges[i][0] >= left || ranges[i][1] <= left) && (ranges[i][0] >= right || ranges[i][1] <= right))continue;
				else {
					ans = false;
					break;
				}
			
		}
		System.out.println(ans);
	}
}
