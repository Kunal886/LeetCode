class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        int arr[] =new int[9];
        for(int i=0;i<9;i++){
            arr[i]=i+1;
        }

        List<List<Integer>> ll=new ArrayList<>();
        List<Integer> l=new ArrayList<>();

        combination(arr,k,n,0,0,l,ll);
        return ll;


    }
    public static void combination(int [] arr,int k,int n,int i,int ans,List<Integer> l,List<List<Integer>> ll){
         if(ans==n && l.size()==k){
            ll.add(new ArrayList<>(l));
            return;
        }
        if(i>=arr.length || ans>n || l.size()>k) return ;

        l.add(arr[i]);
        combination(arr,k,n,i+1,ans+arr[i],l,ll);

        l.remove(l.size()-1);
        combination(arr,k,n,i+1,ans,l,ll);
    }
}