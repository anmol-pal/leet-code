package gfg;

import javax.rmi.ssl.SslRMIClientSocketFactory;

public class Solution {
    int binarysearch(int arr[], int n, int k) {
        int high=n-1, low=0, mid;
        mid=(high+low)/2;
        if(arr[mid]==k){
            return mid;
        }
        else if(k>arr[mid]){
        int arr1[]=new int[mid-1];
        for(int i=0; i<mid-1;i++){
            arr1[i]=arr[mid+1+i];
            System.out.println(arr1[i]+" "+arr[mid+i+1]);
        }
        return binarysearch(arr1,mid,k)+mid;
        }
        else if(k<arr[mid]){
            System.out.println("Here");
            return binarysearch(arr, mid, k);
        }

        return -1;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {0,1,2,3,4,5,6,7,8,9,10};
//        sol.binarysearch(arr,11,10);
        System.out.println(sol.binarysearch(arr,11,8));
    }
    }
