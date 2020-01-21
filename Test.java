class Solution {
    public boolean isPerfectSquare(int num) {
        num-=1;
        int i=1;
        while(num>0){
            i+=2;
            num-=i;
        }
        return 0==num;
    }
}

class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1){
            return true;
        }
        int l=1;
        int r=num>>>1;
        while(l<=r){
            int mid=(l+r)>>>1;
            if(mid==num/mid&&num%mid==0){
                return true;
            }else if(mid>num/mid||(mid==num/mid&&num%mid!=0)){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return false;
    }
}

class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0;
        int j=0;
        while(i<s.length()&&j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
                j++;
            }else{
                j++;
            }
        }
        return i==s.length();
    }
}


class Solution {
    public int arrangeCoins(int n) {
        int i=0;
        int count=0;
        while(n>0){
           i++;
           n-=i;
           if(n>=0){
               count++;
           }
        }
        return count;
    }
}

class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(houses);
        Arrays.sort(heaters);
        int j=0;
        int res=0;
        for(int i=0;i<houses.length;i++){
            while(j<heaters.length&&houses[i]>heaters[j]){
                j++;
            }
            if(j==0){
                res=Math.max(res,heaters[0]-houses[i]);
            }else if(j>=heaters.length){
                res=Math.max(res,houses[houses.length-1]-heaters[heaters.length-1]);
            }else{
                res=Math.max(res,Math.min(houses[i]-heaters[j-1],heaters[j]-houses[i]));
            }
        }
        return res;
    }
}

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int[] arr=new int[letters.length];
        for(int i=0;i<letters.length;i++){
            arr[i]=letters[i]-'a';
        }
        int num=target-'a';
        int l=0;
        int r=letters.length-1;
        while(l<r){
            int mid=(l+r)>>>1;
            if(arr[mid]>num){
                r=mid;
            }else{
                l=mid+1;
            }
        }
        return letters[l]-target>0?letters[l]:letters[0];
    }
}

class Solution {
    public int peakIndexInMountainArray(int[] A) {
        int l=0;
        int r=A.length-1;
        while(l<r){
            int mid=(l+r+1)>>>1;
            if(A[mid]>A[mid-1]){
                l=mid;
            }else{
                r=mid-1;
            }
        }
        return l;
    }
}

