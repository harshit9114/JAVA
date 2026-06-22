class Solution {
    public int calPoints(String[] operations) {
   ArrayList<Integer> l = new ArrayList<>();
   for(int i=0;i<operations.length;i++){
   
    if( operations[i].equals("C")){
        l.remove(l.size()-1);
    }
    else if(operations[i].equals("+")){
        int a= l.get(l.size()-1);
        int b= l.get(l.size()-2);
        l.add(a+b);
    }
    else if( operations[i].equals("D")){
        l.add(l.get((l.size()-1))*2);
    }
    else{
        l.add(Integer.parseInt(operations[i]));
    }
   }
   int total=0;
   for( int x:l){
        total+=x;
   }
   return total;
    }
}