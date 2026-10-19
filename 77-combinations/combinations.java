class Solution {
    public List<List<Integer>> combine(int n, int k) {
        int arr[] =new int[n];
        for(int i=0;i<n;i++){
            arr[i]=i+1;
        }
      List<List<Integer>> ll=new ArrayList<>();
      List<Integer> l=new ArrayList<>();

      combination(arr,k,0,l,ll);
      return ll;

        
    }
    public static void combination(int [] arr,int k,int i,List<Integer> l,List<List<Integer>> ll ){
        if(l.size()==k){
            ll.add(new ArrayList<>(l));
            return;
        }
        if(i>=arr.length) return ;
        l.add(arr[i]);
        combination(arr,k,i+1,l,ll);

        l.remove(l.size()-1);
        combination(arr,k,i+1,l,ll);

    }
}