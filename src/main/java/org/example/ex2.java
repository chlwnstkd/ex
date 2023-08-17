package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ex2 {
    static int[] arr;
    static boolean[] visit;
    static ArrayList list;
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        arr=  new int[9];
        visit= new boolean[9];
        list= new ArrayList();
        for(int i=0;i<arr.length;i++) {
            arr[i]=sc.nextInt();
        }
        DFS(0);

    }
    static void DFS(int index) {
        if(list.size()==7) {
            int sum=0;
            for(int i=0;i<list.size();i++) {
                int a = Integer.parseInt((list.get(i)).toString());
                sum += a;
            }
            if(sum==100) {
                Collections.sort(list);
                for(int i=0;i<list.size();i++) {
                    System.out.println(list.get(i));
                }
            }
            return;
        }
        for(int i=index;i<arr.length;i++) {
            if(visit[i]==false) {
                visit[i]=true;
                list.add(arr[i]);
                DFS(i);
                visit[i]=false;
                list.remove(list.size()-1);

            }
        }
    }
}
