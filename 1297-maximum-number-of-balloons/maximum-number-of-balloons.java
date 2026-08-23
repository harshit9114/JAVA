class Solution {
    public int maxNumberOfBalloons(String text) {
              HashMap<Character,Double> map = new HashMap<>();
        map.put('b',0.0);
         map.put('a',0.0);
          map.put('l',0.0);
           map.put('o',0.0);
            map.put('n',0.0);
      for(int i=0;i<text.length();i++){
        if(text.charAt(i)=='b'||text.charAt(i)=='a'||text.charAt(i)=='n'){
        map.put(text.charAt(i),map.getOrDefault(text.charAt(i),0.0)+1.0);
      }
        else if(text.charAt(i)=='l'|| text.charAt(i)=='o'){
        map.put(text.charAt(i),map.getOrDefault(text.charAt(i),0.0)+.5);
      }
      else if(text.charAt(i)!='b'||text.charAt(i)!='a'||text.charAt(i)!='n'||text.charAt(i)!='l'|| text.charAt(i)!='o' ){
        continue;
      }
      }
      Double max=-1.0;
      Double min=10000.0;
      for(Double x: map.values()){
        max=Math.max(max,x);
        min=Math.min(min,x);
      }
      if(max==min) return max.intValue();
      
return  min.intValue();
        }
        
    }
