
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] a={15, 16, 19, 20, 25, 1, 3, 4, 5, 7, 10, 14};
		System.out.println(search(a,1,0,a.length-1));

	}
	
	public static int search(int[] a, int x, int low, int high){
		if(low>high) return -1;
		int mid=(low+high)/2;
		if(x==a[mid]) return mid;
		
		
		if(a[low]<a[mid]){//left is ordered
			if(x>=a[low] && x<=a[mid]){
				return search(a,x,low,mid-1);//search left
			}else{
				return search(a,x,mid+1,high);//search right
			}
			
		}else if(a[low]>a[mid]){//right is ordered
			if(x>=a[mid]&& x<=a[high]){
				return search(a,x,mid+1,high);//search right
			}else{
				return search(a,x,low,mid-1);//search left
			}
			
		}else if(a[low]==a[mid]){//left is all repeated
			if(a[mid]!=a[high]){//if right is diff, search it
				return search(a,x,mid+1,high);
			}else{//search both side
				int result=search(a,x,low,mid-1);//search left
				if(result==-1){
					return search(a,x,mid+1,high);//search right
				}else{
					return result;
				}
			}

		}
		return -1;
	}



}
