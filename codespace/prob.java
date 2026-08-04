import java.util.Arrays;
class solution{
	public int removeelement(int[] nums,int val){
		int k=0;
		for(int i=0;i<nums.length;i++){
			if(nums[i] != val){
				nums[k]=nums[i];
				k++;
			}
		}
		return k;
	}
}
class prob{
	public static void main(String args[]){
		int[] nums={10,92,85,38,92,74,85};
		int val=10;
		solution ob= new solution();
		int k=ob.removeelement(nums,val);
		System.out.println(k);
		System.out.println(Arrays.toString(nums));
		
	}
}