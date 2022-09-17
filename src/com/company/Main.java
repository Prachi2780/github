package com.company;
import java.util.*;
// beautiful matrix codeforces
public class Main
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int[][] arr=new int[5][5];
        for(int i1=0;i1<5;i1++)
        {
            for(int j1=0;j1<5;j1++)
            {
                arr[i1][j1]=s.nextInt();
            }
        }
        System.out.println(index(arr));
    }


    static int index(int[][] arr)
    {
        int max=0;
        int c=0;
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {

                if(arr[i][j]>max)
                {
                    c=Math.abs(2-i)+Math.abs(2-j);
                    break;
                }
            }
        }
        return c;
    }
}
