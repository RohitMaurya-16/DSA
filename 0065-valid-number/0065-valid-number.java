class Solution {
    public boolean isNumber(String s) {
        s = s.trim();
         
      // 123 , -123, 123.123, .123, +123, +123.123, -123.123, e-123, E-123, 123.12E ...so on 
    

      String regex="^[+-]?((\\d+\\.?\\d*)|(\\.\\d+))([eE][+-]?\\d+)?$";
        
        return s.matches(regex);
    }
}